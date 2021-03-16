package com.onezero.code;

public class GenerateMatrix59 {
    /**
     * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
     *
     *按层赋值
     *
     */
    private int[][] generateMatrix(int n) {
        int m=1,j=0;
        int [][] matrix = new int[n][n];
        while (m<=n*n){
            for(int i=j;i<n-j;i++)
                matrix[j][i] = m++;
            for(int i=j+1;i<n-j;i++)
                matrix[i][n-j-1] = m++;
            for(int i=n-j-2;i>=j;i--)
                matrix[n-j-1][i] = m++;
            for(int i=n-j-2;i>j;i--)
                matrix[i][j] = m++;
            j++;
        }
        return matrix;
    }

}
