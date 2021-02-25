package com.onezero.code;

import java.util.Arrays;

public class Transpose867 {

    private static int[][] transpose(int[][] matrix){

        /**
         * 给你一个二维整数数组 matrix， 返回 matrix 的 转置矩阵 。
         * 矩阵的 转置 是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
         *
         * 说明：new一个新的二维数组，存放转置后的数据
         *
         * 输入：{{1,2,3},{4,5,6}}
         * 输出：[[1, 4], [2, 5], [3, 6]]
         */

        int[][] res = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            int j=0;
            while (j<matrix[i].length){
                res[j][i] = matrix[i][j];
                j++;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6}};
        //,{7,8,9}
        System.out.println(arr.length);
        System.out.println(Arrays.deepToString(transpose(arr)));
    }
}
