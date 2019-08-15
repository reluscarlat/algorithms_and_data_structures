package dataStructures.stack;

public class Stack<T> {
    private class Node<T>{
        private Node next;
        private T data;

        public  Node(){}
        public  Node(T data){
            this.data=data;
        }

        public void setNextNode(Node next){
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public void setData(T data) {
            this.data = data;
        }

        public T getData(){
            return data;
        }
    }

    private Node top = null;

    public Stack(){}

    public void put(T data) {
        if(top == null) {
            top = new Node<T>(data);
        } else {
            Node<T> newTop = new Node<T>(data);
            newTop.setNextNode(top);
            top = newTop;
        }
    }

    public T pick() {
        if(top != null) {
            return (T)top.getData();
        } else {
            return null;
        }
    }

    public T pop() {
        if( top == null) {
            return null;
        } else {
            T resultData = (T)top.getData();
            top = top.next;
            return resultData;
        }
    }

}
