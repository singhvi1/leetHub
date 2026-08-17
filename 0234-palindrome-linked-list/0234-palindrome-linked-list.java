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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode nwHead = reverse(slow.next);

        ListNode temp1 = nwHead;
        ListNode temp2 = head;

        while (temp1 != null) {
            if (temp1.val == temp2.val) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else {
                reverse(nwHead);
                return false;
            }
        }
        reverse(nwHead);
        return true;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next; // Store reference to next node
            curr.next = prev; // Reverse current node's pointer
            prev = curr; // Move prev forward
            curr = nextTemp; // Move curr forward
        }
        return prev; // prev is the new head
    }
}