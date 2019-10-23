import algorithms.recursion.Fibonacci;
import dataStructures.graph.GraphHashTable;
import dataStructures.tree.BinarySearchTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        computeAllPalindromicDecopositions("0204451881");
//        generateSubSetsOfSizeK(new int[]{1,2,3,4}, 3);
//        generatePowerSet(new int[]{1,2,3,4});
//        generatePermutations(new int[]{1,2,3,4,});
//        sortArrayWithRepeatedEntries1();
//        sortArrayWithRepeatedEntries2();
//        removeFirstNameDuplicate();
//        mergeTwoSortedArrays(
//                new int[]{3,7,11,20,21},
//                new int[]{4,8,15,22}
//        );
//        computeIntersectionOfSortedArrays(
//                new int[] {1,2,3,4,5,6,7},
//                new int[] {2,4,6,9,11,16}
//        );
//        computeTheAverageTopThreeScores();
//        findLongestSubarrayWithDistinctEntries("fsfentnwe");
//        findLongestSubarrayWithDistinctEntries2("fsfentnwe");
//        isLetterConstructibleFromMagazine("abbc", "abc");
//        isPalindromicPermutation("aab");
//        System.out.println(minWindow("ADOBECODEBANC","ABC"));
//        findNearestRepeatedWord2(new String[]{"All", "work", "and", "no", "play",
//                "makes", "for", "work", "no", "fun", "and", "no", "results"});
//        String s = "scooby do";
//        char[] aux = s.toCharArray();
//        Arrays.sort(aux);
//        System.out.println(new String(aux));
//        getMinMax(new int[]{5,3,8,7,1,4,9,2});
//    computeLowerSqrt(5);
//        System.out.println(Math.floor(Math.sqrt(300)));
//        longestCommonSubstring("abcdefghijklmoana", "defix");
//        reverseString("abc");

//        List<Integer> list = Arrays.asList(77,1,2,5,3,2,5,9,3,2,8,9,4,6);
//        int k = 4;
//        HashSet<Integer> list2 = new HashSet<>();
//        list.forEach(s-> {
//            if(!list2.contains(s)) {
//                list2.add(s);
//            }
//        });
//        int[] values = new int[list2.size()];
//        int i = 0;
//        for(Integer v : list2) {
//            values[i++] = v;
//        }
//        for(int v: values) {
//            System.out.println(" " + v);
//        }
//        Arrays.sort(values);                // n*log(n)
//
//        System.out.println(values[k - 1]);

        // [1 |2 9 7 |4 | 3 9 | 5]
        //

//        compareHashValues("abcd", "abdc");
//        System.out.println(Integer.MAX_VALUE +" " + (-1 & 0X7FFFFFFF));
//        findSubstring2("abcdefdafdafdafda faddsadsadsadsadw2addqabcdefdafdafdafda faddsadsadsadsadw2addq" +
//                "abcdefdafdafdafda faddsadsadsadsadw2addqabcdefdafdafdafda faddsadsadsadsadw2addq" +
//                "abcdefdafdafdafda faddsadsadsadsadw2addqabcdefdafdafdafda faddsadsadsadsadw2addq" +
//                "abcdefdafdafdafda faddsadsadsadsadw2addqabcdefdafdafdafda faddsadsadsadsadw2addqwereasdsadsadasda","dqwerea");
//        findSubstring1("abracadabra","cada");
//        sinusoidalString("Hello_World!");
//        computeMnemonic(new int[]{2,5});
//        permute(new int[]{1,2,3,4}, 0);
//        reverseSentence(new char[]{'a','n','a',' ','m','e','r','g','e',' ','l','a',' ','m','a','r','e'});
//        baseConvert("615",7,13);
//        System.out.println((new StringBuilder()).append(""+1));
//        convertToInt("1234567089");
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

    public static void convertToInt(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            result = result * 10 + (int)s.charAt(i) - 48;
        }
        System.out.println("For " + s + " result is " + result);
    }


    // s7  = 615, b1 = 7, b2 = 13
    // s10 = 6*7^2 + 1*7^1 + 5*7^0  =  294 + 7 + 5 = 306
    // s15 = 306 / 225 = 1; 81 / 15 =
    public static void baseConvert(String s, int b1, int b2) {
        int base10 = 0;
        int value = 0;
        StringBuilder r = new StringBuilder();
        for(int i = s.length() - 1, j = 0 ; i >= 0 && j < s.length(); i--, j++) {
            base10 = base10 + (Integer.parseInt(s.charAt(j)+"")*(int)Math.pow(7,i));
            System.out.println("base10 = " + base10);
        }
        int t = 1;
        while(base10 / Math.pow(b2,t) > b2){
            t++;
        }
        while(t > -1) {
            value = base10 / (int)Math.pow(b2,t);
            System.out.println("val = " + value);
            if(value < 10 ) {
                r.append(""+value);
            } else {
                r.append((char)(value + 55));  //  A = 65
            }
            base10 = base10 % (int)Math.pow(b2,t);
            t--;
        }
        System.out.println(s + " in base " + b1 + " is equal with " + r + " in base " + b2);
    }

    public static void reverseWord(char arr[], int start, int end) {
        char aux;
        for(int i = start, j = end; i < j; i++, j--) {
            aux = arr[i];
            arr[i] = arr[j];
            arr[j] = aux;
        }
    }

    public static void reverseSentence( char arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        reverseWord(arr,0,arr.length - 1);
        int left = 0;
        int right = -1;
        while(right < arr.length) {
            left = right + 1;
            while(arr[right + 1] != ' ' && right < arr.length) {
                right++;
            }
            reverseWord(arr, left, right);
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println("\nright = " + right);
            right++;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

//    public static void permute2(List<int[]> result, int arr[], int start) {
//        for(int i = start + 1; i < arr.length; i++) {
//            swap(start, i, arr);
//            int r[] = new int[arr.length];
//            for(int j = 0; j < arr.length; j++) {
//                r[j] = arr[j];
//            }
//            result.add(r);
//            for( int k = 0; k < r.length; k++) System.out.print(" " + r[k]);
//            System.out.println();
//            permute(result, r, start + 1);
//        }
//    }


    //   123
    /*                          123
     i = 0        123           213             321
     i = 1   123   132     213   231        321   312
     i = 2   123   132
            */


    //  213 321
    //

    public static void permute(int arr[], int start) {
        for(int i = start; i < arr.length; i++) {
            if(start == arr.length - 1) {
                for( int j = 0; j < arr.length; j++) {
                    System.out.print(" " + arr[j]);
                }
                System.out.println();
            }
            swap(start, i,arr);
            permute(arr, start + 1);
            swap(start, i, arr);
        }
    }

    public static List<String> multiplySet(List<String> l1, String l2) {
        List<String> result =  new ArrayList<>();
        for(String v1 : l1) {
            for(int i = 0; i < l2.length(); i++) {
                result.add(v1.concat(l2.charAt(i)+""));
            }
        }
        return result;
    }
    public static void computeMnemonic(int arr[]) {
        String map[] = new String[]{
            "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs","tuv", "xyzw"
        };
        List<String> result = new ArrayList<>();
        for(int i = 0; i< map[arr[0]].length(); i++) {
            result.add(map[arr[0]].charAt(i)+"");
        }
        for(int i = 1; i < arr.length; i++) {        // 0789123734
            result = multiplySet(result, map[arr[i]]);
        }
        for(String s : result) {
            System.out.println(s);
        }
    }

    private static void sinusoidalString(String s) {
        System.out.println(s);
        for(int i  = 1; i < s.length(); i += 4) {
            System.out.print(s.charAt(i));
        }
        for(int i  = 0; i < s.length(); i += 2) {
            System.out.print(s.charAt(i));
        }
        for(int i  = 3; i < s.length(); i += 4) {
            System.out.print(s.charAt(i));
        }
    }

    public static void hashFunction(String s) {
        int hashValue = 0;
        int g = 31;
        int len = 100;
        for(int i = 0; i < s.length(); i++) {
            hashValue = hashValue * g + s.charAt(i);
        }
        hashValue = hashValue & 0x7FFFFFFF;
        hashValue = hashValue % len;
        System.out.println("Hash value for " + s + " is " + hashValue);
    }

    public static void compareHashValues(String s1, String s2) {
        hashFunction(s1);
        hashFunction(s2);
    }


    public static void findSubstring1(String s, String c) {
        if(s.length() < c.length()) {
            System.out.println(s.toUpperCase() + " doesn't contains substring " + c.toUpperCase());
            return;
        }
        boolean containsSubstring = false;
        for(int i = 0; i < s.length() - c.length(); i++) {
            if(c.hashCode() == s.substring(i, i + c.length()).hashCode()) {
                containsSubstring = true;
                for(int j = i; j < i + c.length(); j++) {
                    if(s.charAt(j) != c.charAt(j - i)) {
                        containsSubstring = false;
                    }
                }
                if(containsSubstring) {
                    System.out.println(s.toUpperCase() + " contains substring " + c.toUpperCase());
                    return;
                }
            }
        }
        System.out.println(s.toUpperCase() + " doesn't contains substring " + c.toUpperCase());
    }

    public static void findSubstring2(String s, String c) {
        System.out.println(s);
        System.out.println(c);
        if(s.length() < c.length()) {
            System.out.println("It doesn't contains the substring.");
        }
        int cHashValue = 0;
        int sHashValue = 0;
        boolean containsSubStr = false;
        for(int i = 0 ; i < c.length(); i++) {
            cHashValue += c.charAt(i);
        }
        for(int i = 0 ; i < c.length(); i++) {
            sHashValue += s.charAt(i);
        }

        for(int i = 0; i < s.length() - c.length(); i++) {
            if(cHashValue == sHashValue) {
                containsSubStr = true;
                for(int j = 0; j < c.length(); j++) {
                    if(s.charAt(i+j) != c.charAt(j)) {
                        containsSubStr = false;
                    }
                }
                if(containsSubStr) {
                    System.out.println("It contains the substring.");
                    return;
                }
            }
            sHashValue = sHashValue - s.charAt(i) + s.charAt(i + c.length());
        }
        System.out.println("It doesn't contains the substring.");
    }

    public static void findSubstring3(String s, String c) {
        System.out.println(s);
        System.out.println(c);
        if(s.length() < c.length()) {
            System.out.println("It doesn't contains the substring.");
        }
        int cHash = 0;
        int sHash = 0;
        boolean containsSubStr;
        int g = 11;
        for(int i = 0 ; i < c.length(); i++) {
            cHash += c.charAt(i)*(int)Math.pow(g,i);
        }
        for(int i = 0 ; i < c.length(); i++) {
            sHash += s.charAt(i)*(int)Math.pow(g,i);
        }
        System.out.println("C Hash = " + cHash);
        System.out.println("S Hash = " + sHash);
        for(int i = 0; i < s.length() - c.length(); i++) {
            if(cHash == sHash) {
                containsSubStr = true;
                for(int j = 0; j < c.length(); j++) {
                    if(s.charAt(i+j) != c.charAt(j)) {
                        containsSubStr = false;
                    }
                }
                if(containsSubStr) {
                    System.out.println("It contains the substring.");
                    return;
                }
            }
            sHash = (sHash - s.charAt(i))/g;
            sHash += s.charAt(i + c.length())*(int)Math.pow(g,c.length()-1);
            System.out.println("S Hash = " + sHash);
        }
        System.out.println("It doesn't contains the substring.");
    }

    public static void reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i > -1; i--) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }

    private static void longestCommonSubstring(String str1, String str2) {
        String s1 = str1;
        String s2 = str2;
        int min = 0;
        String result = "";
        if(str1.length() < str2.length()) {
            s1 = str2;
            s2 = str1;
        }
        StringBuilder current = new StringBuilder();
        for(int i = 0; i < s2.length(); i++) {
            current.delete(0, current.length());
            for(int j = i; j < s2.length(); j++) {
                current.append(s2.charAt(j));
                System.out.println(current);
            }
            if(s1.contains(current) && current.length() > min) {
                result = current.toString();
                min = result.length() - 1;
                System.out.println("S1 = " + s1 + "   S2 = " + s2 +" \nCommon String = " + result);
            }

        }
        System.out.println("S1 = " + s1 + "   S2 = " + s2 +" \nCommon String = " + result);
    }

    //     9
    /*     l = 0, r= 10, m = 5;
           l = 0, r = 5, m = 2;
           l = 2, r = 5, m = 3;
           l = 3, r = 5, m = 4;
           l = 3, r = 4, m = 3;
     */
    public static void computeLowerSqrt(int x) {
        int left = 0;
        int right = x;
        int mid = (left + right) / 2;
        while(left + 1 < right) {
            if(mid*mid > x) {
                right = mid;
            } else {
                left = mid;
            }
            mid = (left + right) / 2;
        }
        System.out.println("Sqrt = " + left);
    }

    private static void getMinMax(int[] arr) {
        for(int val : arr) System.out.print(" " + val);
        System.out.println();
        getMinMax(arr, 0, arr.length - 1);
        for(int val : arr) System.out.print(" " + val);
        System.out.println();
        System.out.println("min = " + arr[0] + " , max = " + arr[arr.length -1]);
    }


    // 5|3|6|1|7|9|8|4
    // 3 5|1 6|7 9|4 8   4
    // 1 5 3 6|4 8 7 9 11  2
    // 1 5 3 6 4 8 7 9|  2

//    5,3,6,7,1,4,9,2
    private static void getMinMax(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if(mid == left) {
            if(arr[left] > arr[right]) {
                swap(left, right, arr);
                return;
            }
        } else {
            if(arr[left] > arr[mid + 1]) {
                swap(left, mid + 1, arr);
            }
            if(arr[mid] > arr[right]) {
                swap(right, mid, arr);
            }
        }
        for(int val : arr) System.out.print(" " + val);
        System.out.println();
//        System.out.println(" MID = " + mid);
        if(mid == 0 || mid == arr.length - 10) return;
        getMinMax(arr, left, mid);
        getMinMax(arr, mid + 1, right);
    }

    public static void findNearestRepeatedWord(String[] arr) {
        HashMap<String, List<Integer>> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                ArrayList<Integer>  list = new ArrayList<>();
                list.add(i);
                map.put(arr[i], list);
            } else {
                map.get(arr[i]).add(i);
            }
        }
        for(List<Integer> list : map.values()) {
            if(list.size() == 1) continue;
            for(int j = 0; j < list.size() - 1; j ++) {
                if(list.get(j+1).intValue() - list.get(j) < min) {
                    min = list.get(j+1).intValue() - list.get(j);
                }
            }
        }
        for(String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println("\nDistance = " + (min - 1));
    }

    public static void findNearestRepeatedWord2(String[] arr) {
        int min = Integer.MAX_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        for( int k = 0; k < arr.length; k++) {
            if(!map.containsKey(arr[k])) {
                map.put(arr[k], k);
            } else {
                min = Integer.min(min, k - map.get(arr[k]).intValue() - 1);
                map.put(arr[k], k);
            }
        }
        System.out.println("Distance2 = " + min);
    }

    public static String minWindow(String s, String t) {
        char[] arr = s.toCharArray();
        int minIndex = Integer.MAX_VALUE;
        int maxIndex = -1;
        int distance = Integer.MAX_VALUE;
        String result = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()) {
            map.put(c, -1);
        }
        boolean allCharsFounded = false;
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], i);
                if(!allCharsFounded) {
                    for(Integer val : map.values()) {
                        if(val.intValue() == -1) {
                            break;
                        }
                        allCharsFounded = true;
                    }
                    continue;
                }
                minIndex = Integer.min(i,minIndex);
                maxIndex = Integer.max(i,maxIndex);
                if(distance > maxIndex - minIndex) {
                    result = s.substring(minIndex, maxIndex + 1);
                    distance = maxIndex - minIndex;
                }
            }
        }
        //A 0, 10
        //B 3, 9
        //C 5, 12
        return result;
    }

    public static void isPalindromicPermutation(String str) {
        HashSet<Character> set = new HashSet<>();
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])) {
                set.remove(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        if(set.size() <= 1) {
            System.out.println(str + " is palindromic permutation");
        } else {
            System.out.println(str + " is not palindromic permutation");
        }
    }

    public static void isLetterConstructibleFromMagazine(String letter, String magazine) {
        if(magazine.toCharArray().length < letter.toCharArray().length) {
            System.out.println("Can't be constructed.");
            return;
        }
        char[] magazineChars = magazine.toCharArray();
        char[] letterChars = letter.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < magazineChars.length; i++) {
            if(map.containsKey(magazineChars[i])) {
                map.put(magazineChars[i], map.get(magazineChars) + 1);
            } else {
                map.put(magazineChars[i],1);
            }
        }
        for(int i = 0; i < letterChars.length; i++) {
            if(!map.containsKey(letterChars[i]) || map.get(letterChars[i]).intValue() == 0) {
                System.out.println("Can't be constructed.");
                return;
            } else {
                map.put(letterChars[i], map.get(letterChars[i]) - 1);
            }
        }
        System.out.println("Can be constructed");
    }

    /*
    * f,s,f,e,t,w,e,n,w,e   = >   s,f,e,t,w
    * map<let,pos>
    * currentSize = 0
    * if(map contains key currentLetter)
    *   then remove all pairs with pos < currentLettrPos
    * else
    *   if(map values size > curentSize)
    *       then currentSize = map values size
    */


    /*
        for letter in letters:
            if map contains letter
                then minIndex = map getIndex for letter
                map = new map
            else
                map put new letter
            length = max (length , map values length)
     */

    private static HashMap<Character, Integer> recreateMap(char[] arr, int left, int right) {
        HashMap<Character, Integer> newMap = new HashMap<>();
        for(int i = left; i <= right; i++) {
            newMap.put(arr[i],i);
        }
        return newMap;
    }

    public static void findLongestSubarrayWithDistinctEntries(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        int length = 0;
        int left;
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                left = map.get(arr[i]).intValue();
                map = recreateMap(arr,left,i);
            } else {
                map.put(arr[i],i);
            }
            length = length < map.size() ? map.size() : length;
        }
    }

    public static void findLongestSubarrayWithDistinctEntries2(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        int length = 0;
        int left = 0;
        int right;
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                right = map.get(arr[i]).intValue();
                for(int j = left; j < right; j++) {
                    map.remove(arr[j]);
                }
                map.put(arr[i],i);
            }
            map.put(arr[i],i);
            length = (length < map.size()) ? map.size() : length;
        }
        System.out.println(length);
    }

//    public static int longestConsecutive(int[] nums) {
//        // map<value, sequenceLength>
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int longestSequence = 0;
//        map.keySet().iterator().forEachRemaining(key->{});
//        for(int i = 0; i < nums.length; i++) {
//            map.put(nums[i], 1);
//        }
//        for(int i = 0; i < nums.length; i++) {
//            if(map.containsKey(nums[i] - 1)) {
//                map.put(nums[i], map.get(nums[i]) + 1);
//            }
//        }
//        longestSequence = Collections.max(map.values());
//        return longestSequence;
//    }

    //----
    private static int getMaxLength(int[] arr) {
        int maxLength = 1;
        int currentLength = 1;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] + 1 == arr[i + 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            maxLength = Integer.max(maxLength, currentLength);
        }
        return maxLength;
    }

    private static int[] getUniqueElementsArray(int[] nums) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            sortedSet.add(nums[i]);
        }
        int arr[] = new int[sortedSet.size()];
        for(Integer value : sortedSet) {
            arr[k] = value.intValue();
            k++;
        }
        return arr;
    }

    public static int longestConsecutiveNumbersSequence(int[] nums) {
        if(nums.length == 0) return 0;
        int maxLength = 0;
        int[] arr = getUniqueElementsArray(nums);
        maxLength = getMaxLength(arr);
        return maxLength;
    }

    // 13.11
    public static void computeTheAverageTopThreeScores() {
        HashMap<String, TreeSet<Integer>> map = new HashMap<>();

        map.put("Roze",new TreeSet<Integer>(Arrays.asList(
                3,6,8,9
        )));
        map.put("Smith",new TreeSet<Integer>(Arrays.asList(
                3,2,4,8
        )));

        map.put("Mike",new TreeSet<Integer>(Arrays.asList(
                10,2
        )));
        TreeSet<Integer> currentMarks;
        float maxMarksAvg = 0;
        for(String key : map.keySet()) { // O(n)
            currentMarks = map.get(key); // O(1)
            if(currentMarks.size() > 2) {
                maxMarksAvg = Float.max(maxMarksAvg,
                        (float)(((float)currentMarks.pollLast() +
                                (float)currentMarks.pollLast() +
                                (float)currentMarks.pollLast() ) / 3));
            }
        }
        System.out.println("Max Avg = " + maxMarksAvg);
    }
// --------------------------------------------------------------------------
    private static void printIntArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i]+", ");
            }
        }
        System.out.print("] \n");
    }

    private static void printIntersection(int[] arr1, int[] arr2, ArrayList<Integer> result) {
        printIntArray(arr1);
        printIntArray(arr2);
        System.out.println("arr1 ^ arr2 = " + result.toString());
    }

    // 14.1
    public static void computeIntersectionOfSortedArrays(int[] arr1, int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int value : arr2) {
            set.add(value);
        }
        for(int value : arr1) {
            if(set.contains(value)) {
                result.add(value);
            }
        }
        printIntersection(arr1, arr2, result);
    }
// -------------------------------------------------------------------------
    private static boolean mergeRemainingValues(int[] result, int[] leftArr, int[] rightArr,int k, int left, int right) {
        if(left >= leftArr.length && right < rightArr.length) {
                for(int i = right; i < rightArr.length ; i++) {
                    result[k++] = rightArr[i];
                }
                return true;
        }
        return false;
    }

    // 14.2
    public static void mergeTwoSortedArrays(int[] leftArr, int[] rightArr) {
        int[] result = new int[leftArr.length + rightArr.length];
        int left = 0;
        int right = 0;
        int k = 0;
        printIntArray(leftArr);
        printIntArray(rightArr);
        while (left < leftArr.length || right < rightArr.length) {
            if(mergeRemainingValues(result,leftArr,rightArr,k,left,right)) break;
            if(mergeRemainingValues(result,rightArr,leftArr,k,right,left)) break;
            result[k++] = (leftArr[left] < rightArr[right]) ? leftArr[left++] : rightArr[right++];
        }

        for(int value : result) {
            System.out.print(value+" ");
        }
    }

    // 14.3

    private static class Person {
        public String firstName;
        public String lastName;
        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "{" +
                     firstName + '\'' +
                     lastName + '\'' +
                    '}';
        }
    }

    public static void removeFirstNameDuplicate() {
        int currentIndex = 0;
        ArrayList<Person> list = new ArrayList<>(Arrays.asList(new Person[]{
                new Person("Ian", "Bell"),
                new Person("David", "Grover"),
                new Person("Ian", "Botham"),
                new Person("Ian", "Chappell"),
                new Person("Zen", "Hood")
        }));
        Collections.sort(list,(a,b) -> {
            return a.firstName.compareTo(b.firstName);
        });
        for(int i = 0; i < list.size() - 1; i++) {
            if(!list.get(i).firstName.equals(list.get(i + 1).firstName)){
                list.set(currentIndex++,list.get(i));
            }
        }
        if(!list.get(list.size() - 2).firstName.equals(list.get(list.size()-1).firstName)){
            list.set(currentIndex++,list.get(list.size()-1));
        }

        System.out.println(list.subList(0,currentIndex));
    }
//----------------------------------
    // 14.7
    public static class Student {
        public int age;
        public String name;
        public Student(int age, String name) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "{" + age +
                    "," + name +
                    '}';
        }
    }

    private static void printObjectsArray(Object[] objects) {
        for(Object object : objects) {
            System.out.print(object.toString() + " ");
        }
    }

    private static Student[] getStudents() {
        Student[] students = new Student[] {
                new Student(20,"Bob"),
                new Student(23,"Bill"),
                new Student(20,"Mike"),
                new Student(21,"John"),
                new Student(22,"Jonny"),
                new Student(20,"Mark"),
                new Student(22,"Patrick"),
                new Student(20,"David"),
                new Student(23,"Elon"),
                new Student(20,"Simon")
        };
        return students;
    }

    public static void sortArrayWithRepeatedEntries1() {
        Student[] students = getStudents();
        printObjectsArray(students);
        Arrays.sort(students, (s1,s2) -> {
           return Integer.compare(s1.age, s2.age);
        });
        System.out.println();
        printObjectsArray(students);
    }

    public static void sortArrayWithRepeatedEntries2() {
        Student[] students = getStudents();
        printObjectsArray(students);
        HashMap<Integer, List<Student>> map = new HashMap<>();
        for(Student student : students) {
            if(map.containsKey(student.age)) {
                map.get(student.age).add(student);
            } else {
                ArrayList<Student> studentsList = new ArrayList<>();
                studentsList.add(student);
                map.put(student.age, studentsList);
            }
        }
        System.out.println();
        map.values().forEach(studentsList ->{
            System.out.println(studentsList);
        });
    }

    //-----------------
    // 16.3

    // 1234
    // 1 , 234
    // 2 , 134
    // 3 , 124
    // 12 13
    // 21 23
    // 31 32,
    // 123 132
    // 213 231
    // 312 321,

    private static void generatePermutations(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int value : arr) {
            arrayList.add(value);
        }
        generatePermutations(new ArrayList<Integer>(), arrayList);
    }
    private static void switchValuesFromRightToLeft(ArrayList<Integer> left, ArrayList<Integer> right,int i) {
        ArrayList<Integer> newRight = new ArrayList<>();
        right.forEach(val -> newRight.add(val));
        ArrayList<Integer> newLeft = new ArrayList<>();
        left.forEach(val -> newLeft.add(val));
        newLeft.add(right.get(i));
        newRight.remove(i);
        generatePermutations(newLeft,newRight);
    }
    private static void generatePermutations(ArrayList<Integer> left, ArrayList<Integer> right) {
        if(right.size() == 0) {
            System.out.println(left.toString());
            return;
        }
        for(int i = 0; i < right.size(); i++) {
            switchValuesFromRightToLeft(left, right,i);
        }
    }

    //-----------------
    // 16.4

    public static void generatePowerSet(int[] arr) {
        for(int start = 0; start < arr.length; start++) {
            for(int i = start; i < arr.length; i++) {
                generatePowerSet(arr,start,i);
            }
        }
    }

    private static void generatePowerSet(int[] arr, int start, int end) {
        ArrayList<Integer> startingList = new ArrayList<>();
        for(int i = start; i < end; i++) {
            startingList.add(arr[i]);
        }
        for(int i = end; i < arr.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            startingList.forEach(val->list.add(val));
            list.add(arr[i]);
            System.out.println(list.toString());
        }
    }

    // 16.5
    // 1, 2, 3,4

    // 1 / 2 / 3 / 4

    // 1    - > 1,2 / 1,3 / 1,4
    // 2    - > 2,3 / 2,4
    // 3    - > 3,4
    // 4    - > 4

    // 1,2  -> 1,2,3 / 1,2,4
    // 1 3  -> 1,3,4
    // 1 4  -> 1,4

    // initList.add(list(0))
    // initList.add(list(1))

    private static ArrayList<Integer> generateListWithNewValueAdded(int[] arr, ArrayList<Integer> list, int i) {
        ArrayList<Integer> newList = new ArrayList<>();
        list.forEach( val -> newList.add(val));
        newList.add(arr[i]);
        return newList;
    }

    private static void generateSubSetsOfSizeK(int[] arr, ArrayList<Integer> list, int start, int k) {
        if(list.size() == k) return;
        for(int i = start; i < arr.length; i++) {
            ArrayList<Integer> newList = generateListWithNewValueAdded(arr, list, i);
            if(newList.size() == k) {
                System.out.println(newList.toString());
            }
            generateSubSetsOfSizeK(arr,newList,i+1,k);
        }
    }

    public static void generateSubSetsOfSizeK(int[] arr, int k) {
        generateSubSetsOfSizeK(arr, new ArrayList<Integer>(), 0, k);
    }

    // ------------
    // 16.7

    // 0204451881
    // 020 - > 0, 2, 0 / 020
    private static void printIfIsPalindrome(char[] arr, int start, int end) {
        int k = 0;
        for(int i = start; i < end; i++) {
            if(arr[i] != arr[end - k++]) {
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = start; i <= end; i++) {
            stringBuilder.append(arr[i]);
        }
        System.out.println(stringBuilder + "  start = " + start + "   end = " + end);
    }

    public static void computeAllPalindromicDecopositions(String str) {
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                printIfIsPalindrome(arr, i, j);
            }
        }
    }








}