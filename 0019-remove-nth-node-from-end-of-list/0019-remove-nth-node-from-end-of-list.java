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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // we need to get fast to n steps from start;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        // System.out.println(fast.val);

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // System.out.println(slow.val);
        if (slow.next == head) {
            slow.next = slow.next.next;
            return head.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}