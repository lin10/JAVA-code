package com.onezero.code;

import java.util.Arrays;

public class ArrayPairSum561 {

    /**
     * 给定长度为 2n 的整数数组 nums ，你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从 1 到 n 的 min(ai, bi) 总和最大。
     * 返回该 最大总和 。
     * 思路： 总和最大，则应是将数组排序好后，第2N-1和元素的总和
     *
     * @param nums 数组
     * @return 返回总和
     */
    private static int arrayPairSum(int[] nums){
        int tmp=0;
        //冒泡排序
//        for(int i=0;i<nums.length;i++){
//            for(int j=0; j<i;j++){
//                if(nums[i]<=nums[j]){
//                    tmp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = tmp;
//                }
//            }
//        }
//        快速排序，最优情况下是O(n*log(n))
//        quick_sort(nums,0,nums.length-1);

//
//       Arrays.sort()是经过调优排序算法，性能能达到n*log(n)
        Arrays.sort(nums);
        int sum=0;
        for(int k=0;k<nums.length;k=k+2){
            sum+=nums[k];
        }
        return sum;
    }

    //快速排序实现方法
    private static void quick_sort(int[] arr, int l, int r){
        if(l<r){
            int key=arr[l],i=l,j=r;
            while(i<j){
                while(i<j&&arr[j]>=key){
                    j--;
                }
                if(i<j) arr[i++]=arr[j];
                while(i<j&&arr[i]<=key){
                    i++;
                }
                if(i<j) arr[j--]=arr[i];
            }
            arr[i]=key;
            quick_sort(arr,l,i-1);
            quick_sort(arr,i+1,r);
        }

    }

    public static void main(String[] args){
        int[] arr = {1,4,3,2};
        System.out.println(arrayPairSum(arr));
    }
}
