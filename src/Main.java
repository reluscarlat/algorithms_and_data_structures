import algorithms.recursion.Fibonacci;
import dataStructures.graph.GraphHashTable;
import dataStructures.tree.BinarySearchTree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        isPalindromeString("ababa");
//        sampleOfflineData(new int[]{1,2,3,4,5,6,7,8,9}, 4);
//        findPrimes(30);
//        sellStockTwice(new int[] {12,11,13,9,12,8,14,13,15});
//        deleteDuplicates2(new int[] {1,2,2,2,3,4,5,5,6,7,8,8});
//        sellStockOnce2(new int[] {310, 315, 275, 295, 260, 270, 290, 230, 255, 250});
//        System.out.println(advanceTroughArray(new int[]{3,2,0,0,2,0,1}));

//        int i = 20;
//        do{
//            System.out.println(generateNumberBetween(5,11));
//        } while (i-- > 0);

//        System.out.println(binaryMultiply(2,7));
//        findClosestInteger("10010010");
//    swapBits("10010011",6 , 7);
//        checkWordParity("1000");
//        A data[] = new A[]{
//                new A(1,12),
//                new A(10,20),
//                new A(5,7)
//        };
//        Arrays.sort(data, (a,b) -> {
//            return - Integer.compare(a.y, b.y);
//        });
//
//        for(int i = 0; i < data.length; i++) {
//            System.out.println(data[i] );
//        }
//
//        System.out.println(Integer.compare(2,1));
//        computeMaximumSubarray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
//        computeMaximumSubarray(new int[]{0,3,-4,5,-6,7,1,6});
//        intertwineArange(new int[]{0,3,-4,5,-6,7,1,6});
//        findCoinsChange(new int[] {2,1,5,10,15});
//        computePolishNotation("5 9 8 + 4 6 * + 7 - *");
        //                              3  4  12 6
//        xModuloPowerOfTwo(649, 64);
//        for(int i = 1; i <= 100; i++) {
//            isPowerOfTwo(i);
//        }
//        numberOfOnes("00010011");
//        PROBLEMS:
//            add(20,30);

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
//        GraphHashTable ght = new GraphHashTable();
//        ght.addNode("Andrei", 25);
//        ght.addNode("Bob", 24);
//        ght.addNode("Mark", 27);
//        ght.addNode("John", 30);
//        ght.addNode("Tom", 31);
////        ght.printRelations();
//        ght.addEdge("Andrei", "Mark");
//        ght.addEdge("Andrei", "Tom");
//        ght.addEdge("Mark", "Tom");
//        ght.addEdge("Mark", "John");
//        ght.addEdge("Mark", "Bob");
//        ght.addEdge("Tom", "John");
//        ght.printRelations();

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
    //    public static int add(int x, int y) {
//        while( y != 0) {
//            String s01 = String.format("%8s", Integer.toBinaryString(x & 0xFF)).replace(' ', '0');
//            System.out.println("X = "+s01);
//            String s02 = String.format("%8s", Integer.toBinaryString(y & 0xFF)).replace(' ', '0');
//            System.out.println("Y = "+s02);
//
//            int carry = x & y;
//            String s1 = String.format("%8s", Integer.toBinaryString(carry & 0xFF)).replace(' ', '0');
//            System.out.println("C = "+s1);
//            // Sum of bits of x and
//            // y where at least one
//            // of the bits is not set
//            x = x ^ y;
//            String s2 = String.format("%8s", Integer.toBinaryString(x & 0xFF)).replace(' ', '0');
//            System.out.println("X = "+s2); // 00000010
//
//            // Carry is shifted by
//            // one so that adding it
//            // to x gives the required sum
//            y = carry << 1;
//            String s3 = String.format("%8s", Integer.toBinaryString(y & 0xFF)).replace(' ', '0');
//            System.out.println("Y = "+s3); // 00000010
//            System.out.println();
//        }
//        return x;
//    }
//    0,3,-4, 5,-6, 7,1,6
//      3,    4,    5,6,12
//    0,  -1,   -2,
//


    private static void swapBits(String number, int i, int j) {
        int word = Integer.parseInt(number, 2);
        int iVal = word & 1 << i;
        int jVal = word & 1 << j;
        if(iVal != jVal) {
            word = word ^ (1 << j | 1 << i);
        }
        /*
        *    10010110   , 0,2
        *    00000101
        *XOR=10010011
        *
        * */
        for(int k = number.length() - 1; k > -1; k--) {
            System.out.print(""+ ( ((int)word&(1<<k)) != 0 ? 1:0) );
        }
    }

    private static void checkWordParity(String number) {
        int word = Integer.parseInt(number, 2);
        boolean parity = true;
        while(word != 0) {
            word = word & (word - 1);
            parity = !parity;
        }
        System.out.println("Parity of " + number + " is " + ((parity)? 0 : 1) );
    }

    private static class A {
        int x;
        int y;
        public A(int x,int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "A{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    private static void computeMaximumSubarray(int array[]) {
        int min = 0, max = 0, maxDiff = 0;
        int sumPlot[] = new int[array.length];
        sumPlot[0] = array[0];

        for(int i = 1; i < array.length; i++) {
            sumPlot[i] = sumPlot[i-1] + array[i];
            if(sumPlot[i-1] < sumPlot[min]
                    && sumPlot[max] - sumPlot[i-1] >= maxDiff) {
                min = i-1;
                maxDiff = sumPlot[max] - sumPlot[min];
            }
            if(sumPlot[i] > sumPlot[max]) {
                max = i;
                maxDiff = sumPlot[max] - sumPlot[min];
            }
        }
        System.out.println("Max Sum = " + maxDiff);
    }

    // 1,2,3,4,5,6,7,8
    private static void swap(int i, int j, int array[]) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    private static void intertwineArange(int array[]) {
        for(int i = 0; i < array.length - 1; i++) {
            if(i % 2 == 0 && array[i] > array[i+1]) {
                swap(i,i+1, array);
                continue;
            }
            if(i % 2 != 0 && array[i] < array[i+1]) {
                swap(i, i+1, array);
                continue;
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(" " + array[i]);
        }
    }
//  1, 1, 5,     10, 15
//  1, 2, 3, 4
    private static void findCoinsChange(int array[]) {
        Arrays.sort(array); // O(n*log(n))
        int len = array.length; //
        int sumPlot[] = new int[len];
        sumPlot[0] = array[0];
        for( int i = 1; i < len; i++) {  // O(n)
            if(sumPlot[i-1] < array[i] - 1) {
                System.out.println("It can't return rest equals with " + (int)(sumPlot[i-1] + 1));
                return;
            }
            sumPlot[i] = sumPlot[i-1] + array[i]; // O(1)
        }
        System.out.println("It can't return rest equals with " + (int)(sumPlot[len-1] + 1));

    }

    private static void computePolishNotation(String expression) {
        String initailExpression = expression;
        expression = expression.replaceAll(",","");
        expression = expression.replaceAll(" ","");
        Stack<Integer> stack = new Stack<>();
        int a = 0, b = 0;
        for(int i = 0; i < expression.length(); i++) {
            char value = expression.charAt(i);
            switch (value) {
                case '+':
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b+a);
                    break;
                case '-':
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b-a);
                    break;
                case '*':
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b*a);
                    break;
                case '/':
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b/a);
                    break;
                case '^':
                    a = stack.pop();
                    b = stack.pop();
                    stack.push((int)Math.pow(b,a));
                    break;
                default:
                    stack.push(Integer.parseInt(value+""));
                    break;
            }
            System.out.println(stack.toString());
        }
        System.out.println(initailExpression + " = " + stack.pop());
    }

    private static void numberOfOnes(String number) {
        int x = Integer.parseInt(number,2);
        System.out.println(number+" = " + x);
        int counter = 0;
        while(x != 0) {
            x = x&(x-1);
            counter++;
        }
        System.out.println("Number of ones is " + counter + ".");
    }

    private static void isPowerOfTwo(int number) {
        int result  = number & (number - 1);
        if(result == 0) {
            System.out.println(number + " is power of 2.");
        } else {
            System.out.println(number + " is not power of 2");
        }
    }

    private static void xModuloPowerOfTwo(int number, int powerOfTwo) {
        int numberCopy = number;
        int powerOfTwoCopy = powerOfTwo;
        while (number > powerOfTwo) {
            number = number&(~powerOfTwo);
            powerOfTwo = powerOfTwo << 1;
        }
        /*
        * 144 = 1100 1101        1100 1101
        * 64  = 0100 0000   ~ => 1011 1111
        *                    AND 1000 1101
        * */
        System.out.println(numberCopy + " % " + powerOfTwoCopy + " = " + number);

    }

    // There are two main cases:

    // 1)   When LSB is '0':
    //      In this case the first '1' must be shifted with one position to right;
    //                Input: "10001000"
    //      Expected output: "10000100"

    // 2)   When LSB is '1':
    //      In this case the first '0' must be set to '1', and first '1' must be set to '0'
    //                Input: "10000111"
    //      Expected output: "10001110"

    private static void findClosestInteger(String word) { // ex: word = "10001000"

        System.out.println(word);           // Print initial binary format of the number
        int x = Integer.parseInt(word, 2);  // Convert String to int

        if((x & 1) == 0) {                  // Evaluates LSB value
            // Case when LSB = '0':
            // Input:  x = 10001000

            int firstOne = x & ~(x -1);     // get first '1' position (from right to left)
            // firstOne = 00001000
            x = x & (x - 1);                // set first '1' to '0'
            // x = 10000000
            x = x | (firstOne >> 1);        // "shift" first '1' with one position to right
            // x = 10000100

        } else {
            // Case when LSB = '1':
            // Input: x = 10000111

            int firstZero = ~x & ~(~x - 1); // get first '0' position (from right to left)
            // firstZero = 00001000
            x = x & (~1);                   // set first '1', which is the LSB, to '0'
            // x = 10000110
            x = x | firstZero;              // set first '0' to '1'
            // x = 10001110

        }

        for(int i = word.length() - 1; i > -1  ; i--) {       // print the closest integer with same weight
            System.out.print("" + ( ( (x & 1 << i) != 0) ? 1 : 0) );
        }
    }

    private static int binaryAdd(int x, int y) {
        // 1011
        //+0001
        //=1100
        int i = 1;
        int carry = 0;
        while(y != 0) {
            carry = (x & y) << 1;
            x = x ^ y;
            y = carry;
        }
        return x;
    }

    private static int binaryMultiply(int x, int y) {
        y = binarySubstraction(y,1);
        int copy = x;
        while(y != 0) {
            x = binaryAdd(x, copy);
            y = binarySubstraction(y, 1);
        }
        return x;
    }



    private static int binarySubstraction(int x, int y) {
//        1001
//        0101
//        1110    => 0001 & 0101 => 0001 << 1 => 0010
//        XOR = > x = 1011
//                    0010 = 1001
//
        int carry = 0;
        while(y != 0) {
            carry = ((~x) & y) << 1;
            x = x ^ y;
            y = carry;
        }
        return x;
    }

    private static int bitRandomGenerator() {
        if((int)(Math.random()*10) % 2 == 1) {
            return 1;  // 1
        } else {
            return 0; // 0
        }
    }

    // [a, b]
    // [1, 5]

    // 5 = > generate number < 2pow3  = 8            1000
    //

    // 1110 = 14
    // 1101

    private static int generateNumberBetween(int a, int b) {
        int aux = b - a;
        int i = 0;
        int result  = 0;
        // 1000 = 8
        // 0001
        //
        // 0000 = 0001 | 0011
        if((aux & (aux - 1)) == 0) {
            while((aux & 1<<i) == 0 ) {
                result = (result | (bitRandomGenerator() << i));
                i++;
            }
            result = result + bitRandomGenerator() + a;
        } else {
            do {
                aux = aux & (aux - 1);
            } while ((aux & (aux - 1)) != 0);
            aux = aux << 1;
            while((aux & 1<<i) == 0 ) {
                result = (result | bitRandomGenerator() << i) ;
                i++;
            }
            result = result + bitRandomGenerator() + a;
            if(result > b) {
                result = generateNumberBetween(a,b);
            }
        }
        return result;
    }

    // 3 3 1 0 2 0 1
    // 0 1 2 3 4 5 6
    private static boolean advanceTroughArray(int arr[]) {
        int i = arr.length - 1;
        boolean flag = true;
        while( flag == true) {
            flag = false;
            while(arr[i] != 0) {
                i--;
                if(i == 0) {
                    return true;
                }
            }
            for(int j = 0; j < i; j++) {
                if(arr[j] > i - j) {
                    i = j;
                    flag = true;
                    break;
                }
            }
        }
        return false;
    }

    private static void deleteDuplicates1(int array[]) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] == array[i + 1]) {
                array[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(array);
        System.out.println();
        for(int i = array.length - 1; i >= 0; i--) {
            if(array[i] == Integer.MAX_VALUE) {
                array[i] = 0;
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void deleteDuplicates2(int array[]) {
        int k = 1;
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for(int i = 1; i < array.length - 1; i++) {
            if(array[i] != array[i-1]) {
                array[k++] = array[i];
            }
        }
        for(int i = k; i < array.length; i++) {
            array[i] = 0;
        }

        System.out.println();
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void sellStockOnce(int array[]) {
        int min = 0;
        int max = 1;
        int profit = 0;
        for(int i = 1; i < array.length; i++) {
            max = i;
            if(array[i] < array[min]) {
                min = i;
            }
            if(max > min && profit < array[max] - array[min]) {
                profit = array[max] - array[min];
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Profit = " + profit);
    }

    private static void sellStockOnce2(int array[]) {
        int min = array[0];
        int maxProfit = 0;
        for(int i = 1; i < array.length; i++) {
            maxProfit = Math.max(maxProfit, array[i] - min);
            min = Math.min(min, array[i]);
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println("Profit = " + maxProfit);
    }

    private static void sellStockTwice(int array[]) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((a,b) -> -Integer.compare(a.intValue(), b.intValue()));
        int min = array[0];
        int prevMin = -1;
        int profit = 0;
        for(int i = 1; i < array.length; i++) {  //O(n)
            if(array[i] - min > profit) {
                profit = array[i] - min;
                if(prevMin == min) {
                    q.poll(); // O(1)
                }
                q.add(profit); // O(log n)
            }
            prevMin = min;
            min = Math.min(array[i], min);
            System.out.println(q.toString());
        }
        System.out.println("Profit 1 = " + q.poll());
        System.out.println("Profit 2 = " + q.poll());
    }  // O(n*log(n))


    public static void findPrimes(int n) {
        boolean arr[] = new boolean[n];
        for(int i = 0; i < n; i++) {
            arr[i] = true;
        }
        arr[0] = true;
        arr[1] = true;
        for(int i = 2; i < n/2; i++) {
            arr[i*2] = false;
        }
        arr[2] = true;
        for(int i = 3; i < n/3; i++) {
            arr[i*3] = false;
        }
        arr[3] = true;
        for(int i = 5; i < n/5; i++) {
            arr[i*5] = false;
        }
        for(int i = 7; i < n/7; i++) {
            arr[i*7] = false;
        }
        arr[7] = true;
        for(int i = 0; i < n; i++) {
            if(arr[i]) System.out.print(i+" ");
        }
    }

    // 1 2 3 4 9 6 2 3  5

    public static void sampleOfflineData(int arr[], int k) {
        int i = 0;
        int result[] = new int[k];
        while(i != k) {
            int rand = (int)(Math.random()*(double)(arr.length - 1 - i));
            result[i] = arr[rand];
            swap(rand, arr.length - 1 - i, arr);
            i++;
        }
        for(int j = 0; j < k; j++) {
            System.out.print(result[j] + " ");
        }
    }

    public static void isPalindromeString(String s) {
        for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                System.out.println(s + " is not palindrome.");
                return;
            }
        }
        System.out.println(s + " is palindrome.");
    }




























}
