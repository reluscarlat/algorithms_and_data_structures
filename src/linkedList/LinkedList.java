package linkedList;

public class LinkedList {
    private Node root;
    private Node current;
    public void add(int val) {
        if(root == null) {
            root = new Node(val);
            current = root;
        } else {
            current.next = new Node(val);
            current = current.next;
        }
    }
    public Node get(int i) {
        Node c = root;
        while(i-- != 0) {
            c = c.next;
        }
        return c;
    }

    public void delete(int i) {
        Node c = root;
        while(i-- > 1) {
            c = c.next;
        }
        c = c.next.next;
    }
}
