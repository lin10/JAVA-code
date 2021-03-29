package com.onezero.code;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers448 {
    /**
     * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
     *
     * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
     *
     * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
     *
     * 思路：时间复杂度为O（n），且不新增数组空间，所以通过将原数组值改为负数
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[Math.abs(nums[i])-1] = -Math.abs(nums[Math.abs(nums[i])-1]);
        }
        List<Integer> list = new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) list.add(i+1);
        }
        return list;
    }
}
