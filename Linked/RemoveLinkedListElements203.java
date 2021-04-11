package Linked;

import java.util.LinkedList;
import java.util.Random;

public class RemoveLinkedListElements203 {
    /*
    删除链表中等于给定值 val 的所有节点。
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ListNode head = new ListNode(linkedList.element());
        for (int i = 0; i < 5; i++) {
            linkedList.add(r.nextInt(100));
        }
       removeElements(head,6);
    }

    public static ListNode removeElements(ListNode head, int val) {
       ListNode dum = new ListNode(0);
       ListNode pre = new ListNode();
       dum.next = head;
       pre = dum;
       while (head != null){
           if (head.val == val){
               pre.next = head.next;
               head = head.next;
           }else{
               pre = head;
               head = head.next;
           }
       }
       return dum.next;
    }
}
