package com.onezero.code;

import java.util.Arrays;

public class ShipWithinDays1011 {

    /**
     * 传送带上的包裹必须在 D 天内从一个港口运送到另一个港口。
     *
     * 传送带上的第 i 个包裹的重量为 weights[i]。每一天，我们都会按给出重量的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。
     *
     * 返回能在 D 天内将传送带上的所有包裹送达的船的最低运载能力。
     *
     * 思路：利用二分法来查找
     */

    public int shipWithinDays(int[] weights, int D) {
        int max = Arrays.stream(weights).sum();
        int min = Arrays.stream(weights).max().getAsInt();
        while(min<max){
            int mid = (min+max)/2;
            if(verifyTransDays(weights,D,mid)){
                max=mid;
            }else{
                min=mid+1;
            }
        }
        return min;
    }

    private boolean verifyTransDays(int[] weights, int D, int W){
        int count=1;
        int weight=0;
        for(int i=0;i<weights.length;i++){
            weight+=weights[i];
            if(weight>W){
                count++;
                weight=weights[i];
            }
            if(count>D){
                return false;
            }
        }
        return true;
    }
}
