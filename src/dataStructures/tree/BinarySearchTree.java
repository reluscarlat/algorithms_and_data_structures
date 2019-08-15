package dataStructures.tree;

public class BinarySearchTree {
    public class Node {
        public int data;
        public Node left, right;

        public Node(){}
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public void add(int data) {
            if(data <= this.data) {
                if(this.left == null) {
                    this.left = new Node(data);
                }
                else
                    this.left.add(data);
            } else {
                if(this.right == null) {
                    this.right = new Node(data);
                }
                else
                    this.right.add(data);
            }
        }

        public void delete(Node prev, int data) {
            Node current = new Node();

            if(prev.left != null && prev.left.data <= data) {
                current = prev.left;
            }
            if(prev.right != null && prev.right.data <= data) {
                current = prev.right;
            }

//            if(prev.left == null && prev.right == null) return;

            if(current.data == data) {
                if(current.left == null && current.right == null) {
                    prev.left = null;
                    System.out.println("A");
                    return;
                }
                if(current.left != null && current.right == null) {
                    prev.left = current.left;
                    System.out.println("B");
                    return;
                }
                if(current.left == null && current.right != null) {
                    System.out.println("C");
                    prev.left = current.right;
                    return;
                }
                Node currentRight = current.right;
                current = current.left;
                while (current.right != null) {
                    current = current.right;
                }
                current.right = currentRight;
            } else {
                delete(current, data);
            }
        }
    }

    private Node root = null;

    public void add(int data) {
        if(root == null){
            root = new Node(data);
        } else {
            root.add(data);
        }
    }


    public boolean contains(int data) {
        return contains(root, data);
    }

    private boolean contains(Node current, int data) {
        if(current != null) {
            if(current.data == data)
                return true;
            else {
                if(data < current.data)
                    return contains(current.left, data);
                else
                    return contains(current.right, data);
            }
        }
        return false;
    }

    public void delete(int data) {
        delete(root,data);
    }

    public void changeString(String a) {
        a = a + "" + a;
    }

    public void changeNodeValue(Node n) {
        n.data = 111;
    }

    private void delete(Node node, int data) {
        if(this.root.data == data) {
            this.root = null;
            return;
        }
        root.delete(root,data);
    }

    public void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(Node current) {
        if(current != null) {
            printInOrder(current.left);
            System.out.println(current.data);
            printInOrder(current.right);
        }
    }

    public void printPreOrder(){
        printPreOrder(root);
    }

    private void printPreOrder(Node current) {
        if(current != null) {
            System.out.println(current.data);
            printPreOrder(current.left);
            printPreOrder(current.right);
        }
    }

    public void printPostOrder() {
        printPostOrder(root);
    }

    private void printPostOrder(Node current) {
        if(current != null) {
            printPostOrder(current.left);
            printPreOrder(current.right);
            System.out.println(current.data);
        }
    }
}
