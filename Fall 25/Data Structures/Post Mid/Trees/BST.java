
class Node {

    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {

    // Node left = null, right = null;
    Node root;

    // void create(int data) {
    //     Node newNode = new Node(data);
    //     if ()
    // }
}

class Main {

    public static void main(String... args) {
        // binary tree code - it is useless
        BinarySearchTree bs = new BinarySearchTree();
        bs.root = new Node(10);
        bs.root.left = new Node(9);
        bs.root.right = new Node(12);
        System.out.println(bs.root.data);
        System.out.println(bs.root.left.data);
        System.out.println(bs.root.right.data);
    }
}
