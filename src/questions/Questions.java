package questions;

import linkedList.Node;

import java.util.Arrays;

public class Questions {
    // Arrays:

    // 1.1
    public static void isUnique(String str) {
        boolean[] ascii = new boolean[128];
        for(char c : str.toCharArray()) {
            if(ascii[(int)c]) {
                System.out.println("Is not unique");
                return;
            } else {
                ascii[(int)c] = true;
            }
        }
        System.out.println("Is unique");
    }

    public static void isUnique2(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for(int i = 1; i < chars.length; i++) {
            if(chars[i - 1] == chars[i]) {
                System.out.println("Is not unique");
                return;
            }
        }
        System.out.println("Is unique");
    }

    // 1.2
    public static boolean checkPermutations1(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();
        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);
        for(int i = 0; i < str1Chars.length; i++) {
            if(str1Chars[i] != str2Chars[i]) return false;
        }
        return true;
    }
    public static void checkPermutations2(String s1, String s2) {
        if(s1.length() != s2.length()) {
            System.out.println("check failed");
            return;
        }
        int[] app = new int[128];
        for(int i = 0; i < s1.length(); i++) {
            app[s1.charAt(i)]++;
            app[s2.charAt(i)]--;
        }
        for(int a : app) {
            if(a != 0) {
                System.out.println("check failed");
                return;
            }
        }
        System.out.println("check passed");
    }

    // 1.7 -
    public static void rotateMatrix() {
        int[][] matr = new int[][]{
                {1,1,1,0,0},
                {0,0,0,0,0},
                {2,0,0,0,0},
                {2,0,0,0,0},
                {2,0,3,3,3}
        };
        printMatrix(matr);
        int len = matr.length - 1;
        int aux;
        for(int level = 0; level < matr.length / 2 ; level++) {
            for(int i = level; i < len - level; i++) {
                aux = matr[len - i][len - level];
                matr[len - i][len - level] = matr[level][i];
                matr[level][i] = matr[len - i][level];
                matr[len - i][level] = matr[len - level][len - i];
                matr[len - level][i] = aux;
            }
        }
        printMatrix(matr);
    }

    public static void printMatrix(int[][] matr) {
        for(int i = 0; i < matr.length; i++) {
            for(int j = 0; j < matr[0].length; j++) {
                System.out.print(matr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }


    // Linked Lists:

    // 2.4
    public static void partition(int target) {
        Node root = new Node(3);
        Node n1  = new Node(5);
        Node n2  = new Node(8);
        Node n3  = new Node(5);
        Node n4  = new Node(10);
        Node n5  = new Node(2);
        Node n6  = new Node(1);
        root.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        printNodes(root);
        // 3 5 8 5 10 2 1
        // 3 1 2 5 5 10 8  targe = 5
        Node current = root;
        int counter = 0;
        while(current != null) {
            if(current.val < target) {
                counter++;
            }
            current = current.next;
        }
        current = root;
        int aux = counter;
        while(counter-- != 0) {
            current= current.next;
        }
        counter = aux;
        Node left = root;
        while(counter != 0) {
            if(left.val >= target) {
                while(current.val >= target){
                    current = current.next;
                }
                swapNodes(left, current);
            }
            left = left.next;
            counter--;
        }
        printNodes(root);
    }

    public static void swapNodes(Node n1, Node n2) {
        int aux = n1.val;
        n1.val = n2.val;
        n2.val = aux;
    }

    public static void printNodes(Node current) {
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // 2.6
    public static void isListPalindrome() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(3);
        Node n5 = new Node(2);
        Node n6 = new Node(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        // 1 2 3 3 2 1
        StringBuilder str = new StringBuilder();
        Node current = n1;
        while(current != null) {
            str.append(current.val);
            current = current.next;
        }
        String s = str.toString();
        for(int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("Is palindrome");
    }

    // 5.1
    public static void bitsInsertion(String numStr1, String numStr2, int k) {
        int num1 = Integer.parseInt(numStr1, 2);
        System.out.println("k = " + k);
        int num2 = Integer.parseInt(numStr2, 2);
        System.out.println(numStr1 + " = " + num1);
        System.out.println(numStr2 + " = " + num2);
        num2  = num2 << k;
        num1 = num1 | num2;
        String result = "";
        for(int i = 0; i < 11; i++) {
            result = (1 & num1>>i) + result;
        }
        System.out.println(result + " = " + num1);
    }


}

