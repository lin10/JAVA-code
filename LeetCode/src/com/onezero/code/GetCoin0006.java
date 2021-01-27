package com.onezero.code;

public class GetCoin0006 {
    /**
     * 桌上有 n 堆力硬币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力硬币的最少次数。
     *
     * 限制：
     * 1 <= n <= 4
     * 1 <= coins[i] <= 10
     **/
    public static void main(String[] args){
        int coins[] = {4,7,8,2};
        System.out.println(minCount(coins));
    }

    public static int minCount(int[] coins){
        int count=0;
        for(int i =0; i<coins.length; i++){
            if(coins[i]%2==0){
                count=count+(coins[i]/2);
            }else{
                count=count+1+(coins[i]/2);
            }
            //一行代码即可
            //count+=(coins[i]+1)/2;
        }
        return count;
    }
}
