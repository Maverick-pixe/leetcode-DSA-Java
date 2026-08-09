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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> vals = new ArrayList<>();
        ListNode curr = head;
        int pos = 1;
        while(curr != null){
        if(pos >=left &&  pos <= right){
            vals.add(curr.val);
        }
        curr = curr.next;
        pos++;
        }

        Collections.reverse(vals);
        curr = head;
         pos = 1;
        int idx =0;
        while(curr != null){
            if(pos >=left &&  pos <= right){
            curr.val = vals.get(idx);
            idx++;
        }
        curr= curr.next;
       pos++;
        }
        return head;
    }
    
}