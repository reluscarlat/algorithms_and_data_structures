package dataStructures.tree;

import java.util.ArrayList;
import java.util.List;

/*
            50
      10           80
   5     30     70     90
       20  40         85

 */

public class BSTChecker {
    Node tree;

    public BSTChecker(){
        tree = new Node(6);
        tree.add(7);
        tree.add(3);
        tree.add(1);
        tree.add(5);

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);

        n6.left = n3;
        n6.right = n7;

        n3.left = n2;
        n3.right = n4;

        n7.left = n1;
        n7.right = n9;

//        this.tree = n6;
    }

    public void getDataInOrder(Node current, List<Integer> list) {
        if(current.left != null) getDataInOrder(current.left, list);
        list.add(current.data);
        if(current.right != null) getDataInOrder(current.right, list);
    }

    public void testBSTChecker() {
        boolean checker = true;
        List<Integer> list = new ArrayList<Integer>();
        getDataInOrder(this.tree,list);

        int length = list.size();
        for(int i = 0; i<length-1; i++) {
            if(list.get(i) > list.get(i+1)){
                checker = false;
                break;
            }
        }
        if(checker) {
            System.out.println("Is Binary Search Tree.");
        } else {
            System.out.println("Is not Binary Search Tree.");
        }
     }

     public void testBSTChecker2 (){
        if (check(tree, Integer.MIN_VALUE, Integer.MAX_VALUE) ) {
            System.out.println("IS BST");
        } else {
            System.out.println("IS NOT BST");
        }
     }
     public boolean check(Node current, int min, int max) {
        if(current == null) return true;
        if(min > current.data || current.data >max ) return false;
        return check(current.left, min, current.data) && check(current.right, current.data, max);
     }

    //public void testBSTChecker() {
//        if(check(Integer.MIN_VALUE, this.tree, Integer.MAX_VALUE)) {
//            System.out.println("Balanced");
//        } else {
//            System.out.println("Not Balanced");
//        }
//    }

}
