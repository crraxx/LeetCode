package EveryDay;

import java.util.ArrayList;

public class PalindromeLinkedList234 {
    /*
    请判断一个链表是否为回文链表。
        示例 1:
        输入: 1->2
        输出: false
        示例 2:
        输入: 1->2->2->1
        输出: true
     */

    public boolean isPalindrome(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        while(head != null){
            list.add(head);
            head = head.next;
        }

        int left = 0;
        int right = list.size()-1;
        while(left < right){
            if (list.get(left).val != list.get(right).val){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
