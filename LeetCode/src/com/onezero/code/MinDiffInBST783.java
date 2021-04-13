package com.onezero.code;

import com.onezero.objects.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MinDiffInBST783 {

    /**
     * 给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。
     *
     * 思路：中序遍历从小到大获得节点，两两相减得到最小间隔
     */

    private List<Integer> list = new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        ldr(root);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            min=Math.min(min,(list.get(i)-list.get(i-1)));
        }
        return min;
    }

    //中序遍历
    private void ldr(TreeNode root){
        if(root==null) return;
        ldr(root.left);
        list.add(root.val);
        ldr(root.right);
    }
}
