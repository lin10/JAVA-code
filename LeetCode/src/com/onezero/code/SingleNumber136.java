package com.onezero.code;

public class SingleNumber136 {

    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 说明：
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     *
     * 思路：使用异或来实现，将所有元素异或，最后的值是唯一的那个元素
     * a^b = b^a
     * 0^a = a
     * a^a = 0
     *
     *
     */

    private static int singleNumber(int[] nums) {
        int result=0;
        for(int num:nums) {
            result = result ^ num;
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr ={2,2,1};
                //{1,1,2,3,4,5,4,5,3,-1,2};
        System.out.println(singleNumber(arr));
    }
}
