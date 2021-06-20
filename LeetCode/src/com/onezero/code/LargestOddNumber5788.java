package com.onezero.code;

public class LargestOddNumber5788 {

    /**
     * 给你一个字符串 num ，表示一个大整数。请你在字符串 num 的所有 非空子字符串 中找出 值最大的奇数 ，并以字符串形式返回。如果不存在奇数，则返回一个空字符串 "" 。
     *
     * 子字符串 是字符串中的一个连续的字符序列。
     *
     *
     */

    public String largestOddNumber(String num) {
        boolean flag = false;
        int index=0,i=num.length()-1;
        while(i>=0){
            if(num.charAt(i)!='0'&&(int)num.charAt(i)%2!=0){
                flag=true;
                break;
            }
            if(i!=0) i--;
        }
        if(flag){
            return num.substring(0,i+1);
        }
        return "";
    }
}
