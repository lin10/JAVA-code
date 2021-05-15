package com.onezero.code;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt13 {

    /**
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
     * 给定一个罗马数字，将其转换成整数
     *
     * 思路：map放对应值，然后循环处理字符串的字符
     */

    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int num = 0;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length()&&map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                num-=map.get(s.charAt(i));
            }else{
                num+=map.get(s.charAt(i));
            }
        }
        return num;
    }
}
