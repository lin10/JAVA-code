package com.onezero.code;

import com.onezero.objects.ListNode;

public class DeleteDuplicates {

    /**
     * 82.
     * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
     * 返回同样按升序排列的结果链表。
     * 1->1->1->2->3
     * 思路：递归
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode tempNode=head.next;
        //如果头结点和下一个值相同，那么将下一个指针向右移动
        if(head.val == tempNode.val){
            //对当前节点进行判空
            while(tempNode!=null&&head.val == tempNode.val){
                tempNode=tempNode.next;
            }
            head=deleteDuplicates(tempNode);
        }else{
            head.next=deleteDuplicates(tempNode);
        }
        return head;
    }
}
