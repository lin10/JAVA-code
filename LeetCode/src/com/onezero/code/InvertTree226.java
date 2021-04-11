package com.onezero.code;

import com.onezero.objects.TreeNode;

public class InvertTree226 {


    /**
     * 翻转一棵二叉树。
     *
     * 思路：递归
     */


    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode left = root.left;
        //交换左子树和右子树
        root.left = invertTree(root.right);
        root.right = invertTree(left);
        return root;
    }
}
