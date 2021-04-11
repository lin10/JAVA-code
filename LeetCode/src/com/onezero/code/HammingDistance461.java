package com.onezero.code;

public class HammingDistance461 {

    /**
     * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
     *
     * 给出两个整数 x 和 y，计算它们之间的汉明距离。
     *
     * 思路：汉明距离：A串转化为B串需要改动的字符数
     */

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }

    public int hammingDistance1(int x, int y) {
        int count=0;
        if(x==y) return 0;
        while(x!=0||y!=0){
            if(x%2!=y%2) count++;
            x/=2;
            y/=2;
        }
        return count;
    }
}
