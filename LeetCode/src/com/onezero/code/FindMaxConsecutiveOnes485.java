package com.onezero.code;

public class FindMaxConsecutiveOnes485 {

    /**
     * 给定一个二进制数组， 计算其中最大连续1的个数。
     * 输入: [1,1,0,1,1,1]
     * 输出: 3
     * 解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
     *
     * @param nums 数组
     * @return 返回最大和
     */
    private  static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int sum=0;
        //遍历整个数组，用sum记录每一组1的和
        for (int num : nums) {
            //如果第i个元素是0，则比较sum跟max，并重置sum为0
            if (num == 0) {
                if (max <= sum) max = sum;
                sum = 0;
            }
            sum += num;
        }
        //考虑到可能是以1结束的，所以最后对max和sum再做一次判断
        if (max<=sum) max=sum;
        return max;
    }

    public static void main(String[] args){
        int[] arr={1,1,0,1,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
