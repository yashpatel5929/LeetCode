package linkedlist;

import java.util.HashMap;

public class ClonLinkedList {

    public Node copyRandomList(Node head) {
        Node temp = head;
        HashMap<Node , Node> hm = new HashMap<>();
        while(temp != null) {
            Node copy = new Node(temp.val);
            hm.put(temp , copy);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            Node copyNode = hm.get(temp);
            copyNode.next = hm.get(temp.next);
            copyNode.random = hm.get(temp.random);
            temp = temp.next;
        }
        return hm.get(head);

    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
