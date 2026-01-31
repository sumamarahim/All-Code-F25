class LinkedList {
    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node front = null;
    public Node rare = null;

    // enqueue
    void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
            rare = newNode;
        } else {
            rare.next = newNode;
            rare = newNode;
        }
    }

    // dequeue
    void dequeue() {
        front = front.next;
    }

    // nodes counting
    void nodeCount() {
        Node S = front;
        int totalNodes = 0; // total nodes
        int evenNodes = 0; // total even nodes
        int oddNodes = 0; // total odd nodes
        while (S != null) {
            totalNodes++;
            S = S.next; // moves to next node
        }
        System.out.println("Total nodes are: " + totalNodes);
    }

    // traverse/display
    void display() {
        Node S = front;
        if (front == null)
            System.out.println("\nQueue is empty!");
        else {
            while (S != null) {
                System.out.print(S.data + ", ");
                S = S.next;
            }
        }
    }
}

class Main {
    public static void main(String... args) {
        System.out.println("Displaying Data");
        LinkedList queue = new LinkedList();
        queue.display(); // displays "Queue is empty!"
        queue.nodeCount(); // displays 0, cz we dn't ve any nodes yet
        queue.enqueue(1);
        queue.nodeCount(); // displays 1
        queue.display(); // displays 1
        queue.enqueue(2);
        queue.nodeCount(); // displays 2
        queue.display(); // displays 1, 2
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.nodeCount(); // displays 5
        queue.display(); // displays 1, 2, 3, 4, 5
        System.out.println("\nDequeuing");
        queue.dequeue(); // expected 1 should be removed
        queue.nodeCount(); // displays 4, 1 node is removed
        queue.display(); // expected displays: 2, 3, 4, 5
        queue.dequeue(); // expected 2 should be removed
        queue.dequeue(); // expected 3 should be removed
        queue.dequeue(); // expected 4 should be removed
        queue.dequeue(); // expected 5 should be removed, now queue is empty
        queue.display(); // expected displays: Queue is empty!
        queue.nodeCount(); // displays 0
    }
}