package com.onezero.code;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2nd119 {
    /**
            [1]
            [1, 1]
            [1, 2, 1]
            [1, 3, 3, 1]
            [1, 4, 6, 4, 1]
            [1, 5, 10, 10, 5, 1]
            [1, 6, 15, 20, 15, 6, 1]
            [1, 7, 21, 35, 35, 21, 7, 1]
            [1, 8, 28, 56, 70, 56, 28, 8, 1]

     给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
     在杨辉三角中，每个数是它左上方和右上方的数的和。
     示例：
     输入: 3
     输出: [1,3,3,1]
     **/

    private static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i=0; i<=rowIndex; i++){
            List<Integer> row = new ArrayList<>();
            //将杨辉三角数据一行一行算出
            for(int j=0; j<=i; j++){
                if (j==0||j==i){
                    //如果是两边数字为1，第一行也为1
                    row.add(1);
                }else{
                    //第i行的第j和数等于第i-1行的j-1和j元素之和
                    row.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(row);
        }
        return list.get(rowIndex);
    }

    public static void main(String[] args){
        System.out.println(getRow(3).toString());
        for(int i=1; i<10;i++){
            System.out.println(getRow(i).toString());
        }
    }
}
