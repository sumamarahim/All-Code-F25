// Sumama Rahim, F24BSCS039

class Node {

        Node next;
        int data;

        Node(int data) {
                this.data = data;
                this.next = null;
    


    }
}

class List {

        Node head = null;

        void insert_nodes(int data) {
                Node new_node = new Node(data);
                
        // if no node exists
        if (head == null) {
                        head = new_node;
                  } else {

            
                            
            // if nodes exist
            new_node.next = head;
                        head = new_node;
                }


    
    

    
        }

    void display_even() {
                Node S = head;
                int position = 1;
                while (S != null) {
                        if (position % 2 == 0) { // this will search for even nodes

                                System.out.print(S.data + " ");
                        }

            
                        S = S.next; // moves to next

                        position++;
                }




    



        }
}
class Main {

         public static void main(String... args) {
                List list = new List();
                list.insert_nodes(10);
         
        list.insert_nodes(20); // even pos

                list.insert_nodes(30);
                list.insert_nodes(45); // even pos

                list.insert_nodes(50);
                list.display_even();
    

    }
}
