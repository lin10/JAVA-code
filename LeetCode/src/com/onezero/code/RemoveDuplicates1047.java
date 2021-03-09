package com.onezero.code;

public class RemoveDuplicates1047 {

    /**
     *
     * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
     * 在 S 上反复执行重复项删除操作，直到无法继续删除。
     * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
     *
     * 输入："abbaca"
     * 输出："ca"
     *
     * 思路：用StringBuilder的deleteCharAt方法删除相同的字符
     */
    private static String removeDuplicates(String S) {

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if(sb.length()==0){
                sb.append(c);
                continue;
            }
            if(c==sb.charAt(sb.length()-1)){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
