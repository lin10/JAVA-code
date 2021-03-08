package com.onezero.code;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

public class Reverse7 {

    /**
     * 给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
     *
     * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
     *
     * 假设环境不允许存储 64 位整数（有符号或无符号）。
     *
     */
    public int reverse(int x) {
        int tmp=0;
        String str = Integer.toString(x);
        StringBuilder sb = new StringBuilder();
        try{
            if (str.charAt(0) == '-'){
                sb.append('-');
                tmp = 1;
            }
            for (int i=str.length()-1;i>=tmp;i--){
                sb.append(str.charAt(i));
            }
            return Integer.parseInt(sb.toString());
        }catch (Exception e){
            return 0;
        }
    }

    public static void main(String[] args){
        System.out.println((-123));
    }
}
