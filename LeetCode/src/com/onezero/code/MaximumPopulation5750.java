package com.onezero.code;

public class MaximumPopulation5750 {

    /**
     *给你一个二维整数数组 logs ，其中每个 logs[i] = [birthi, deathi] 表示第 i 个人的出生和死亡年份。
     *
     * 年份 x 的 人口 定义为这一年期间活着的人的数目。第 i 个人被计入年份 x 的人口需要满足：x 在闭区间 [birthi, deathi - 1] 内。注意，人不应当计入他们死亡当年的人口中。
     *
     * 返回 人口最多 且 最早 的年份。
     */
    public int maximumPopulation(int[][] logs) {
        int max=0,year=3000;
        for(int i=0;i<logs.length;i++){
            int count=1;
            for(int j=0;j<logs.length;j++){
                if(i!=j&&logs[i][0]>=logs[j][0]&&logs[i][0]<logs[j][1]){
                    count++;
                }
            }
            if(max<count||(max==count&&logs[i][0]<year)){
                max=count;
                year=logs[i][0];
            }
        }
        return year;
    }
}
