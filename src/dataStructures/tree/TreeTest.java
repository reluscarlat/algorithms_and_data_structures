package dataStructures.tree;

public class TreeTest {
    public static void testContainsFunction() {
        Node tree = new Node(6);
        tree.add(7);
        tree.add(3);
        tree.add(1);
        tree.add(4);

        System.out.println(tree.contains(6));
        System.out.println(tree.contains(7));
        System.out.println(tree.contains(3));
        System.out.println(tree.contains(1));
        System.out.println(tree.contains(7));
    }

    public static void testTraverseFunction() {
        Node tree = new Node(6);
        tree.add(9);
        tree.add(3);
        tree.add(1);
        tree.add(4);

        System.out.println("Preorder");
        tree.traversePreorder();
        System.out.println("Inorder");
        tree.traverseInorder();
        System.out.println("Post");
        tree.traversePostorder();
    }
}
