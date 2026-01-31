// // NOTE: this code is working
// lab 6 task 3 - solution

class CircularList {

    //Represents the node of list.  
    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    //Declaring head and tail pointer as null.  
    public Node head = null;
    public Node tail = null;

    //This function will add the new node at the end of the list.  
    public void add(int data) {
        //Create new node  
        Node newNode = new Node(data);
        //Checks if the list is empty.  
        if (head == null) {
            //If list is empty, both head and tail would point to new node.  
            head = newNode;
            tail = newNode;
            newNode.next = head;
            System.out.println(newNode.data + " added successfully!");
        } else {
            //tail will point to new node.  
            tail.next = newNode;
            //New node will become new tail.  
            tail = newNode;
            //Since, it is circular linked list tail will point to head.  
            tail.next = head;
//or newnode.next=head; 
            System.out.println(tail.data + " added successfully!");
        }
    }

    //Displays all the nodes in the list  
    public void search(int data) {
        Node S = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            do {
                //Prints each node by incrementing pointer.  
                if (S.data == data) {
                    System.out.println(S.data + " Found successfully!");
                }
                S = S.next;
            } while (S != head);
            System.out.println();
        }
    }

    //Deletes node from end of the list  
    public void delete(int data) {
        //Checks whether list is empty  
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            //Checks whether contain only one element or many
            if (head != tail) {
//if many
                Node S = head;
                //Loop will iterate till the second last element as S.next is pointing to tail  
                while (S.next.next != head) //or S.next=tail;
                {
                    S = S.next;
                }
//if not using tail then S.next=head;
                //Second last element will be new tail  
                tail = S;
//Tail will point to head as it is a circular linked list  
                tail.next = head;
                System.out.println("deleted successfully!");
            } //If the list contains only one element 
            else //head=tail
            {
                head = tail = null;
            }
            // System.out.println(newNode.data + " deleted successfully!");
        }
    }

    public static void main(String[] args) {
        CircularList CL = new CircularList();
        //Adds data to the list  
        CL.add(1);
        CL.add(2);
        CL.add(3);
        CL.add(4);
        //Printing original list  
        System.out.println("Original List: ");
        CL.search(3);
        CL.delete(3);
        CL.search(1);

    }
}
