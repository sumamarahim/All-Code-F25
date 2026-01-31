// creates node
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// creates linked list
class linkedList {

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

    // displaying nodes
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        System.out.println("Nodes of Singly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

// main program
class Main {
    public static void main(String... args) {
        linkedList sList = new linkedList();
        // add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(5);
        sList.addNode(6);
        sList.display();
    }
}
