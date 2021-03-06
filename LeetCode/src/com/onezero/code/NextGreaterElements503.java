package com.onezero.code;

import java.util.Arrays;

public class NextGreaterElements503 {

    /**
     * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。
     * 数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，
     * 这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1。
     *
     * 输入: [1,2,1,3,2,9,4]
     * 输入: [2,3,3,9,9,-1,9]
     *
     */

    private static int[] nextGreaterElements(int[] nums) {
        int numsLen = nums.length;
        int[] arr=new int[numsLen];
        int[] tmpArr=new int[2*numsLen];
        for(int i=0;i<2*numsLen;i++){
            tmpArr[i]=(i<numsLen)?nums[i]:nums[i-numsLen];
            if(i<numsLen) arr[i]=nums[i];
        }
        int i=0;
        boolean flag=true;
        while(i<numsLen){
            for(int j=i;j<i+numsLen;j++){
                if(tmpArr[j]>nums[i]){
                    arr[i]=tmpArr[j];
                    break;
                }
            }
            if(arr[i]==nums[i]){
                arr[i]=-1;
            }
            i++;

        }
        return arr;
    }

    public static void main(String[] args){
        int[] nums = {1,2,1,3,2,9,4};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
}
