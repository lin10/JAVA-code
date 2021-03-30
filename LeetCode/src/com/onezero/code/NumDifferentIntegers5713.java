package com.onezero.code;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NumDifferentIntegers5713 {

    /**
     * 5713. 字符串中不同整数的数目
     * 给你一个字符串 word ，该字符串由数字和小写英文字母组成。
     *
     * 请你用空格替换每个不是数字的字符。例如，"a123bc34d8ef34" 将会变成 " 123  34 8  34" 。注意，剩下的这些整数间至少要用一个空格隔开："123"、"34"、"8" 和 "34" 。
     *
     * 返回对 word 完成替换后形成的 不同 整数的数目。
     *
     * 如果两个整数的 不含前导零 的十进制表示不同，则认为这两个整数也不同。
     */
    private static int numDifferentIntegers(String word) {
        if (word==null||word.length()<1) return 0;

        char[] charArr={' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        List<Character> list = new ArrayList<>();
        for(int i=0;i<charArr.length;i++){
            list.add(charArr[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<word.length();i++) {
            if (list.contains(word.charAt(i))) {
                sb.append(' ');
            }else{
                sb.append(word.charAt(i));
            }
        }
        String[] arr = sb.toString().split(" ");
        if (arr.length<1) return 0;
        List<String> resList = new ArrayList<>();
        System.out.println(Arrays.toString(arr));
        for (String anArr : arr) {
            if(!"".equals(anArr)){
                String num = anArr.replaceFirst("^0*","");
                if (!resList.contains(num)) {
                    resList.add(num);
                }
            }

        }
        System.out.println(resList.toString());
        return resList.size();
    }

//    public static void main(String[] args){
//        String str = "a123bc34d8ef34a01a001q167278959591294";
//        System.out.println(numDifferentIntegers(str));
//        String s = "";
////        List<List<String>> = new ArrayList<>();
////        String[] arr = {{"a","b"}};
//    }

    public String evaluate(String s, List<List<String>> knowledge) {
        for(List<String> strList:knowledge){
            String keyStr = "("+strList.get(0)+")";
            s=s.replace(keyStr,strList.get(1));
        }
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        List<String> tmpList = new ArrayList<>();
        stack.push('1');
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if('('==c){
                stack.push(c);
                sb.append(c);
            }
            if('('==stack.peek()){
                sb.append(c);
            }
            if(')'==c){
                stack.push(c);
                sb.append(c);
                tmpList.add(sb.toString());
                sb=new StringBuilder();;
            }
        }
        for(String str:tmpList){
            s=s.replace(str,"?");
        }
        return s;
    }
}

