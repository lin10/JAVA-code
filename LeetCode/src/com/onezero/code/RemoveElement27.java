package com.onezero.code;

public class RemoveElement27 {

    /**
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     *
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素
     *
     * 思路：因为结果数组元素随机，所以用后面的替换前面的目标元素，直到目标长度数组内无指定元素
     */

    public int removeElement(int[] nums, int val) {
        if(nums.length<1) return 0;
        if(nums.length==1&&nums[0]==val) return 0;
        int i=0,len=nums.length;
        int newLen = len-1;
        while(i<=newLen){
            if(nums[i]==val){
                while(newLen>=i){
                    if(nums[newLen]!=val){
                        nums[i]=nums[newLen];
                        newLen--;
                        break;
                    }
                    newLen--;
                }
            }
            i++;
        }
        return newLen+1;
    }
}
