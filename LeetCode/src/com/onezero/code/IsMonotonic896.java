package com.onezero.code;

public class IsMonotonic896 {

    /**
     *如果数组是单调递增或单调递减的，那么它是单调的。
     * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
     * 当给定的数组 A 是单调数组时返回 true，否则返回 false
     *
     * 思路：遍历数组，如果数组长度小于3直接返回true
     * 用两个变量记录递归还是递减，如果最后两个变量值一样，则返回true，否则false
     */
    private static boolean isMonotonic(int[] A) {
        if(A.length<3) return true;
        int j=1,k=2;
        for(int i=1;i<A.length; i++){
            if(A[i]>A[i-1]) j=0;
            if(A[i]<A[i-1]) k=0;
            if(j==k) return false;
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = {11,11,9,4,3,3,3,1,-1,-1,3,3,3,5,5,5};
        System.out.println(isMonotonic(arr));
    }
}
