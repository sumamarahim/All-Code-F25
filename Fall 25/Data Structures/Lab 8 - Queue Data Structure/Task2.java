// Sumama Rahim
// F24BSCS039

class JosephusProblem {

    //Represents the node of list.  
    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
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
        } else {
            //tail will point to new node.  
            tail.next = newNode;
            //New node will become new tail.  
            tail = newNode;
            //Since, it is circular linked list tail will point to head.  
            tail.next = head;
            //or newNode.next = head;
        }
    }

    // Function to solve the Josephus
    int solveJosephus(Node head, int k) {
        Node S = head;

        while (S.next != S) {
            // Move k-1 steps
            for (int i = 2; i < k; i++) {
                S = S.next;
            }

            // Removing the k-th node
            Node nodeToRemove = S.next;
            System.out.println("Removed: " + nodeToRemove.data);

            S.next = nodeToRemove.next;
            S = S.next;
        }
        return S.data;
    }

    public static void main(String[] args) {
        JosephusProblem list = new JosephusProblem();

        // adding data to the list - we need n = 5 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int k = 2; // k-th should executed and k-1 should ignored

        int survived = list.solveJosephus(list.head, k);
        System.out.println("Last Person: " + survived);
    }
}
