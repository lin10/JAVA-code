package com.onezero.code;

public class Shuffle1470 {

    /**
     * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
     *
     * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组
     *
     * 思路，用一个新的数组存储结果，将两个数组分别存入单数和偶数位
     */


    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int index=0;
        for(int i=0;i<n;i++){
            arr[2*i]=nums[i];
        }
        for(int i=n;i<2*n;i++){
            arr[2*index+1]=nums[i];
            index++;
        }
        return arr;
    }
}
