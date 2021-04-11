package com.onezero.code;

public class ArraySign5726 {

    /**
     *
     通过的用户数0
     尝试过的用户数0
     用户总通过次数0
     用户总提交次数0
     题目难度Easy
     已知函数 signFunc(x) 将会根据 x 的正负返回特定值：

     如果 x 是正数，返回 1 。
     如果 x 是负数，返回 -1 。
     如果 x 是等于 0 ，返回 0 。
     给你一个整数数组 nums 。令 product 为数组 nums 中所有元素值的乘积。

     返回 signFunc(product) 。
     * 思路：正常乘会有溢出的情况，直接判断符号为，如果为负数则乘-1，否则乘1，这样不会溢出，如果数组有0直接返回0
     */
    public static int arraySign(int[] nums) {
        int sum=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) return 0;
            if(String.valueOf(nums[i]).charAt(0)=='-') sum*=-1;
            sum*=1;
        }
        if(sum>0) return 1;
        if(sum<0) return -1;
        return 0;
    }

    public static void main(String[] args){
        int[] arr = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int[] arr1 = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        System.out.println(arraySign(arr));
        System.out.println(arraySign(arr1));
    }
}
