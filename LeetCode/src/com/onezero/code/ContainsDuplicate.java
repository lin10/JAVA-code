package com.onezero.code;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args){
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        int target = 9;
        //存在重复元素
        System.out.println(containsDuplicate(nums));
    }

    /**
     * 给定一个整数数组，判断是否存在重复元素。
     *
     * 如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
     * @param nums
     * @return
     */
    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<Integer>();
        for(int i:nums){
            boolean flag = numsSet.add(i);
            if(!flag){
                return true;
            }
        }
        return false;
    }
}
