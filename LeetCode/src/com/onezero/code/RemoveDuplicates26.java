package com.onezero.code;

import java.util.Arrays;

public class RemoveDuplicates26 {

    /**
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     *
     * 输入：{0,0,1,1,1,2,2,3,3,4}
     * 结果：[0, 1, 2, 3, 4]，5
     */

    private static int removeDuplicates(int[] nums){
        // 两个指针从前往后找，如果找到不同的就从第2个开始修改为目标数据
          int resLength = nums.length;
         int i=0,j=1,k=1;
         while (i<nums.length-1){
             if(nums[i] == nums[j]){
                 resLength--;
                 j++;
             }
             if(j>=nums.length){
                 return resLength;
             }
             if(nums[i] != nums[j]){
                 nums[k++] = nums[j];
                 i=j;
                 j++;
             }
         }
        System.out.println(Arrays.toString(nums));
         return resLength;

        //用j标识相同数字个数,当前元素i减相同个数，就可以指向该更新的元素
//        int j=0;
//        for(int i=1;i<nums.length;i++){
//            if(nums[i-1]==nums[i]){
//                j++;
//            }else{
//                nums[i-j] = nums[i];
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//        return nums.length-j;
    }

    public static void main(String[] args){
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
