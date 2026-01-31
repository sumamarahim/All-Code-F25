
class Node {

    Node next;
    int data;
    public Node head = null;

    Node(int data) {
        this.data = data;
        this.next = head;
    }
}

class linkedlist {

    Node head;

    // insert at start
    void insertAtStart(int data) {
        Node newNode = new Node(data);
        Node S = new Node(data);
        if (head == null) { // checking for node exists
            head = newNode;
            newNode.next = head;
        } else {
            while (S.next != head) {
                S = S.next;
            }
            S.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    // display
    void display() {
        Node S = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (S.next != head) {
                System.out.print(S.data + " ");
                S = S.next;
            }
        }
    }
}

class Main {

    public static void main(String... args) {
        System.out.println("Test");
        linkedlist list = new linkedlist();
        list.display();
        list.insertAtStart(10);
        list.insertAtStart(10);
        list.insertAtStart(10);
        list.insertAtStart(10);
        list.insertAtStart(10);
        list.insertAtStart(10);
        list.display();
    }
}
