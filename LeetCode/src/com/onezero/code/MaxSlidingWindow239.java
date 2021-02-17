package com.onezero.code;

import java.util.Arrays;
import java.util.LinkedList;

public class MaxSlidingWindow239 {

    /**
     * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
     * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
     * 返回滑动窗口中的最大值数列。
     *
     */
    //最普通的方法，时间复杂度为O(nk)，无法通过
    private static int[] maxSlidingWindow1(int[] nums, int k){
        if(nums==null||nums.length<2) return nums;
        int l = nums.length-k+1;
        int[] resArr= new int[l];
        int i=0;
        while(i<l){
            int max=nums[i];
            for(int j=i; j<i+k; j++){
                if(max<=nums[j]) max=nums[j];
            }
            resArr[i++]=max;
        }
        return resArr;
    }

    //双向队列法,保持队列总是从大到小排列
    private static int[] maxSlidingWindow(int[] nums, int k){
        if(nums==null||nums.length<2) return nums;
        int[] resArr= new int[nums.length-k+1];
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i=0; i<nums.length; i++){
            while(!queue.isEmpty()&&nums[queue.peekLast()]<=nums[i]){
                queue.pollLast();
            }
            queue.addLast(i);
            if(queue.peek()<=i-k){
                queue.poll();
            }
            if(i+1>=k){
                resArr[i+1-k] = nums[queue.peek()];
            }
        }
        return resArr;
    }

    public static void main(String[] args){
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums,k)));
        //结果:[3, 3, 5, 5, 6, 7]
    }

    //        int[] resArr = new int[k];
//        int flag = 0;
//        int otherSum = 0;
//        if(k>=nums.length) return nums;
//        //将数组从第k个元素开始分为两组
//        for(int i=k; i<nums.length; i++){
//            otherSum+=nums[i];
//        }
//        int min = otherSum;
//        int m=0,n=k;
//        while(n<nums.length){
//            otherSum=otherSum+nums[n++]-nums[m++];
//            if(otherSum<=min){
//                min = otherSum;
//                flag=m;
//            }
//        }
//        int p=0;
//        for(int j=flag;j<flag+k;j++){
//            resArr[p++] = nums[j];
//        }
//
//        return resArr;
}
