package com.onezero.code;

import com.onezero.objects.ListNode;

public class GetIntersectionNode160 {
    /**
     * 编写一个程序，找到两个单链表相交的起始节点。
     *
     * 思路：遍历两个链表，A链表遍历完后从头开始遍历B链表，B链表遍历完后从头遍历A链表，如果两个有相同节点，终会相遇
     */


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) return null;
        ListNode hA = headA;
        ListNode hB = headB;

        while(hA!=hB){
            hA= hA==null?headB:hA.next;
            hB= hB==null?headA:hB.next;
        }
        return hA;
    }
}
