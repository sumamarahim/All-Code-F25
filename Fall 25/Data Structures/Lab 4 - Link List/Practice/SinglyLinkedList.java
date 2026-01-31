/**
 * Singly Linked List Practice
 * Assignment 1 and other labs
 */

public class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // represent the head and tail
    public Node head = null;
    public Node tail = null;

    // addNode() will add a new node to the list
    public void addNode(int data) {
        // creating a node
        Node newNode = new Node(data);
        // checks for the existance of node
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    // insertions
    // 1. insert at beginning
    void insertAtStart(int val) {
        Node newNode = new Node(val);
        if (head == null) // checks if node is empty
        {
            head = newNode;
        } else // insert node at start
        {
            newNode.next = head;
            head = newNode;
        }
    }

    // 2.0 insert at end - without tail
    void insertAtEnd(int val) {
        Node newNode = new Node(val);
        Node S = head; // it will copy the head and we'll use it and keep the head as point first node
        while (S.next != null) {
            S = S.next;
        }
        // Shifting
        S.next = newNode;
        newNode.next = null;

    }

    // 2.1 insert at end - with tail
    void insertAtEndWithTail(int val) {
        Node newNode = new Node(val);
        Node tail = head; // it will copy the head and we'll use it and keep the head as point first node
        while (tail.next != null) {
            tail = tail.next;
        }
        // Shifting
        tail.next = newNode;
        newNode.next = null;

    }

    // updating - doing to check my concepts
    void update(int val, int newVal) {
        Node S = head;
        while (S != null) {
            if (S.data == val) {
                S.data = newVal;
                System.out.println("\n" + val + " is updated with: " + newVal);
                break;
            } else {
                S = S.next;
            }
        }
    }

    // 3. insert in between (at specific location/position etc.)

    void insertInBetween(int val, int addAfter) {
        Node newNode = new Node(val);
        Node S = head;
        while (S != null) {
            if (S.data == addAfter) {
                // Shifting
                newNode.next = S.next;
                S.next = newNode;
            }
            S = S.next;

        }
    }

    // Deletion scenarios
    // Scenario 1: Deletion at start

    void deletionAtStart() {
        // to check if linked list is empty
        if (head == null) {
            System.out.println("LL is empty!");
        } else {
            head = head.next;
        }
    }

    // Scenario 2: Deletion at end
    void deletionAtEnd() {
        Node S = head;
        while (S.next.next != null) {
            S = S.next;
        }
        S.next = null;
    }

    // Scenario 3: Deletion in between
    void deletionInBetween(int val) {
        Node newNode = new Node(val);
        Node S = head;
        while (S.next != null) {
            if (S.next.data == val) {
                S.next = S.next.next;
            }
            S = S.next;
        }
    }

    // displaying nodes
    public void display() {
        Node S = head;
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("Nodes of Singly Linked List: ");
        while (S != null) {
            System.out.print(S.data + " ");
            S = S.next;
        }
    }

    // searching for a value
    void search(int val) {
        Node S = head;
        // traversing till value
        while (S != null) {
            if (S.data == val)
                System.out.println("Value found: " + S.data);
            S = S.next;
        }
    }

    // displaying nodes
    public void count() {
        Node S = head;
        int counter = 0, total = 0;
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        while (S != null) {
            S = S.next;
            counter += 1;
        }
        System.out.println("Total nodes are: " + counter);
    }

}

class Main {
    public static void main(String... args) {
        SinglyLinkedList sList = new SinglyLinkedList();
        // add nodes to the list

        // insertion
        System.out.println("\nInitially Displaying the linked list!");
        sList.display(); // initialy it should display nothing, cz we don't have anything in list
        System.out.println("\nInserting at start");
        sList.insertAtStart(1);
        sList.insertAtStart(2);
        sList.insertAtStart(3);
        sList.insertAtStart(4);
        sList.insertAtStart(5);
        sList.insertAtStart(6);
        sList.display(); // displays 6 5 4 3 2 1
        System.out.print("\nInserting at end\n");
        sList.insertAtEnd(7);
        sList.insertAtEnd(8);
        sList.insertAtEnd(9);
        sList.display(); // display 6 5 4 3 2 1 7 8 9
        System.out.print("\nUpdating value");
        sList.update(4, 17);
        sList.display(); // displays 6 5 17 3 2 1 7 8 9
        System.out.println("Insertion in between");
        sList.insertInBetween(99, 2); // adds 99 after 2
        sList.display(); // displays 6 5 17 3 2 99 1 7 8 9

        // deletion
        System.out.println("\nDeleting from start");
        sList.deletionAtStart(); // deletes 6, so new values 5 17 3 2 99 1 7 8 9
        sList.deletionAtStart(); // deletes 5, so new values 17 3 2 99 1 7 8 9
        sList.display(); // so displays 17 3 2 99 1 7 8 9
        System.out.println("\nDeleting from End");
        sList.deletionAtEnd(); // deletes 9, so new displays 17 3 2 99 1 7 8
        sList.deletionAtEnd(); // deletes 8, so new displays 17 3 2 99 1 7
        sList.deletionAtEnd(); // deletes 7, so new displays 17 3 2 99 1
        sList.display(); // displays 17 3 2 99 1
        System.out.println("\nDeletion in between");
        sList.deletionInBetween(2); // deletes 2, wherever it exists
        sList.display(); // displays 17 3 99 1
        System.out.println("\nSearching for a specific value");

        // searching
        sList.search(3);
        System.out.println("Let's count the total number of nodes ");
        sList.count();
    }
}
