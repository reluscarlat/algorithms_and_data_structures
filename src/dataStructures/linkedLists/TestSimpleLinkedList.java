package dataStructures.linkedLists;

public class TestSimpleLinkedList {
    public void printDataTest() {
        SimpleLinkedList list = new SimpleLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.printNodes();
    }
}
