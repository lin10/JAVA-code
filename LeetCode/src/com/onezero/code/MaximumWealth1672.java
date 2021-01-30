package com.onezero.code;


public class MaximumWealth1672 {
    /**
     *
     * 给一个 m x n 的整数网格 accounts ，
     * 其中 accounts[i][j] 是第 i​​​​​​​​​​​​ 位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
     *
     * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
     * 输入：accounts = [[1,5],[7,3],[3,5]]
     * 输出：10
     *
     * 解法：冒泡排序，用变量MAX存储最大值，默认为0，对二维数组进行遍历，将每个子数组的和与变量MAX比较，
     * 如果比MAX大，那么将MAX值等于当前最大值
     *
     *
     */

    private static int maximumWealth(int[][] accounts) {
        int max = 0;
        if (accounts==null) return max;
        for (int[] account : accounts) {
            int sum = 0;
            for (int anAccount : account) {
                sum += anAccount;
            }
            if (max < sum) max = sum;
        }
        return max;
    }
    public static void main(String[] args){
        int[][] accounts =  {{1,15},{7,8},{2,6},{12,21}};
        System.out.println(maximumWealth(accounts));
    }
}
