package com.onezero.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumJewelsInStones771 {

    /**
     *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
     *
     * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
     *
     *
     */
    public int numJewelsInStones(String jewels, String stones) {

        int len=stones.length();
        for(int i=0;i<jewels.length();i++){
            stones=stones.replace(jewels.charAt(i),' ');
        }
        stones=stones.replace(" ","");
        return len-stones.length();
    }

    public int numJewelsInStones1(String jewels, String stones) {
        if(jewels==null||jewels==""||stones==null||stones=="") return 0;
        int sum=0;
        List<Character> list = new ArrayList<>();
        for(int i=0;i<jewels.length();i++){
            list.add(jewels.charAt(i));
        }
        for(int j=0;j<stones.length();j++){
            if(list.contains(stones.charAt(j))) sum++;
        }
        return sum;
    }
}
