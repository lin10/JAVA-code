package com.onezero.code;

public class FindMedianSortedArrays4 {

    /**
     * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
     * 请你找出并返回这两个正序数组的 中位数 。
     * 思路：确认中位数的位置N然后循环N次，准备两个游标分别比较遍历两个数组依次从小到大寻找，
     *       用两个变量mid1和mid2记录循环找到的数，每次循环开始设置mid1=mid2,循环到最后中位数
     *       跟mid1和mid2有关，如果共偶数个数字，那么则是mid1与mid2的和除2，否则是mid2.
     */

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int len=m+n;
        int mid1=0,mid2=0;
        int aKey=0,bKey=0;
        for(int i=0;i<=len/2;i++){
            mid1=mid2;
            if(aKey<m&&(bKey>=n||nums1[aKey]<nums2[bKey])){
                mid2=nums1[aKey++];
            }else{
                mid2=nums2[bKey++];
            }
        }
        if((len&1)==0){
            return (double)(mid1+mid2)/2;
        }
        return (double)mid2;
    }

    public static void main(String[] args){
        int[] nums1={2};
        int[] nums2={2};
        System.out.println(3/2);
        System.out.println(findMedianSortedArrays(nums1,nums2));
        int len=4;
        System.out.println(len&1);
    }
}
