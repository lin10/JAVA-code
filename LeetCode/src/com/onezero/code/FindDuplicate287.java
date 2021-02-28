package com.onezero.code;

public class FindDuplicate287 {

    /**
     *
     * 给定一个包含 n + 1 个整数的数组 nums ，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
     * 假设 nums 只有 一个重复的整数 ，找出 这个重复的数 。
     * 输入：nums = [1,3,4,2,2]
     * 输出：2
     *
     * 思路：因为数组里的数字在1-n之间，所以我们用一个数组A记录，遍历目标数组B，将数组中某一个元素作为key
     * 在数字A中设置第key个元素值为1，每次循环先判断是否第key个元素等于1如果等于表示当前的元素是重复，则返回
     */

    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length+1];
        int result = 0;
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]==1){
                return nums[i];
            }
            arr[nums[i]] = 1;
        }
        return result;
    }
}
