package com.onezero.code;

import com.onezero.objects.ListNode;

public class RemoveElements203 {

    /**
     * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点
     *
     * 思路：先找到第一个不等于目标值的节点作为头结点，这里注意如果已经循环完链表仍然未找到直接返回为null。
     *       然后对剩下的节点进行遍历，如果当前节点的下一个节点值跟目标值一样，则将节点的下个节点指向下下个节点
     */
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode h = head;
        // ListNode node = head;
        while(head != null&&head.val==val){
            head=head.next;
            h=head;
        }
        if(head==null) return null;
        while(head.next!=null){
            if(head.next.val==val){
                head.next=head.next.next;
            }else{
                head=head.next;
            }
        }
        return h;
    }
}
