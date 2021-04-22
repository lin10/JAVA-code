package com.onezero.code;

import com.onezero.objects.TreeNode;

public class IsSymmetric101 {

    /**
     * 给定一个二叉树，检查它是否是镜像对称的。
     *           1
     *         /  \
     *       2     2
     *     / \    / \
     *   3   4   4   3
     * 思路：递归
     */

    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return check(root.left,root.right);
    }

    public boolean check(TreeNode node1,TreeNode node2){
        if(node1==null&&node2==null) return true;
        if(node1==null||node2==null||node1.val!=node2.val) return false;
        return check(node1.left,node2.right)&&check(node1.right,node2.left);
    }
}
