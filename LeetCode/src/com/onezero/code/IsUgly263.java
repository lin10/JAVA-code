package com.onezero.code;

public class IsUgly263 {

    /**
     * 给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
     *
     * 丑数 就是只包含质因数 2、3 和/或 5 的正整数。
     *
     * 思路：依次取余5、3、2,最后如果是1说明是丑数，否则不是
     */

    public boolean isUgly(int n) {
        if(n<1) return false;
        while(n%5==0){
            n/=5;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%2==0){
            n>>=1;
        }
        return n==1;
    }
}
