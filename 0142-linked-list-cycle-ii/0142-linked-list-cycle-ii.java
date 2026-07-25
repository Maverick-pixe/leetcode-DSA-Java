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
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){       // time complex is o(n);
                slow = head;
                while(slow != fast){
                    slow= slow.next;
                    fast = fast.next;
                }
            return slow;
            }
        }                          // space complex is o(1);
        return null;
    }
}