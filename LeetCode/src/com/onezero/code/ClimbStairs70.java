package com.onezero.code;

public class ClimbStairs70 {

    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     * 注意：给定 n 是一个正整数。
     *
     * 这里是斐波那契数列，即从第三个数开始每一个数字都是前两个的和，这里要注意时间问题，直接递归会超时
     * 1、2、3、5、8、13、21、34
     *
     * @param n 台阶总层数
     * @return 返回方法数目
     */
    private static int climbStairs(int n) {
        if(n<3){
            return n;
        }else{
            int i=1,j=2;
            int k=3;
            int sum=0;
            while(k<=n){
                sum=i+j;
                i=j;
                j=sum;
                k++;
            }
            return sum;
        }
//        第一次使用直接递归，超时，需要减少计算量
//        if (n<3)return n;
//        return climbStairs(n-1)+climbStairs(n-2);
    }

    private int getSum(int n){
        return getSum(n-1)+getSum(n-2);
    }

    public static void main(String[] args){
        System.out.println(climbStairs(5));
    }
}
