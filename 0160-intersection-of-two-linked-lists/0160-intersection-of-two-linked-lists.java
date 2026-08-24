/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int diff = getDiff(headA, headB);
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while (diff != 0) {
            if (diff > 0) {
                temp2 = temp2.next;
                diff--;
            } else {
                temp1 = temp1.next;
                diff++;
            }
        }
        // now both are at same dis

        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2)
                return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }

    private int getDiff(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
       
        int count1 = 0;
        while (temp1 != null) {
            count1++;
            temp1 = temp1.next;
        }
        int count2 = 0;
        temp1 = headB;
        while (temp1 != null) {
            count2++;
            temp1 = temp1.next;
        }
        return (count2 - count1);
    }
}