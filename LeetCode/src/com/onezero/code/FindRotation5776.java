package com.onezero.code;

public class FindRotation5776 {

    /**
     * 给你两个大小为 n x n 的二进制矩阵 mat 和 target 。
     * 现 以 90 度顺时针轮转 矩阵 mat 中的元素 若干次 ，如果能够使 mat 与 target 一致，返回 true ；否则，返回 false 。
     *
     */


    public static boolean findRotation(int[][] mat, int[][] target) {
        int len = mat.length;
        int[][] tmp = mat;
        int index=0;
        boolean flag=false;
        while(index<4){
            index++;
            tmp = rotate(tmp,len);
            boolean tmpflag = check(tmp,target);
            if(tmpflag){
                return tmpflag;
            }
        }
        return flag;
    }
    public static int[][] rotate(int[][] mat, int len){
        int[][] res = new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                res[len-j-1][len-i-1] = mat[i][len-j-1];
            }
        }
        return res;
    }
    public static boolean check(int[][] mat, int[][] target){
        if(mat.length!=target.length){
            return false;
        }else{
            int len = mat.length;
            for(int i=0;i<len;i++){
                for(int j=0;j<len;j++){
                    if(mat[i][j]!=target[i][j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[][] mat={{0,0,0},{0,1,0},{1,1,1}};
        int[][] target={{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(mat,target));
    }
}
