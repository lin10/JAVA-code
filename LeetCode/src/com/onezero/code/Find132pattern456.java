package com.onezero.code;

import java.util.Stack;

public class Find132pattern456 {

    /**
     * 给你一个整数数组 nums ，数组中共有 n 个整数。132 模式的子序列 由三个整数 nums[i]、nums[j] 和 nums[k] 组成，并同时满足：i < j < k 和 nums[i] < nums[k] < nums[j] 。
     *
     * 如果 nums 中存在 132 模式的子序列 ，返回 true ；否则，返回 false
     *
     */

    public boolean find132pattern1(int[] nums) {
        int flag=1;
        int len = nums.length;

        if(nums.length<3) return false;
        while(flag<=len-2){
            int min=nums[0],mid=Integer.MIN_VALUE;
            for(int i=0;i<flag;i++){
                if(nums[i] <nums[flag]){
                    if(nums[i]<min) min=nums[i];
                }
            }
            for(int j=flag+1;j<len;j++){
                if(nums[j] <nums[flag]){
                    if(nums[j]>mid) mid=nums[j];
                }
            }
            if(min<nums[flag] && nums[flag]>mid && min<mid) return true;
            flag++;
        }
        return false;
    }

    public boolean find132pattern(int[] nums) {
        int len = nums.length;
        if(len<3) return false;
        Stack<Integer> stack = new Stack<>();
        int mid = Integer.MIN_VALUE;
        stack.push(nums[len-1]);
        for(int i=len-1;i>=0;i--){
            if(nums[i]<mid) return true;
            while(!stack.isEmpty()&&nums[i]>stack.peek()){
                mid=stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
