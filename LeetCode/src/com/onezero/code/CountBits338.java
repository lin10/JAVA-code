package com.onezero.code;

public class CountBits338 {
    /**
     * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
     *
     * 思路：如下暴力破解，有简单办法下次补上
     */
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for(int i=0;i<=num;i++){
            int sum=0;
            String str = Integer.toBinaryString(i);
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='1'){
                    sum+=1;
                }
            }
            res[i]=sum;
        }
        return res;
    }
}
