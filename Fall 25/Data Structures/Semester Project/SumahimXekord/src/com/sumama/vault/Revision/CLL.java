
public class CLL {

    // circular linked list revision
    class Node {

        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            // this.prev = this.next = null;
        }
    }

    Node head = null;
    void insert(int data){
        // creating first node 
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        newNode.next = head;
        newNode.prev = head;
    }
    // if nodes exists
    newNode.next = head;
    head.prev = newNode;
    newNode.prev = head;
    head = newNode;

    }

    void display() {
        Node S = head;
        do { 
            // if (S == head) {
            //     System.out.println("No node exists");
            // }
            System.out.println(S.data);
            S = S.next;
        } while (S.next != head);
    }

    public static void main(String... args) {
        CLL ll = new CLL();
        // ll.display();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.display();
    }
}
