package com.onezero.code;

public class MaxScore1423 {

    /**
     *  几张卡牌 排成一行，每张卡牌都有一个对应的点数。点数由整数数组 cardPoints 给出。
     *  每次行动，你可以从行的开头或者末尾拿一张卡牌，最终你必须正好拿 k 张卡牌
     *  你的点数就是你拿到手中的所有卡牌的点数之和。
     *  给你一个整数数组 cardPoints 和整数 k，请你返回可以获得的最大点数。
     * @param cardPoints 数组
     * @param k 取数次数
     * @return 最大值
     */

    private static int maxScore(int[] cardPoints, int k) {
        int max=0;
        int resValue=0;
        int resLength = cardPoints.length-k;
        if(k==cardPoints.length){
            for(int point:cardPoints) max += point;
            return max;
        }
        //滑动数组，整个数组分为A,B两部分，数组总和固定的情况下，当A最小时，B和最大
        //1.获取数组中0->length-k元素的和
        for(int i=0;i<resLength;i++){
            resValue += cardPoints[i];
        }
        int totalVal = resValue;
        int min = resValue;
        int i=0;
        //开始从左往右滑动数组，直到走完整个数组,获取到最小值，用总值减最小值得到最大值
        for(int j=resLength;j<cardPoints.length;j++){
            resValue=resValue+cardPoints[j]-cardPoints[i++];
            min = Math.min(min,resValue);
            totalVal+=cardPoints[j];
        }
        max = totalVal-min;
        return max;
    }
    public static void main(String[] args){
        int[] arr = {100,40,17,9,73,75};
        int k=3;
        int maxScore = maxScore(arr,k);

        System.out.println(maxScore);
    }
}
