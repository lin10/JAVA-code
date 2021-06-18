package com.onezero.code;

public class MaxProfit121 {

    /**
     * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
     * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。
     * 设计一个算法来计算你所能获取的最大利润。
     *
     * 思路：动态规划，某日的最大值是当天与前N天中的最小值相减
     * 1.求出前N天的最小值MIN
     * 2.某日交易的最大值=当日价格-前N天中的最小值MIN
     * 3.将MAX与某日交易最大值比较，直到获取到最大值
     */
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            max=Math.max(max,prices[i]-min);
            min=Math.min(min,prices[i]);

        }
        return max;
    }
}
