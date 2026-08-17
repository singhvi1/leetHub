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
        Stack<Integer> st = new Stack<>();
        if (head == null || head.next == null) return true;

        ListNode temp = head;
        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while (temp.next != null) {
            int ele = st.pop();
            if (temp.val != ele) {
                return false;
            }
            temp = temp.next;
        }
        return true;
        
    }
}