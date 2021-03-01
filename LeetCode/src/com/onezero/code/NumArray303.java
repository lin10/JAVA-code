package com.onezero.code;

public class NumArray303 {

    /**
     * 给定一个整数数组  nums，求出数组从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点。
     * 实现 NumArray 类：
     * NumArray(int[] nums) 使用数组 nums 初始化对象
     * int sumRange(int i, int j) 返回数组 nums 从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点（也就是 sum(nums[i], nums[i + 1], ... , nums[j])）
     *
     */

    int[] arr;
    public NumArray303(int[] nums) {
        //普通法
        // this.arr = nums;

        //前缀法，结果数组每个元素N等于前N-1项和，区间表示两个和相减
        arr = new int[nums.length+1];
        for(int i=0; i<nums.length; i++){
            arr[i+1] = arr[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        //普通法
        // int sum = 0;
        // while(i<=j){
        //     sum += arr[i];
        //     i++;
        // }
        // return sum;

        //前缀法
        return arr[j+1]-arr[i];
    }
}
