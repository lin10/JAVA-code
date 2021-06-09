package com.onezero.code;

public class MaxSubArray53 {

    /**
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * 思路：从头开始累加数组的元素，如果前N个元素和为负数时，这时候应该重新开始计算
     */

    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int sum=0;
        for(int num:nums){
            if(sum>0){
                sum+=num;
            }else{
                sum=num;
            }
            res=Math.max(res,sum);
        }
        return res;
    }
}
