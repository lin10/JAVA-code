package com.onezero.code;

import java.util.Arrays;

public class QuickSort {

    /**
     * 快速排序
     * 简单理解，取基准值M，将小于M的值都挪到左边，大于M的值都挪到右边，然后对左右两个区间分别重复进行选基准和排序，
     * 直到左右都排列完，得到的数组是排好序的，时间复杂度（NlogN）
     * 在基本有序的情况下不适合用快排，快排适合数据打乱的情况下
     */
    public  static void quickSortMethod(int[] arr,int left,int right){
        if(left>right) return;
        int tmp=arr[left];
        int i=left;
        int j=right;
        while (i<j){
            while(arr[j]>=tmp&&j>i){
                j--;
            }
            if(tmp>arr[j]){
                arr[i]=arr[j];
            }
            while(arr[i]<=tmp&&i<j){
                i++;
            }
            if(tmp<arr[i]) {
                arr[j] = arr[i];
            }

        }
        arr[i]=tmp;
        quickSortMethod(arr,0,i-1);
        quickSortMethod(arr,i+1,right);
    }

    public static void main(String[] args){
        int[] arr={1,3,2,24,1,2,4,3,3,55,6,77,41};
        quickSortMethod(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
