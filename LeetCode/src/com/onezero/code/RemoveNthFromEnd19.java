package com.onezero.code;

import com.onezero.objects.ListNode;

public class RemoveNthFromEnd19 {

    /**
     * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
     * 思路：快慢指针，fast指针先走N步，然后slow指針開始走，fast指针走第到头后slow指针走到了倒数第N+1个。
     *       注意：对于走完N步做特殊判断，如果fast为null，需要删除第一个节点，即返回head的next节点，因为第一个节点就是倒数第N个节点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode fast = head;
        ListNode slow = head;
        int index=0;
        while(index<n){
            fast=fast.next;
            index++;
        }
        if(fast==null) return head.next;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return first;
    }
}
