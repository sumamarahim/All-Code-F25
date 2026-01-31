
class CircularListMadam {

    //Represents the node of list.  
    public class Node {

        int data;
        Node next, prev;

        public Node(int data) {
            this.data = data;
        }
    }
    //Declaring head and tail pointer as null.  
    public Node head = null;
    public Node tail = null;

    //This function will add the new node at the end of the list.  
// Function to insert node in the list 
    public void addNode(int data) {
        // List is empty so create a single node furst 
        if (head == null) {
            Node new_node = new Node(data);
            new_node.next = new_node.prev = new_node;
            head = new_node;
        } else {
            // find last node in the list if list is not empty
            Node last = head.prev;    //previous of head is the last node
            // create a new node  
            Node new_node = new Node(data);
            // next of new_node will point to head since list is circular  
            new_node.next = head;
            // similarly previous of head will be new_node
            head.prev = new_node;
            // change new_node=>prev to last  
            new_node.prev = last;
            // Make new node next of old last  
            last.next = new_node;
            last = new_node;
        }
    }

    public void printNodes() {
        Node temp = head;
        //traverse in forward direction starting from head to print the list
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
        //Adds data to the list  
        CL.addNode(10);
        CL.addNode(20);
        CL.addNode(30);
        CL.addNode(40);
        //Printing original list  
        System.out.println("Original List: ");
        CL.printNodes();
        CL.ReverseNodes();
    }
}
