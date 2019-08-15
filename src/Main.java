import dataStructures.graph.GraphHashTable;
import dataStructures.tree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
//        PROBLEMS:
//            String a = "abc";
//            BinarySearchTree bst = new BinarySearchTree();
//            bst.changeString(a);
//        System.out.println(a);
//
//        BinarySearchTree.Node node = bst.new Node(22);
//        bst.changeNodeValue(node);
//        System.out.println(node.data);

//        STRING REVERSE
//        System.out.println(StringReverse.reverse("ABC"));

//        QUICK-SORT
//        int array[] = {2,5,9,10,1,4,11,12};
////        SortingAlgorithms.placePivot(array, 0, array.length - 1);
//        SortingAlgorithms.quickSort(array);
//        for (int i = 0; i<array.length; i++) {
//            System.out.println(array[i]);
//        }

//        BUBBLE-SORT
//        int array[] = {1,4,3,2,9,7,4,5,10,6};
//        SortingAlgorithms.bubbleSort(array);
//        for (int i = 0; i<array.length; i++) {
//            System.out.println(array[i]);
//        }


//        MERGE SORT
//        int array[] = {1,4,2,3,9,7,4,5,10,6};
//        SortingAlgorithms.mergeSort(array);
//        for (int i = 0; i<array.length; i++) {
//            System.out.println(array[i]);
//        }
//        int array1[] = {1,5,7,8};
//        int array2[] = {2,4,6,8,9,};
//        int array3[] = SortingAlgorithms.merge2(array1,array2);
//        for(int i=0; i<array3.length; i++) {
//            System.out.println(array3[i]);
//        }

//        BINARY SEARCH - RECURSIVE
//        BinarySearch bs = new BinarySearch();
//        int array[] = new int[160000000];
//        for(int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }
//        boolean result = bs.arrayContains(array,0,array.length - 1,1577771);
//        System.out.println(result);
//        for(int i = 0; i< array.length; i++) {
//            if(array[i] == 157700771)
//                System.out.println("TRUE");
//        }
//        for(int i=0; i<array.length; i++) {
//            boolean result = bs.arrayContains(array,0,array.length - 1,array[i]);
//            System.out.println(result);
//            System.out.println(bs.binarySearch(array,0,array.length - 1,array[i]));
//        }

//        BINARY SEARCH - ITERATIVE
//        int array[] = new int[16];
//        for(int i = 0; i < array.length; i++) {
//            array[i] = i;
//        }
//        BinarySearch bs2 = new BinarySearch();
//        boolean result2 = bs2.binarySearchIterative(array, 10);
//        System.out.println(result2);

//        PEAK FINDER
//        PeakFinder peakFinder = new PeakFinder();
//        System.out.println(peakFinder.findPickIndex());



//        --------------------------------------------------------------------------------------------------------------


//        DATA STRUCTURES:

//        GRAPHS - Array List
//        Graph myGraph = new Graph();
//        myGraph.addNode("Andrei");
//        myGraph.addNode("Anna");
//        myGraph.addNode("John");
//        myGraph.addNode("Mark");
//        myGraph.addNode("Bob");
//        myGraph.addEdge(0,1);
//        myGraph.addEdge(0,4);
//        myGraph.addEdge(1,3);
//        myGraph.addEdge(1,2);
//        myGraph.addEdge(1,4);
//        myGraph.addEdge(1,0);
//        myGraph.addEdge(3,4);
//        myGraph.addEdge(3,1);
//        myGraph.addEdge(3,2);
//        myGraph.addEdge(2,1);
//        myGraph.addEdge(2,3);
//        myGraph.addEdge(4,0);
//        myGraph.addEdge(4,3);
//        myGraph.addEdge(4,1);
//        myGraph.printGraph();
//        System.out.println("\n");
//        System.out.println("\nHas connection: " +
//                myGraph.dfs("Andrei","John"));
//        System.out.println("\nHas connection: " +
//                myGraph.bfs("Andrei","Mark"));

//        GRAPHS - Hash-Map
        GraphHashTable ght = new GraphHashTable();
        ght.addNode("Andrei", 25);
        ght.addNode("Bob", 24);
        ght.addNode("Mark", 27);
        ght.addNode("John", 30);
        ght.addNode("Tom", 31);
//        ght.printRelations();
        ght.addEdge("Andrei", "Mark");
        ght.addEdge("Andrei", "Tom");
        ght.addEdge("Mark", "Tom");
        ght.addEdge("Mark", "John");
        ght.addEdge("Mark", "Bob");
        ght.addEdge("Tom", "John");
        ght.printRelations();

//        QUEUE
//        Queue<Integer> queue = new Queue<>();
//        queue.put(1);
//        queue.put(2);
//        queue.put(3);
//        queue.put(4);
//
//        System.out.println(queue.pick());
//        System.out.println(queue.pop());
//        System.out.println(queue.pop());
//        System.out.println(queue.pop());
//        System.out.println(queue.pop());
//        System.out.println(queue.pop());
//        queue.put(10);
//        System.out.println(queue.pick());

//        HASH TABLE
//        HashTable<String,Integer> myHashTable = new HashTable<String, Integer>();
//        myHashTable.put("Andrei",21);
//        myHashTable.put("John", 24);
//        myHashTable.put("Mark", 31);
//        System.out.println(myHashTable.containsKey("Andrei"));
//        myHashTable.remove("Andrei");
//        System.out.println(myHashTable.containsKey("Andrei"));
//        System.out.println(myHashTable.containsKey("John"));
//        myHashTable.remove("John");
//        System.out.println(myHashTable.containsKey("John"));
//        System.out.println(myHashTable.containsKey("Mark"));
//        myHashTable.remove("Mark");
//        System.out.println(myHashTable.containsKey("Mark"));

//        TREE 0.1
//        TreeTest.testContainsFunction();
//        System.out.println("-----------------");
//        TreeTest.testTraverseFunction();
//        BSTChecker bstChecker = new BSTChecker();
//        bstChecker.testBSTChecker();
//        bstChecker.testBSTChecker2();

//        TREE 0.2
//        BinarySearchTree bst = new BinarySearchTree();
//        bst.add(10);
//        bst.add(5);
//        bst.add(15);
//        bst.add(3);
//        bst.add(7);
//        bst.add(13);
//        bst.add(18);
//        bst.delete(5);
//        bst.printPreOrder();
//        System.out.println(bst.contains(18));



//        LINKED LIST
//        TestSimpleLinkedList t = new TestSimpleLinkedList();
//        t.printDataTest();
//
//        BITE
//        byte a = 4;
//        byte b = 5;
//        System.out.println(a&(1<<2));

//        RECURSION
//        System.out.println(Fibonacci.fibonacci(4));
//        System.out.println(GraphMatrix.getPathsNumber(0,0));

//        STACK
//        Stack<Integer> myStack = new Stack<Integer>();
//        myStack.put(1);
//        myStack.put(2);
//        myStack.put(3);
//        myStack.put(4);
//        myStack.put(5);
//        System.out.println(myStack.pick());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pick());
//        System.out.println(myStack.pick());
    }
}
