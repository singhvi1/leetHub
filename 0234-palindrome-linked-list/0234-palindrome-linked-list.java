/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     ListNode left;

    public boolean isPalindrome(ListNode head) {
        left = head;
        return check(head.next);
    }

    private boolean check(ListNode right) {
        if (right == null) {
            return true;
        }

        boolean res = check(right.next);
        if (res == false) {
            return false;
        }
        if (right.val != left.val) {

            return false;
        }
        left = left.next;
        return true;
    }
}