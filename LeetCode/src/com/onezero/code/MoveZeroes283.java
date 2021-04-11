package com.onezero.code;

public class MoveZeroes283 {

    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     * 思路：新增一个索引index，标识不为0的长度，大于index的都置为0
     */
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i=index;i<nums.length;i++){
            nums[i] = 0;
        }
    }

    public void moveZeroes1(int[] nums) {
        int len = nums.length;
        int i=0,j=1;
        if(len<2) return;
        while(i<=len-2&&j<=len-1){
            if(nums[i]==0&&nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
            }
            if(nums[i]!=0) i++;
            if(j<len) j++;
        }
    }
}
