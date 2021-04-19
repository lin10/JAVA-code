package com.onezero.code;

public class Rob213 {

    /**
     * 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
     *
     * 给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，能够偷窃到的最高金额。
     *
     * 思路：不能那相邻两个房间的钱，用一个新数组res记录前i个的最大值，res[i]=n-2位跟n-1为中的最大值
     */

    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int len = nums.length;
        int[] amount = new int[len+2];
        for(int i=2;i<len+1;i++){
            amount[i]=Math.max(amount[i-2]+nums[i-2],amount[i-1]);
        }
        int res1=amount[len];
        amount[2] = 0;
        for(int i=3;i<len+2;i++){
            amount[i]=Math.max(amount[i-2]+nums[i-2],amount[i-1]);
        }
        return Math.max(res1,amount[len+1]);
    }
}
