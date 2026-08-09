class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;

        // Use a stack to simulate DFS
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        Node prev = new Node(0); // dummy previous node

        while (!stack.isEmpty()) {
            Node curr = stack.pop();

            // Link current node to previous
            prev.next = curr;
            curr.prev = prev;

            // Push next first (processed later), then child (processed sooner)
            if (curr.next != null) {
                stack.push(curr.next);
            }
            if (curr.child != null) {
                stack.push(curr.child);
                curr.child = null; // clear the child pointer
            }

            prev = curr;
        }

        // Detach the dummy node
        head.prev = null;
        return head;
    }
}