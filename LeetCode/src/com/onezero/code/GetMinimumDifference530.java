package com.onezero.code;

import com.onezero.objects.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class GetMinimumDifference530 {

    /**
     * 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
     *
     * 思路：二叉搜索树中序遍历可以从小到大取到节点，再依次比较两两之间的差值
     * */

    private List<Integer> list = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        ldr(root);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            min = Math.min(min,list.get(i+1)-list.get(i));
        }
        return min;
    }

    private void ldr(TreeNode root){
        if(root == null) return;
        ldr(root.left);
        list.add(root.val);
        ldr(root.right);
    }
}
