
/** *
 * Date: 12/10/2025
 * Lab Task 1:
 * In recording scores for a golf tournament, we enter the name and score of the player as the player finishes. This information is to be retrieved in each of the following ways:
 * For that we have to design a structure which keeps the information in a way that each player has information of the player next to it and the one behind it as well.
 * Implement the above scenario using an appropriate data structure.
 * Your Application should do the following
 *
 * • Add new Player ( at end of list)
 * • Delete a player ( user enters name of player to be deleted)
 * • Display
 * • whole list (all players with their scores
 * • Display player with lowest scores in the list.
 *
 */
class Task1 {
    // add a new player at the end
    // delete a player by its name
    // Display: 1. whole list (names and scores), 2. player with lower scores

    // node
}
// node

class Node {

    Node next;
    Node prev;
    int score;
    String name;

    public Node(int score, String name) {
        this.next = null;
        this.prev = null;
        this.score = score;
        this.name = name;
    }
}

// linked list
class LinkedList {

    Node head = null;

    void insertAtEnd(int score, String name) {
        Node newNode = new Node(score, name);
        Node S = head;

        if (head == null) {
            head = newNode;
            return;
        }

        while (S.next != null) {
            S = S.next;
        }

        S.next = newNode;
        newNode.prev = S;

    }

    // delete a player
    void delete(String playerName) {
        Node S = head;

        while (S != null) {
            if (S.name.equals(playerName)) {

                // case 1: deleting head
                if (S.prev == null) {
                    head = S.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } // case 2: deleting tail
                else if (S.next == null) {
                    S.prev.next = null;
                } // case 3: deleting middle node
                else {
                    S.prev.next = S.next;
                    S.next.prev = S.prev;
                }
                return;
            }
            S = S.next;
        }

        System.out.println("(;- Player not found!");
    }

    // display
    public void displayAll() {
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }

    Node S = head;
    int lowestScore = head.score;

    while (S != null) {
        System.out.println(S.name + ": " + S.score);
        if (S.score < lowestScore) {
            lowestScore = S.score;
        }
        S = S.next;
    }

    System.out.println("Lowest Score: " + lowestScore);
}

}

class Main1 {

    public static void main(String... args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(20, "Ali");
        list.insertAtEnd(10, "Basit");
        list.insertAtEnd(15, "Saad");
        list.insertAtEnd(40, "Hamza");
        // list.delete("khan");
        // list.delete("Basit");
        list.displayAll();

    }
}
