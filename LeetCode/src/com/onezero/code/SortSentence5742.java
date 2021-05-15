package com.onezero.code;

public class SortSentence5742 {

    /**
     * 句子 "This is a sentence" 可以被打乱顺序得到 "sentence4 a3 is2 This1" 或者 "is2 sentence4 This1 a3" 。
     * 给你一个 打乱顺序 的句子 s ，它包含的单词不超过 9 个，请你重新构造并得到原本顺序的句子
     *
     * 思路：处理字符串为数组排好序，再处理字符串合并
     */

    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        int len = arr.length;
        String[] res = new String[len];
        for(int i=0;i<len;i++){
            Integer j=0;
            while (!arr[i].contains(j.toString())){
                j++;
            }
            StringBuilder sb = new StringBuilder();
            for(int k=0;k<arr[i].length();k++){
                if(arr[i].charAt(k)!=j.toString().charAt(0)){
                    sb.append(arr[i].charAt(k));
                }
            }
            res[j-1] = sb.toString();
        }
        String str = "";
        for(int l=0;l<res.length;l++){
            str=str+res[l];
            if(l!=len-1){
                str=str+" ";
            }
        }
        return str;
    }
}
