package Linked;

public class ReverseLinkedList206 {
    public class ListNode {
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

    public ListNode reverseList(ListNode head) {
        ListNode dum = new ListNode(0);
        ListNode hNext = new ListNode();
        ListNode dNext = new ListNode();
        dum.next = head;
        while (head != null && head.next != null) {
            dNext = dum.next;
            hNext = head.next;
            
            dum.next = hNext;
            head.next = hNext.next;
            hNext.next = dNext;
        }
        return dum.next;
    }
}
