package com.onezero.code;

import java.util.Arrays;

public class RuningSum1480 {

    /**
     * 给一个数组 nums 数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i])
     * 请返回 nums 的动态和。
     *
     * 输入：nums = [1,2,3,4]
     * 输出：[1,3,6,10]
     * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4]
     *
     * 说明：动态和，其实是将数组中每个元素都累加位于该元素之前的所有元素，
     * 对原数组进行处理，相当于从第二个元素开始每一个都是当前元素跟前一个元素的和
     *
     */

    private static int[] runningSum(int nums[]){
        if (nums.length<=1)return nums;
        for (int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,10};
        int[] resNums = runningSum(nums);
        System.out.println(Arrays.toString(resNums));
        //输出结果[1, 3, 6, 16]
    }

}
