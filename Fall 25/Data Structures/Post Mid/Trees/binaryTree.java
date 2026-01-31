// this is binary tree code - for usefull purpose, we never use it.
class Node {

    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {

    Node root;
    void traverse(Node node) {
        if (node != null)
        traverse(node.left);
        System.out.println(node.data);
        traverse(node.right);
    }
}

class Main {

    public static void main(String... args) {
        // binary tree code - it is useless
        BinaryTree bs = new BinaryTree();
        bs.root = new Node(10);
        bs.root.left = new Node(9);
        bs.root.right = new Node(12);
        // System.out.println(bs.root.data);
        // System.out.println(bs.root.left.data);
        // System.out.println(bs.root.right.data);
        bs.traverse(bs.root);
    }
}
