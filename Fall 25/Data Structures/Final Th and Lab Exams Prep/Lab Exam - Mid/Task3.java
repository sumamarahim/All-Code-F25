
/** *
 * Task 3: Choose appropriate data structure
 * Suppose you are working as a sales inventory operator. You have created a
 * dataset that contains the item names and their respective IDs in an inventory system.
 * Your manager can request that you add, delete, and search for a particular item by name.
 * Your task is to write a program using a circular doubly linked list data structure that will allow you to:
 * • Add new items in the mid of the inventory (specific position)
 * • Delete items from the inventory from last.
 * • Display Inventory data
 * If an operation is performed successfully, print an appropriate message:
 * • “Added successfully” for addition.
 * • “Deleted successfully” for deletion.
 */
// Appropriate Data Structure: Circular Doubly Linked List
// creates node
class Inventory {

    Inventory prev;
    Inventory next;
    int data; // need to change accordingly

    Inventory(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
// list

class DataSet {

    Inventory head = null;

    // add node
    void add (int data, int position) {
        Inventory newStock = new Inventory(data);
        // if empty list
        if (head == null) {
            head = newStock;
            newStock.prev = newStock;
            newStock.next = head;
            System.out.println("Data Added Successfully!");
        } else {
            // newStock.next = head;
            // newStock.prev = head.prev;
            // head.prev = newStock;
            // head = newStock;
            Inventory S = head;
            for (int i = 1; i < position && S.next != head; i++) {
                S = S.next;
            }
            newStock.next = S.next;
            // newStock.next.prev = newStock;
            S.next.prev = newStock;
            S.next = newStock;
            newStock.prev = S;
            System.out.println("Data Added Successfully ...");
        }

    }
    // void addPos(int data, int position) {

    //     // adding at specific position
    //     // else {
    //         Inventory S = head;
    //         Inventory newStock = new Inventory(data);
    //         int count = 0;
    //         do { 
    //             count++;
    //             if (position == count) {
    //                 newStock.next = S.next;
    //                 newStock.next.prev = newStock;
    //                 // S.next.prev = newStock;
    //                 S.next = newStock;
    //                 newStock.prev = S;
    //                 System.out.println("Data Added Successfully at position: " + position);
    //             }
    //             S = S.next;
    //         } while (S != head);
    // }
    // displaying inventory data
    void Display() {
        Inventory S = head;
        do {
            System.out.println(S.data);
            S = S.next;
        } while (S != head);
    }
}

// main program
class Task3Main {

    public static void main(String... args) {
        DataSet list = new DataSet();
        list.add(10, 0);
        list.Display();
        list.add(20, 1);
        list.add(30, 3);
        list.add(40, 3);
        list.add(40, 2);
        list.Display();
    }
}
