package com.onezero.code;

public class SearchMatrix74 {

    /**
     * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
     *
     * 每行中的整数从左到右按升序排列。
     * 每行的第一个整数大于前一行的最后一个整数。
     *  
     * 思路，先遍历第一列，找到第一个比目标元素大的值所在行，那么目标值可能在前一行
     *
     */

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix[0][0]>target) return false;
        int i=0;
        for(int[] arr: matrix){
            if(arr[0]==target) return true;
            if(arr[0]>target) {
                i--;
                break;
            }
            i++;
        }
        if(i>=matrix.length){
            i--;
        }

        int[] tmpArr = matrix[i];
        for(int j=0;j<tmpArr.length;j++){
            if(matrix[i][j]==target) return true;
        }
        return false;
    }
}
