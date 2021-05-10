package com.onezero.code;

import com.onezero.objects.TreeNode;

public class LeafSimilar872 {
    /**
     * 请考虑一棵二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
     */

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        String str1 = ldr(root1,"");
        String str2 = ldr(root2,"");
        return str1.equals(str2);
    }

    public String ldr(TreeNode root,String str){
        if(root==null) return str;
        if(root.left==null&&root.right==null){
            str+='|';
            str=str+root.val;
            return str;
        }
        return ldr(root.left,str)+ldr(root.right, str);
    }
}
