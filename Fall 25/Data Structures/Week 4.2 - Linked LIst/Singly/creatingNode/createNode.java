// NOTE: this code is working

// ...existing code...
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;
    Node tail;

    void createNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}

 class creatingNode {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.createNode(4);
        list.createNode(7);
        list.printList(); // output: 4 7
    }
}
// ...existing code...