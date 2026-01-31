
class Node {

    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head = null;

    // insert at start 
    void insertAtStart(int data) {
        Node S = head;
        Node newNode = new Node(data);
        // when list is empty
        if (head == null) {
            // newNode.next = head;
            head = newNode;
            newNode.next = head;

        } else {
            while (S.next != head) {
                S = S.next;
            }
            newNode.next = head;
            head = newNode;
        }
    }

    // display
    void display() {
        Node S = head;
        while (S.next != head) {
            if (head == null) {
                System.out.println("List is empty!");
            } else {
                System.out.print(S.data + " ");
            }
            S = S.next;
        }
    }
}

class Main {

    public static void main(String... args) {
        System.out.println("Teeessst");
        LinkedList list = new LinkedList();
        // list.display();
        // list.display();
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.display();
        System.out.println("Test end");
    }
}
