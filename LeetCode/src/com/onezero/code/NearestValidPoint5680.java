package com.onezero.code;

public class NearestValidPoint5680 {

    /**
     *
     *给你两个整数 x 和 y ，表示你在一个笛卡尔坐标系下的 (x, y) 处。同时，在同一个坐标系下给你一个数组 points ，其中 points[i] = [ai, bi] 表示在 (ai, bi) 处有一个点。当一个点与你所在的位置有相同的 x 坐标或者相同的 y 坐标时，我们称这个点是 有效的 。
     *
     * 请返回距离你当前位置 曼哈顿距离 最近的 有效 点的下标（下标从 0 开始）。如果有多个最近的有效点，请返回下标 最小 的一个。如果没有有效点，请返回 -1 。
     *
     * 两个点 (x1, y1) 和 (x2, y2) 之间的 曼哈顿距离 为 abs(x1 - x2) + abs(y1 - y2) 。
     *
     * 注：一定理解清楚题意
     *
     */

    private static int nearestValidPoint(int x, int y, int[][] points) {
        if(points.length<1) return -1;
        int sum=0,sumSame=0,sumValid=0,i=0,min=1000000000,tmp=0;
        int[][] validArr = new int[points.length][2];
        int[] target = new int[2];
        for(int[] arr:points){
            if(x==arr[0]||y==arr[1]){
                validArr[i++] = arr;
                sumValid++;
            }
            if(x==arr[0]&&y==arr[1]){
                sumSame++;
            }
        }
        if(sumSame>0) {
            int k=0;
            while (k<points.length){
                if(points[k][0]==x&&points[k][1]==y){
                    return k;
                }
                k++;
            }
        }
        if(sumValid<1) return -1;
        for(int j=0;j<sumValid;j++){
            tmp=Math.abs(validArr[j][0]-x)+Math.abs(validArr[j][1]-y);
            if(tmp<min){
                min=tmp;
                target=validArr[j];
            }
        }
        int k=0;
        while (k<points.length){
            if(points[k]==target){
                return k;
            }
            k++;
        }
        return sum;
    }

    public static void main(String[] args){
        int x=3,y=4;
        int[][] points={{1,2},{3,1},{2,4},{2,3},{4,4}};
        System.out.println(nearestValidPoint(x,y,points));
        //输出：2
    }
}
