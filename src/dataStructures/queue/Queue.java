package dataStructures.queue;

import java.util.NoSuchElementException;

public class Queue<T> {
//
//    public static class EmptyQueueException extends Exception{
//        public EmptyQueueException(String message) {
//            super(message);
//        }
//    }

    private class Node<T>{
        public T data;
        public Node next;

        public Node(){}

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> bottom;
    private Node<T> top;

    public void put(T data) {
        if(bottom == null) {
            bottom = new Node<T>(data);
            top = bottom;
        } else {
            Node<T> newTop = new Node<T>(data);
            top.next = newTop;
            top = newTop;
        }
    }

    public T pick() {
        if(bottom != null) {
            return bottom.data;
        } else {
            throw new NoSuchElementException();
        }
    }

    public T pop() {
        if(bottom != null) {
            T popData = bottom.data;
            bottom = bottom.next;
            return popData;
        } else {
            throw new NoSuchElementException();
        }
    }




}
