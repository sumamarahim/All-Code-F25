
/**
 * Date: 12/11/2025
 * Sumama Rahim
 * Reg# F24BSCS039
 * Course: Data Structures
 * Instructor: Engr. Ms. Afifa
 * **************************************************** *
 * Task 1: Circular linked List Task:
 * Consider the above-given code of a doubly circular link list. Now add the following function to it
 * • The function called InsertAtBegin() that adds a node at the beginning of the Circular Linked list.
 * • The function called DeleteNode() to delete a node in Circular Linked List. (consider all scenarios, as we discussed in the previous lab)
 * • The function called CountNode() that displays the number of nodes in the Circular Linked List
 */
class CircularList {

    // Represents the node of list.  
    public class Node {

        int data;
        Node next, prev;

        public Node(int data) {
            this.data = data;
        }
    }

    // Declaring head and tail pointer as null.  
    public Node head = null;
    public Node tail = null;

    // Function to insert node in the list 
    public void addNode(int data) {

        // List is empty so create a single node first 
        if (head == null) {
            Node new_node = new Node(data);
            new_node.next = new_node.prev = new_node;
            head = new_node;
            return;
        } else {
            // find last node in the list if list is not empty
            Node last = head.prev;    // previous of head is the last node

            // create a new node  
            Node new_node = new Node(data);

            // next of new_node will point to head since list is circular  
            new_node.next = head;

            // previous of head will be new_node
            head.prev = new_node;

            // change new_node.prev to last  
            new_node.prev = last;

            // Make new node next of old last  
            last.next = new_node;

            // last = new_node;
        }
    }

    /**
     * start of my code: Solution
     * *********************************************************************
     */
    // i. Insert at Beginning ***
    public void InsertAtBegin(int data) {

        if (head == null) {
            addNode(data);
            return;
        }

        Node last = head.prev;
        Node new_node = new Node(data);

        new_node.next = head;
        head.prev = new_node;

        new_node.prev = last;
        last.next = new_node;

        head = new_node;
    }

    // 2. Deleting node - all scenarios
    public void DeleteNode(int value) {

        // scenario 1: empty linked list
        if (head == null) {
            System.out.println("Linkd list is empty - can't delete!");;
        }

        Node S = head;

        // scenario 2: only one node
        if (S.data == value && S.next == head) {
            head = null;

        }

        // scenario 3: traversing until value found
        while (S.data != value) {
            S = S.next;
            if (S == head) {
                System.out.println("Node not found.");
                return;
            }
        }

        S.prev.next = S.next;
        S.next.prev = S.prev;
    }

    // 3. nodes counting
    public void CountNode() {
        if (head == null) // checking if linked list is empty
        {
            System.out.println("\nNo nodes exists - empty linked list!");
        }
        int count = 1;
        Node S = head;
        while (S.next != head) {
            count++;
            S = S.next;
        }
        System.out.println("\nTotal Nodes = " + count);
    }

    /**
     * End of my code - Solution
     * ********************************************************************************
     */
    // Print forward
    public void printNodes() {
        Node temp = head;

        // traverse in forward direction starting from head 
        while (temp.next != head) {
            System.out.println(temp.data + "");
            temp = temp.next;
        }
        System.out.println(temp.data + "");
    }

    public void ReverseNodes() {
        Node last = head.prev;
        Node temp = last;

        System.out.println("Reverse order List: ");

        while (temp.prev != last) {
            System.out.println(temp.data + "");
            temp = temp.prev;
        }
        System.out.println(temp.data + "");
    }

    public static void main(String[] args) {
        CircularList CL = new CircularList();

        CL.addNode(10);
        CL.addNode(20);
        CL.addNode(30);
        CL.addNode(40);

        System.out.println("Original List:");
        CL.printNodes();

        // Insert at beginning
        CL.InsertAtBegin(5);

        System.out.println("\nAfter InsertAtBegin:");
        CL.printNodes();

// start of my code - methods calling //
        // Delete a node
        int toDelete = 20;
        CL.DeleteNode(toDelete);
        System.out.println("\nAfter Deleting " + toDelete + ":");
        CL.printNodes();
        // Count nodes
        CL.CountNode();
// end of my code - methods calling //

        System.out.println("\nReverse List:");
        CL.ReverseNodes();
    }
}
