// LC 138. Copy List with Random Pointer
// https://leetcode.com/problems/copy-list-with-random-pointer/

class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        // your code here
    }
}

class Node {
    int val;
    Node next;
    Node random;
    public Node(int val) { this.val = val; this.next = null; this.random = null; }
}
