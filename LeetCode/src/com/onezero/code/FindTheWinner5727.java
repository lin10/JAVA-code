package com.onezero.code;

public class FindTheWinner5727 {

    /**
     *
     * 共有 n 名小伙伴一起做游戏。小伙伴们围成一圈，按 顺时针顺序 从 1 到 n 编号
     * 从第 1 名小伙伴所在位置 开始 。
     * 沿着顺时针方向数 k 名小伙伴，计数时需要 包含 起始时的那位小伙伴。逐个绕圈进行计数，一些小伙伴可能会被数过不止一次。
     * 你数到的最后一名小伙伴需要离开圈子，并视作输掉游戏。
     * 如果圈子中仍然有不止一名小伙伴，从刚刚输掉的小伙伴的 顺时针下一位 小伙伴 开始，回到步骤 2 继续执行。
     * 否则，圈子中最后一名小伙伴赢得游戏。
     * 给你参与游戏的小伙伴总数 n ，和一个整数 k ，返回游戏的获胜者。
     *
     * 思路：约瑟夫环解法，逆递推
     */
    public int findTheWinner(int n, int k) {
        int res = 0;
        for(int i=2; i<=n;i++){
            res = (res+k)%i;
        }
        return res+1;
    }
    public static void main(String[] args){
        System.out.println(5%2);
    }
}
