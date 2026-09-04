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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevTemp = null;
        while (temp != null) {

            ListNode tempLastNode = traverseKthNode(temp, k);
            if (tempLastNode == null) {
                if (prevTemp != null) {
                    prevTemp.next = temp;
                    break;
                }
            }
            ListNode front = tempLastNode.next;
            tempLastNode.next = null;

            ListNode tempHead = reverse(temp);
            if (temp == head) {// means first Temp  hai
                head = tempHead;
            } else {
                // connect prevTemp to
                prevTemp.next = tempHead;
            }
            prevTemp = temp;
            temp = front;

        }
        return head;
    }

    public ListNode traverseKthNode(ListNode head, int k) {
        ListNode temp = head;
        while (temp != null && k > 1) {
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public ListNode reverse(ListNode head) {

        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        head.next = null;
        return pre;
    }
}