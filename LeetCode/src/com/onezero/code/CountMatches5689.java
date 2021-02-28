package com.onezero.code;

import java.util.List;

/**
 * 给你一个数组 items ，其中 items[i] = [typei, colori, namei] ，描述第 i 件物品的类型、颜色以及名称。
 *
 * 另给你一条由两个字符串 ruleKey 和 ruleValue 表示的检索规则。
 *
 * 如果第 i 件物品能满足下述条件之一，则认为该物品与给定的检索规则 匹配 ：
 *
 * ruleKey == "type" 且 ruleValue == typei 。
 * ruleKey == "color" 且 ruleValue == colori 。
 * ruleKey == "name" 且 ruleValue == namei 。
 * 统计并返回 匹配检索规则的物品数量 。
 */
public class CountMatches5689 {
    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int sum=0;
        int flag=0;
        switch (ruleKey){
            case "type":
                flag = 0;
                break;
            case "color":
                flag = 1;
                break;
            case "name":
                flag = 2;
                break;
        }
        for(List<String> item:items){
            if(ruleValue.equals(item.get(flag))){
                sum+=1;
            }
        }
        return sum;
    }

    public static void main(String[] args){
//        List<List<String>> items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
    }
}
