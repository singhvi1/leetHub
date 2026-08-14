/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        // ListNode fast = head;
        // ListNode slow = head;

        // while (fast != null && fast.next != null) {
        //     slow = slow.next;
        //     fast = fast.next.next;

        //     if (slow == fast) {
        //         slow = head;
        //         while (slow != fast) {
        //             slow = slow.next;
        //             fast = fast.next;
        //         }
        //         return slow;
        //     }
        // }

        HashSet<ListNode> map = new HashSet<>();

        ListNode temp=head;

        while(temp !=null){
            if(map.contains(temp)) return temp;
            map.add(temp);
            temp=temp.next;
        }

        return null;
    }
}