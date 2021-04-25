package com.onezero.code;

import com.onezero.objects.TreeNode;

public class IncreasingBST897 {

    /**
     * 给你一棵二叉搜索树，请你 按中序遍历
     * 将其重新排列为一棵递增顺序搜索树，
     * 使树中最左边的节点成为树的根节点，并且每个节点没有左子节点，只有一个右子节点。
     *
     * 思路：遍历重构树
     */

    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        root.right = increasingBST(root.right);
        if(root.left!=null){
            TreeNode treeNode = increasingBST(root.left);
            TreeNode tmpNode = treeNode;
            while(tmpNode.right!=null){
                tmpNode = tmpNode.right;
            }
            tmpNode.right = root;
            root.left = null;
            return treeNode;
        }else{
            return root;
        }
    }
}
