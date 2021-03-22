package com.onezero.code;

public class HammingWeight191 {

    /**
     * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
     */
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int count = 0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='1') count++;
        }
        return count;

    }

    //位运算
    public int hammingWeight1(int n){
        int sum=0;
        while(n!=0){
            sum+=n&1;
            n=n>>>1;
        }
        return sum;
    }
}
