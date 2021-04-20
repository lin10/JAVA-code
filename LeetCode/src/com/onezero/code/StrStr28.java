package com.onezero.code;

public class StrStr28 {

    /**
     * 实现 strStr() 函数。
     *
     * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1
     *
     * 思路：直接就是 haystack.indexOf()方法获取位置
     */
    public int strStr(String haystack, String needle) {
        if(needle==null||needle.equals("")) return 0;
        char[] stackChar=haystack.toCharArray(),needleChar=needle.toCharArray();
        for(int i=0;i<=stackChar.length-needleChar.length;i++){
            int j;
            for(j=0;j<needleChar.length;j++){
                if(stackChar[i+j]!=needleChar[j]){
                    break;
                }
            }
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }

    public int strStr1(String haystack, String needle) {
        if(needle==null||needle.equals("")) return 0;
        if(!haystack.contains(needle)) return -1;
        return haystack.indexOf(needle);
    }
}
