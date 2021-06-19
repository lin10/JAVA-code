package com.onezero.code;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {

    /**
     * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
     *
     * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
     *
     * 思路：1.用resList存储最终的list，初始一个空list作为第一个元素。
     *       2.用subList存储新增一个元素时获得的新的list
     *       3.可以理解为每次新增一个元素时，是在前N个元素生成的resList的每一个子list加上新元素然后加到resList后面
     * 注意：Java引用对象文件，如果ListA=ListB赋值，修改时ListA时会改动到ListB
     */

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        List<List<Integer>> subList = new ArrayList<>();
//        List<Integer> fistList = new ArrayList<>();
        subList.add(new ArrayList<>());
        resList.add(new ArrayList<>());
        for(int num:nums){
            List<List<Integer>> tmpList = new ArrayList<>();
            for(int i=0;i<subList.size();i++){
                List<Integer> tmpList1= new ArrayList<>(subList.get(i));
                tmpList1.add(num);
                tmpList.add(tmpList1);
//                resList.add(tmpList1);
            }
            resList.addAll(new ArrayList<>(tmpList));
            subList = new ArrayList<>(resList);
        }
        return resList;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(subsets(arr).toString());
        //输出：[[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
    }
}
