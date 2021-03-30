package com.onezero.code;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    /**
     * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
     *
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     */

    public int majorityElement(int[] nums) {
        int count=1;
        int num=nums[0];
        for(int i=1;i<nums.length;i++){
            if(num==nums[i]){
                count++;
            }else{
                count--;
            }
            if(count==0){
                count=1;
                num=nums[i];
            }
        }
        return num;
    }

    public int majorityElement1(int[] nums) {
        int len = nums.length/2-1;
        final int[] num = {0};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (null!=map.get(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        map.forEach((key,value)->{
            if (value>len) num[0] =key;
        });
        return num[0];
    }
}
