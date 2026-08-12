/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return null;
        Node curr  = head;

        while(curr != null){
            if(curr.child != null){
               Node next = curr.next;
            
            Node tail = curr.child;
            while(tail.next != null){
                tail = tail.next;
            }
            curr.next = curr.child;
            curr.child.prev = curr;
            tail.next = next;
            if(next != null){
            next.prev= tail;
            }
            curr.child = null;
        }
        curr = curr.next;
    }
    return head;
}
}