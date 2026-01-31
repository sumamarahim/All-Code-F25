    // Sumama Rahim - F24BSCS039
    // 01/05/2026

    class NumberList {

        // Inner class for the Node
        private class Node {

            double data;
            Node next;

            Node(double data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node head;

        public NumberList() {
            this.head = null;
        }

        // --- 1. Insert at Tail (Recursive) ---
        // Adapted from your snippet to work with Java references.
        // Since Java passes by value, we handle the 'head' case in the public method
        // and use recursion for the rest of the list.
        public void insert(double val) {
            if (head == null) {
                // Logic for when the list is empty (pointer == NULL equivalent)
                head = new Node(val);
            } else {
                insertRecursive(head, val);
            }
        }

        private void insertRecursive(Node current, double val) {
            // Base case: If we are at the last node, insert the new node
            if (current.next == null) {
                current.next = new Node(val);
            } else {
                // Recursive step: Traverse to the next node
                insertRecursive(current.next, val);
            }
        }

        // --- 2. Traverse / Display (Recursive) ---
        public void displayList() {
            System.out.print("List content: ");
            displayRecursive(head);
            System.out.println();
        }

        private void displayRecursive(Node current) {
            if (current != null) {
                System.out.print(current.data + " "); // Display data
                displayRecursive(current.next);       // Recursive call
            }
        }

        // --- 3. Count Nodes (Recursive) ---
        public int countNodes() {
            return countRecursive(head);
        }

        private int countRecursive(Node current) {
            if (current == null) {
                return 0;
            } else {
                return 1 + countRecursive(current.next);
            }
        }

        // --- 4. Search for a specific value (Recursive) ---
        public boolean search(double val) {
            return searchRecursive(head, val);
        }

        private boolean searchRecursive(Node current, double val) {
            if (current == null) {
                return false; // Reached end of list, value not found
            }
            if (current.data == val) {
                return true; // Value found
            }
            return searchRecursive(current.next, val); // Keep searching
        }

        // --- Main method for testing ---
        public static void main(String[] args) {
            NumberList list = new NumberList();

            // Testing Insert
            System.out.println("Inserting 10.5, 20.0, 30.5, 40.2...");
            list.insert(10.5);
            list.insert(20.0);
            list.insert(30.5);
            list.insert(40.2);

            // Testing Traverse
            list.displayList();

            // Testing Count
            System.out.println("Total nodes: " + list.countNodes());

            // Testing Search
            double searchVal1 = 30.5;
            double searchVal2 = 99.9;

            System.out.println("Searching for " + searchVal1 + ": "
                    + (list.search(searchVal1) ? "Found" : "Not Found"));

            System.out.println("Searching for " + searchVal2 + ": "
                    + (list.search(searchVal2) ? "Found" : "Not Found"));
        }
    }
