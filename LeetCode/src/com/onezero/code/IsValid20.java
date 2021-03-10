package com.onezero.code;

import java.util.Stack;

public class IsValid20 {

    /**
     *给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     *
     * 思路：用栈来实现，因为左边肯定是左括号，右边的肯定是右括号，遇到左括号就替换入栈，当栈顶元素跟右括号一样时则出栈
     */
    private static boolean isValid(String s){

        //用栈来处理
        Stack<Character> stack = new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')stack.push(')');
            if(c=='[')stack.push(']');
            if(c=='{')stack.push('}');
            if(stack.isEmpty()||c!=stack.pop()) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[]  args){
        String s = "()";
        System.out.println(isValid(s));
    }
}
