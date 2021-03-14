package com.onezero.code;


public class AreAlmostEqual5701 {
    /**
     *给你长度相等的两个字符串 s1 和 s2 。一次 字符串交换 操作的步骤如下：选出某个字符串中的两个下标（不必不同），并交换这两个下标所对应的字符。
     *
     * 如果对 其中一个字符串 执行 最多一次字符串交换 就可以使两个字符串相等，返回 true ；否则，返回 false 。
     *
     *
     */
    private static boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        int sum=0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                sum++;
                if(sum>2) return false;
                sb1.append(s1.charAt(i));
                sb2.append(s2.charAt(i));
            }
        }
        if(sum==1) return false;
        if(sb1.charAt(0)==sb2.charAt(1)&&sb1.charAt(1)==sb2.charAt(0)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        String s1="bank";
        String s2="kanb";
        System.out.println(areAlmostEqual(s1,s2));
    }
}
