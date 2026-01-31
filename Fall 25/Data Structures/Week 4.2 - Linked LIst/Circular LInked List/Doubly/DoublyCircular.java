class Node {
    Node next;
    Node prev;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}

class linkedlist {

    Node head;

    // linkedList
    void addNode(int data) {
        Node newNode = new Node(data);
        Node head = null;

        // checking if node exists?
        if (head == null) {
            head = newNode;
        }
        // this will add new node at end
        else {
            newNode.prev = head;
            head.next = newNode;
            newNode.next = null;
        }
    }

    // insert at last, madam's code
    void insertAtLast(int data) {
        Node newNode = new Node(data);
        Node S = head;
        while (S.next != null)
            S = S.next;
        // shifting
        S.next = newNode;
        newNode.prev = S;
    }

    // Insertion at start
    void insertAtStart(int data) {
        Node newNode = new Node(data);
        // check node is exists?
        if (head == null)
            head = newNode;
        // if already nodes exists
        else {
            newNode.prev = head.prev;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    /**
     * Insertion in between
     * Scenarios:
     * at specific position,
     * at after/before position,
     * after/before specific value etc.
     */
    // here at position 3
    void insertInAtPos(int data, int pos) {
        Node S = head;
        Node newNode = new Node(data);
        int position = 1;
        while (S != null) {

            if (position == pos - 1) {
                newNode.prev = S;
                newNode.next = S.next;
                S.next.prev = newNode;
                S.next = newNode;
            }
            position++;

            S = S.next;
        }
    }

    // Delete at start
    void deleteAtStart() {
        // checking for node existance
        if (head == null)
            System.out.println("No node exists!");
        else {
            head = head.next;
            head.prev = null;
        }
    }

    // Delete at end
    void deleteAtEnd() {
        Node S = head;
        while (S.next != null)
            S = S.next;
        // shifting
        S.prev.next = null;
        S = S.prev;
    }

    // delete in between
    // here a specific value
    void deleteSpecificValue(int value) {
        Node S = head;
        while (S.next != null) {
            if (S.data == value) {
                S.next.prev = S.prev;
                S.prev.next = S.next;
                // S = S.next; // moves to next for traversing - if need
            }
            S = S.next;
        }
    }

    // Display
    void display() {
        Node S = head;
        while (S != null) {
            System.out.println("Prev: " + S.prev + " Data: " + S.data +
                    " Next: " + S.next);
            S = S.next;
        }
    }
}


class Main {
    public static void main(String... args) {
        linkedlist ll = new linkedlist();
        ll.display(); // shows nothing
        // ll.addNode(1); /// creates space in memory
        System.out.println("Inserting at start");
        ll.insertAtStart(10);
        ll.insertAtStart(20);
        ll.insertAtStart(30);
        ll.insertAtStart(40);
        ll.insertAtStart(50);
        ll.display();

        System.out.println("Inserting at last");
        ll.insertAtLast(260);
        ll.insertAtLast(210);
        ll.insertAtLast(230);
        ll.insertAtLast(310);
        ll.display();

        System.out.println("Inserting at specific position (pos 3 and 4)");
        ll.insertInAtPos(60, 3); // in between 40 and 30
        ll.insertInAtPos(70, 4);
        ll.display();

        System.out.println("Delete From Start");
        ll.deleteAtStart();
        ll.deleteAtStart();
        ll.deleteAtStart();
        ll.display();

        System.out.println("Delete From End");
        ll.deleteAtEnd();
        ll.deleteAtEnd();
        ll.deleteAtEnd();
        ll.display();

        System.out.println("Delete in between");
        ll.deleteSpecificValue(20);
        ll.deleteSpecificValue(10);
        ll.display();
    }

}