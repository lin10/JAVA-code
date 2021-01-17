package com.onezero.code;

import com.onezero.objects.ListNode;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *         请你将两个数相加，并以相同形式返回一个表示和的链表。
 *         你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *         输入：l1 = [2,4,3], l2 = [5,6,4]
 *         输出：[7,0,8]
 */

public class AddTwoNums0002 {

    public static void main(String[] args){
        ListNode resultNode = null;
        ListNode l1;
        ListNode l2 = new ListNode();
        ListNode fistNode = new ListNode(6);
        l1 = fistNode;
        for(int i=1; i<3; i++){
            ListNode node = new ListNode(i);
            l1.next = node;
            l1=l1.next;
        }
        l1 = fistNode;
        printListNode(l1);
       ListNode l2FistNode = new ListNode(0);
       l2 = l2FistNode;
       int[] arr= {3,0,4};
       for (int i=0; i<arr.length; i++){
           ListNode node = new ListNode(arr[i]);
           l2.next = node;
           l2=l2.next;
       }
       l2 = l2FistNode.next;
       printListNode(l2);
       ListNode resNode = addTwoNumbers(l1,l2);
       printListNode(resNode);
    }

    //打印输出方法
    static void printListNode(ListNode listNode){
        //创建链表节点
        while(listNode!=null){
            System.out.println("节点:"+listNode.val);
            listNode=listNode.next;
        }
        System.out.println();
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resListNode = new ListNode(0);
        ListNode targetNode = resListNode;
        int temp = 0;
        while(l1!=null||l2!=null||temp!=0){
            int val1 = l1!=null?l1.val:0;
            int val2 = l2!=null?l2.val:0;
            int sum = val1+val2+temp;
            //temp标记是否大于10，两数相加大于10进位，除法可以得到是否为1
            temp = sum/10;
            resListNode.next =new ListNode(sum%10);
            resListNode=resListNode.next;
            //如果链表不为空，则执行下个节点
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
        }
        //指向第一个节点的下个节点，即为结果链表
        return targetNode.next;
    }


}
