package com.onezero.code;

import java.util.Arrays;

public class ArrayPairSum561 {

    /**
     * 给定长度为 2n 的整数数组 nums ，你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从 1 到 n 的 min(ai, bi) 总和最大。
     * 返回该 最大总和 。
     * 思路： 总和最大，则应是将数组排序好后，第2N-1和元素的总和
     *
     * @param nums 数组
     * @return 返回总和
     */
    private static int arrayPairSum(int[] nums){
        int tmp=0;
        //冒泡排序
        for(int i=0;i<nums.length;i++){
            for(int j=0; j<i;j++){
                if(nums[i]<=nums[j]){
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        int k=0;
        int sum=0;
        while(k<nums.length){
            sum+=nums[k];
            k+=2;
        }
        return sum;
    }

    public static void main(String[] args){
        int[] arr = {1,4,3,2};
        System.out.println(arrayPairSum(arr));
    }
}
