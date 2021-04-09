package com.onezero.code;

import com.onezero.objects.ListNode;

public class HasCycle141 {

    /**
     * 给定一个链表，判断链表中是否有环。
     *
     * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
     *
     * 如果链表中存在环，则返回 true 。 否则，返回 false 。
     *
     * 思路：快慢两个指针，快指针每次走两步，慢指针每次走一步，如果有环则最终会相遇
     */

    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null||head.next.next==null) return false;
        ListNode node1 = head;
        ListNode node2 = head;
        while(node2!=null&&node2.next!=null){
            node1 = node1.next;
            node2 = node2.next.next;
            if(node1==node2) return true;
        }
        return false;
    }
}
