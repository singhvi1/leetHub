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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode mid = midNode(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        left = sortList(left);
        right = sortList(right);
        return mergerLinkedList(left, right);
    }

    public ListNode mergerLinkedList(ListNode head1, ListNode head2) {
        if (head1 == null && head2 == null)
            return null;

        ListNode temp1 = head1;
        ListNode temp2 = head2;

        ListNode ans = new ListNode(-1);
        ListNode temp3 = ans;

        while (temp1 != null && temp2 != null) {

            if (temp1.val <= temp2.val) {
                temp3.next = temp1;
                temp1 = temp1.next;
            } else {
                temp3.next = temp2;
                temp2 = temp2.next;
            }
            temp3 = temp3.next;
        }
        // then add remaining;
        if (temp1 != null) {
            temp3.next = temp1;
        } else {
            temp3.next = temp2;
        }
        return ans.next;
    }

    public ListNode midNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}