package com.onezero.code;

import java.util.ArrayList;
import java.util.List;

public class SetZeroes73 {

    /**
     * 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
     *
     * 睡前一题，没深入想，标记下后面想更优的方法
     *
     * 直接两个循环，用两个list标识行和列，然后根据行列对矩阵数据进行处理，耗时超过40%,内存消耗超过92%，后面再研究更快方法，睡觉zzz
     */
    public void setZeroes(int[][] matrix) {
        List<Integer> rowList = new ArrayList<>();
        List<Integer> lineList = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    if(!rowList.contains(i))rowList.add(i);
                    if(!lineList.contains(j))lineList.add(j);
                }
            }
        }

        for(int k: rowList){
            for(int j=0;j<matrix[k].length;j++){
                if(matrix[k][j]!=0)matrix[k][j] = 0;
            }
        }

        for(int l:lineList){
            for(int i=0;i<matrix.length;i++){
                if(matrix[i][l]!=0)matrix[i][l] = 0;
            }
        }
      ////最初版本，两个循环遍历
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[i].length;j++){
//                if(matrix[i][j] != 0&&(rowList.contains(i)||lineList.contains(j))){
//                    matrix[i][j] = 0;
//                }
//            }
//        }
    }
}
