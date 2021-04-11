package com.onezero.code;

import com.onezero.objects.ListNode;

public class MergeTwoLists21 {

    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     * 思路：循环两个链表，比较将小的节点依次赋给新的链表
     */

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head = new ListNode(0);
        ListNode newNode = head;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                newNode.next = l1;
                l1=l1.next;
            }else{
                newNode.next = l2;
                l2=l2.next;
            }
            newNode = newNode.next;
        }

        if(l1==null) newNode.next = l2;
        if(l2==null) newNode.next = l1;
        return head.next;
    }
}
