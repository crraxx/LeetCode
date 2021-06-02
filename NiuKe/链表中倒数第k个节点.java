package NiuKe;

import java.util.Stack;

public class 链表中倒数第k个节点 {
    public class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode pHead, int k) {
        // write code here
        Stack<ListNode> stack = new Stack<ListNode>();
        while (pHead != null) {
            stack.push(pHead);
            pHead = pHead.next;
        }
        if (k > stack.size()) {
            return null;
        }
        ListNode num = null;
        for (int i = 0; i < k; i++) {
            num = stack.pop();
        }
        return num;
    }
}
