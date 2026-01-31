
/** *
 *
 * Task 1: Singly Link List Task
 * Build a program that displays even position nodes of a singly link-list.
 * (You have to write insert_nodes() for adding as many nodes as u want and
 * display_even() function for displaying even position values)
 */

// brute force approach
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head = null;

    void createNode(int data) {
        Node newNode = new Node(data);
        head = newNode;
        System.out.println("node added with data: " + data);
    }
    void insertNode(int data) {
        Node newNode = new Node(data);
        // creating first node
        if (head == null) {
            head = newNode;
            System.out.println("node added with data: " + data);
        } // linking as node
        else {
            newNode = head;
            head = newNode;
            System.out.println("node added with data: " + data);
        }
    }

    void displayEven() {
        Node S = head; // S is a pointer here which I use for traversing
        // if no node exists
        if (head == null) {
            System.out.println("No nodes exists!");
        }
        else
        while (S != null) {
            System.out.println(S.data);
            S = S.next;
        }
    }
}

class Task1Main {

    public static void main(String... args) {
        LinkedList ll = new LinkedList();
        ll.displayEven();
        System.out.println("Create Nodes!");
        ll.createNode(10);
        ll.insertNode(20);
        ll.insertNode(30);
        System.out.println("Displaying Nodes!");
        ll.displayEven();
    }
}
