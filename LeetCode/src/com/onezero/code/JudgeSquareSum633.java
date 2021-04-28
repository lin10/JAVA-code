package com.onezero.code;

public class JudgeSquareSum633 {

    /**
     * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c
     *
     * 思路：双指针，a和b一定小于c的开平方
     */

    public boolean judgeSquareSum(int c) {
        int a=0;
        int b=(int)Math.sqrt(c);
        while(a<=b){
            if(a*a+b*b<c){
                a++;
            }else if(a*a+b*b>c){
                b--;
            }else{
                return true;
            }
        }
        return false;
    }
}
