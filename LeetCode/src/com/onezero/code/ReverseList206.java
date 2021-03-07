package com.onezero.code;

import com.onezero.objects.ListNode;

public class ReverseList206 {

    /**
     * 反转一个单链表。
     * 采用迭代的方法，如果链表是a->b->c,那么按照b.next=a,c.next=b实现翻转
     */
    //输入: 1->2->3->4->5->NULL
    //输出: NULL<-1<-2<-3<-4<-5
    public ListNode reverseList(ListNode head) {
        ListNode resList = null;
        ListNode flagNode = head;
        while(flagNode!=null){
            ListNode tmpNode = flagNode.next;
            flagNode.next = resList;
            resList = flagNode;
            flagNode = tmpNode;
        }
        return resList;

    }
}
