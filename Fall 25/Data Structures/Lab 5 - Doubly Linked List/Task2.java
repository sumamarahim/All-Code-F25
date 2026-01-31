
/** *
 * Date: 12/10/2025
 * Name: Sumama Rahim
 * Reg# F24BSCS039
 * Course: Data Structures
 * Instructor: Ms. Afifa Zafar
 * Lab Task 2:
 * Write a program that lets the user enter the total rainfall for 7 days into a doubly linked list.
 * The program should calculate and display the
 * • Total rainfall for the week,
 * • The average weekly rainfall,
 * • Display Rainfall of day after 5th node.
 * • The day with the highest and lowest amounts.
 * Input Validation: Do not accept negative numbers for weekly rainfall figures
 */
import java.util.Scanner;

class Node {

    Node next;
    Node prev;
    int rainfall;

    Node(int rainfall) {
        this.next = null;
        this.prev = null;
        this.rainfall = rainfall;
    }
}

class LinkedList {

    Node head = null;

    // adding - we will use at end bcz they are asking for 7 days (from 1 to 7)
    void add() {

        // taking user input for rainfall
        Scanner take = new Scanner(System.in);
        System.out.print("enter rainfall: ");
        int rainfall = take.nextInt();

        Node newNode = new Node(rainfall);
        Node S = head;

        // constraint: don't accept negative number
        if (rainfall < 0) {
            System.out.println("Please provide positive number!");
        } else {
            // for first node
            if (head == null) {
                head = newNode;
            } else {
                while (S.next != null) {
                    S = S.next;
                }
                newNode.prev = S;
                S.next = newNode;
            }
        }
    }

    // displaying
    void display() {
        Node S = head;
        int day = 1;
        int total = 0, avg = 0, highest = S.rainfall, lowest = S.rainfall;

        System.out.print("\n\nWeekly rainfall");
        while (S != null) {
            // calculating the sum
            total = total + S.rainfall;
            // calculating the avg
            avg = total / 7; // here 7 is total number of nodes/days

            // highest and lowest rainfall finding
            if (highest < S.rainfall) {
                highest = S.rainfall;
            }

            // lowest rainfall finding
            if (lowest > S.rainfall) {
                lowest = S.rainfall;
            }

            System.out.print("\n Day " + day + ": " + S.rainfall);
            S = S.next; // to move to next node
            day++; // incrementing in num of day
        }
        // printing the avg, total, highest and lowest rainfall of a week
        System.out.println("\n\nPrinting Calculations\nTotal: " + total
                + " Avg: " + avg + " Highest: "
                + highest + " lowest: " + lowest
        );

        // displaying rainfall after 5th node (means 6th nd 7th node)
        Node R = head;
        int count = 1;
        System.out.print("\nNodes after 5th node\n");
        while (R != null) {
            if (count > 5) {
                System.out.print("Node: " + count + "th - " + R.rainfall + "\n");
            }
            R = R.next; // moving to next nodes
            ++count;
        }

    }
}

class Main2 {

    public static void main(String... args) {
        LinkedList list = new LinkedList();
        // list.display();
        list.add();
        list.add();
        list.add();
        list.add();
        list.add();
        list.add();
        list.add();
        list.display();
    }
}
