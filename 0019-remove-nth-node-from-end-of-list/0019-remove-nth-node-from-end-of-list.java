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
        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        // System.out.println(size);

        int tar = size - n;
        // System.out.println(tar);
        
        if (tar == 0) {
            return head.next;
        }
        temp = head;
        while (tar > 1 && temp.next !=null) {
            temp = temp.next;
            tar--;
        }
        // System.out.println(temp.val);
        temp.next = temp.next.next;
        return head;
    }
}