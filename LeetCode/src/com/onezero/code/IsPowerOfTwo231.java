package com.onezero.code;

public class IsPowerOfTwo231 {

    /**
     * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false
     * 思路，对数据循环除2，然后取余，如果不为0则false
     * 注意：考虑n小于0的情况，递归不需要考虑n小于0
     */
    public boolean isPowerOfTwo1(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        while(n>1){
            if(n%2!=0) return false;
            n=n/2;
        }
        return true;
    }

    public boolean isPowerOfTwo(int n){
        if(n==0) return false;
        if(n==1) return true;
        if(n%2!=0) return false;
        return isPowerOfTwo(n/2);
    }

    public static void main(String[] args){
        System.out.println(59%2);
    }
}
