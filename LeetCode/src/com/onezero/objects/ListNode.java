package com.onezero.objects;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public void ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    public int getLength(){
        ListNode listNode = this;
        int length=0;
        while(listNode!=null){
            listNode=listNode.next;
            length++;
        }
        return length;
    }
}
