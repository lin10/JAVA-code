package com.onezero.code;

import java.util.Arrays;

public class LargestNumber179 {

    /**
     *  给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
     *  注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
     *
     *  思路：字符串的比较排序
     */

    public  static String largestNumber(int[] nums) {
        if(nums.length<1) return "";
        String s1,s2;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1;j++){
                s1 = String.valueOf(nums[j]);
                s2 = String.valueOf(nums[j+1]);
                if((s1+s2).compareTo(s2+s1)<0){
                    int tmp=nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int n:nums){
            sb.append(n);
        }
        String resStr = sb.toString();
        if(sb.charAt(0)=='0') return "0";
        return resStr;
    }

    public static void main(String[] args){
        int[] arr = {10,2};
        System.out.println(largestNumber(arr));
    }
}
