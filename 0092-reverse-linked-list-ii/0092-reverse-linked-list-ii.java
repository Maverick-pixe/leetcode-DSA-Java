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
    public void reverse(List<Integer> list,int left,int right ){
        while(left<right){
        int temp = list.get(left);
        list.set(left,list.get(right));
        list.set(right,temp);
        left++;
        right--;
        }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> vals = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            vals.add(curr.val);
            curr = curr.next;
        }
        reverse(vals,left-1,right-1);
        curr = head;
        
        int i = 0;
        while(curr != null){
           curr.val = vals.get(i++);
           curr = curr.next;
        }
        return head;
    }
    }
