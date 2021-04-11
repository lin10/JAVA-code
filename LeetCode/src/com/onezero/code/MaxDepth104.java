package com.onezero.code;

import com.onezero.objects.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth104 {

    /**
     * 给定一个二叉树，找出其最大深度。
     *
     * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     *
     * 说明: 叶子节点是指没有子节点的节点。
     * 思路：递归
     */
    //递归
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int lCount=0,rCount=0;
        lCount=maxDepth(root.left);
        rCount=maxDepth(root.right);
        return (lCount>rCount?lCount:rCount)+1;
    }

    //BFD广度优先遍历（层序）
    public int maxDepth0(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int count=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size>0){
                TreeNode treeNode = queue.poll();
                if(treeNode.left!=null){
                    queue.offer(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.offer(treeNode.right);
                }
                size--;
            }
            count++;
        }
        return count;
    }

    public int maxDepth1(TreeNode root) {
        if(root==null) return 0;
        return getMaxDepth(root)+1;
    }

    public int getMaxDepth(TreeNode root) {
        if(root==null) return 0;
        int lCount=0,rCount=0;
        if(root.left!=null) lCount++;
        if(root.right!=null) rCount++;
        lCount+=getMaxDepth(root.left);
        rCount+=getMaxDepth(root.right);
        return lCount>rCount?lCount:rCount;
    }
}
