class LinkedList {
    class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node top = null;

    // pushing data to node
    void push(int data) {
        Node newNode = new Node(data);
        // let me check if something existing in stack
        if (head == null) {
            System.out.println("Stack is empty!");
            head = newNode;
            top = newNode;
        } else {
            top.next = newNode;
            top = newNode;
        }
    }

    // poping data from node
    void pop() {
        Node S = head;
        while (S.next.next != null) {
            S = S.next;
        }
        S.next = null;
        top = S;
    }

    // topping data
    void top() {
        if (head == null)
            System.out.println("Stack is empty");
        else {
            System.out.print(top.data + " ");
        }
    }
}

public class Main {
    public static void main(String... args) {
        LinkedList stack = new LinkedList();
        System.out.println("push");
        stack.top(); // empty
        stack.push(1); // pushed 1
        stack.push(2); // pushed 2
        stack.push(3); // pushed 3
        stack.top(); // displays 3
        stack.pop(); // removes 3
        System.out.println("\nTOP after 1 POP");
        stack.top(); // displays 2

    }
}
