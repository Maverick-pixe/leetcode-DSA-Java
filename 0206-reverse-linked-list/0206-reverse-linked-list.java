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
    public ListNode reverseList(ListNode head) {
      if(head == null|| head.next == null) return head;

      Stack<Integer> stack = new Stack<>();    //time complexity is o(n)
      ListNode curr = head;
      while(curr!= null){
        stack.add(curr.val);
        curr = curr.next;
      } 
      curr = head;
      while(curr!= null){
        curr.val = stack.pop();       // space is also O(n);
        curr = curr.next;
      } 
      return head;
    }
}