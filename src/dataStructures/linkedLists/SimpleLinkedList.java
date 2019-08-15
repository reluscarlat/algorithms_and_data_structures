package dataStructures.linkedLists;

import jdk.nashorn.internal.ir.visitor.SimpleNodeVisitor;

public class SimpleLinkedList {
    private SimpleListNode head;

    public  SimpleLinkedList() {}

    public SimpleLinkedList(int data) {
        this.head = new SimpleListNode(data);
    }

    public void add(int data) {
        SimpleListNode current = this.head;
        if(this.head == null) {
            this.head = new SimpleListNode(data);
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = new SimpleListNode(data);
        }
    }

    public void printNodes() {
        SimpleListNode current = this.head;
        if(current == null) {
            System.out.println("There is no data in the list");
        } else {
            do {
                System.out.println(current.data);
                current = current.next;
            } while(current != null);
        }
    }
}
