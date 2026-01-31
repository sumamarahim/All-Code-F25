
/**
 * Date: 12/12/2025
 * Sumama Rahim
 * Course: Data Structures
 * Instructor: Engr. Afifa Zafar
 *
 * Task 3: Data Entry Operator in a company implementation
 * Suppose, you are working as a Data Entry Operator in a company. You have created a dataset that contains the names of N employees. Then your supervisor wants you to add, deleted, update, look/search for a particular employee by name. (Consider, every name in the data set is unique).
 * Now your task is to write a program using a circular singly Link List Data structure which will help you to add, del, and find out the details that your supervisor is looking for.
 * If an operation is performed successfully then print an appropriate message “added/deleted/found successfully”
 *
 */
import java.util.Scanner; // to take input

class EmployeeList {

    class Node {

        String name;
        Node next;

        Node(String name) {
            this.name = name;
        }
    }

    Node head = null;

    // Add employee record
    // ************************************************
    public void add(String name) {
        Node newNode = new Node(name);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }

        System.out.println("Added successfully");
    }

    // Delete employee record
    // **************************************************************
    public void delete(String name) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node S = head;
        Node prev = null;

        do {
            if (S.name.equalsIgnoreCase(name)) {
                break;
            }

            prev = S;
            S = S.next;

        } while (S != head);

        if (!S.name.equalsIgnoreCase(name)) {
            System.out.println("Employee not found");
            return;
        }

        // only one node
        if (S == head && S.next == head) {
            head = null;
        } // deleting head
        else if (S == head) {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }

            head = head.next;
            last.next = head;
        } // deleting in-between
        else {
            prev.next = S.next;
        }

        System.out.println("Deleted successfully");
    }

    // Update employee name
    // ***********************************************************
    public void update(String oldName, String newName) {
        if (head == null) {
            return;
        }

        Node S = head;
        do {
            if (S.name.equalsIgnoreCase(oldName)) {
                S.name = newName;
                System.out.println("Updated successfully");
                return;
            }
            S = S.next;
        } while (S != head);

        System.out.println("Employee not found");
    }

    // Search employee
    // ***********************************************************
    public void search(String name) {
        if (head == null) {
            System.out.println("List empty");
            return;
        }

        Node S = head;
        do {
            if (S.name.equalsIgnoreCase(name)) {
                System.out.println("Found successfully");
                return;
            }
            S = S.next;
        } while (S != head);

        System.out.println("Employee not found");
    }

    // Display
    // *******************************************************
    public void display() {
        if (head == null) {
            System.out.println("No employees.");
            return;
        }

        Node S = head;
        do {
            System.out.println(S.name);
            S = S.next;
        } while (S != head);
    }

    // menu
    // ********************************************************
    void menu() {
        EmployeeList list = new EmployeeList();
        Scanner sc = new Scanner(System.in);

        int ch;
        do {
            System.out.println("\nChoose the option\n1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Display");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter name: ");
                    list.add(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter name to delete: ");
                    list.delete(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Old name: ");
                    String oldName = sc.nextLine();
                    System.out.print("Update with name: ");
                    String newName = sc.nextLine();
                    list.update(oldName, newName);
                    break;

                case 4:
                    System.out.print("Enter name to search: ");
                    list.search(sc.nextLine());
                    break;

                case 5:
                    System.out.println("\nAll employee's Data");
                    list.display();
                    break;
            }
        } while (ch != 0);
    }

}

class Main {

    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        list.menu(); // calling the menu
    }
}
