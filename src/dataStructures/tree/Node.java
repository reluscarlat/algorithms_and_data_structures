package dataStructures.tree;

public class Node {
    public int data;
    public Node left, right;

    public Node(int data) {
        this.data = data;
    }

    public void add(int data) {
        if(data<=this.data) {
            if(this.left == null) {
                this.left = new Node(data);
            } else {
                this.left.add(data);
            }
        } else {
            if(this.right == null) {
                this.right = new Node(data);
            } else {
                this.right.add(data);
            }
        }
    }

    public boolean contains(int searchedData) {
        if(this.data == searchedData) {
            return true;
        } else {
            if(searchedData <= this.data && this.left != null) {
                return this.left.contains(searchedData);
            }
            if(searchedData > this.data && this.right != null) {
                return this.right.contains(searchedData);
            }
        }
        return  false;
    }

    public void traversePreorder() {
        System.out.println(this.data);
        if(this.left != null) {
            this.left.traversePreorder();
        }
        if(this.right != null) {
            this.right.traversePreorder();
        }
    }

    public void traverseInorder() {
        if(this.left != null) {
            this.left.traverseInorder();
        }
        System.out.println(this.data);
        if(this.right != null) {
            this.right.traverseInorder();
        }
    }
    public void traversePostorder() {
        if(this.left != null) {
            this.left.traversePostorder();
        }
        if(this.right != null) {
            this.right.traversePostorder();
        }
        System.out.println(this.data);
    }
}
