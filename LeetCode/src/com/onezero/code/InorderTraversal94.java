package com.onezero.code;

import com.onezero.objects.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal94 {

    /**
     * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
     * 思路：递归实现，先遍历左子树，再遍历右子树，左子树没值后读父节点，然后再读右子树
     *
     *       1
     *     /  \
     *    2   3
     *    \
     *    4
     */

    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        ldr(root);
        return list;
    }

    public void ldr(TreeNode root){
        if(root ==null) return;
        ldr(root.left);
        list.add(root.val);
        ldr(root.right);
    }
}
