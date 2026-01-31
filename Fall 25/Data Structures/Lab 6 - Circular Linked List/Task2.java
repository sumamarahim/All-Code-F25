
/** *
 * Date: 12/11/2025
 * Course: Data Structures
 * Instructor: Engr. Afifa Zafar
 *
 * Task 2:
 * In recording scores for a golf tournament, we enter the name and score of the player as the player finishes. i.e., Players’ names and Scores For that we have to design a structure that keeps the information in a way that each player has information about the player next to it and the one behind it as well. Take care that the Last player has information about the first player and the first player has information about the last player also.
 * Implement the above scenario using an appropriate data structure.
 * Your Application should do the following
 * • Add a new Player (at the end)
 * • Delete a player ( user enters the name of the player to be deleted, it can be present at any location)
 * • Display the whole list (all players with their scores)
 * • Display the player with the lowest and max scores in the list.
 * • Display count or all those players having the same scores
 * • Display Backward From a player ( it should print data of all the players behind a
 * player)
 *
 */
import java.util.Scanner;

class GolfTournament {

    class Player {

        String name;
        int score;
        Player next, prev;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    private Player head = null;
    private Player tail = null;

    // Add at END
    // -------------------------------------------------------
    public void addPlayer(String name, int score) {
        Player newPlayer = new Player(name, score);

        if (head == null) {
            newPlayer.next = newPlayer.prev = newPlayer;
            head = tail = newPlayer;
            return;
        }

        newPlayer.next = head;
        head.prev = newPlayer;
        newPlayer.prev = tail;
        tail.next = newPlayer;
        tail = newPlayer;
    }

    // Delete player by name
    public void deletePlayer(String name) {
        if (head == null) {
            System.out.println("List Empty.");
            return;
        }

        Player S = head;

        do {
            if (S.name.equalsIgnoreCase(name)) {
                break;
            }
            S = S.next;
        } while (S != head);

        if (!S.name.equalsIgnoreCase(name)) {
            System.out.println("Player not found.");
            return;
        }

        // 1 node only
        if (S == head && S == tail) {
            head = tail = null;
        } // deleting head
        else if (S == head) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        } // deleting tail
        else if (S == tail) {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        } // middle node
        else {
            S.prev.next = S.next;
            S.next.prev = S.prev;
        }

        System.out.println("Player deleted successfully.");
    }

    // display
    // -------------------------------------------------------------
    public void display() {
        if (head == null) {
            System.out.println("List empty.");
            return;
        }

        Player S = head;
        do {
            System.out.println(S.name + " : " + S.score);
            S = S.next;
        } while (S != head);
    }

    // lowest score
    // ----------------------------------------------------------------
    public void lowestScore() {
        if (head == null) {
            return;
        }

        Player S = head;
        Player low = head;

        do {
            if (S.score < low.score) {
                low = S;
            }
            S = S.next;
        } while (S != head);

        System.out.println("Lowest Score: " + low.name + " -> " + low.score);
    }

    // highest score
    // ----------------------------------------------------
    public void highestScore() {
        if (head == null) {
            return;
        }

        Player S = head;
        Player high = head;

        do {
            if (S.score > high.score) {
                high = S;
            }
            S = S.next;
        } while (S != head);

        System.out.println("Highest Score: " + high.name + " -> " + high.score);
    }

    // Counting Same scorer
    // ------------------------------------------------------------------
    public void countSameScore(int score) {
        int count = 0;
        Player S = head;

        do {
            if (S.score == score) {
                count++;
            }
            S = S.next;
        } while (S != head);

        System.out.println("Players with score " + score + " = " + count);
    }

    // displaying in back from specific player
    // -----------------------------------------------------------------
    public void backwardFrom(String name) {
        if (head == null) {
            return;
        }

        Player S = head;

        do {
            if (S.name.equalsIgnoreCase(name)) {
                break;
            }
            S = S.next;
        } while (S != head);

        if (!S.name.equalsIgnoreCase(name)) {
            System.out.println("Player not found.");
            return;
        }

        System.out.println("Backward from " + name + ":");
        Player p = S.prev;

        do {
            System.out.println(p.name + " : " + p.score);
            p = p.prev;
        } while (p != S.prev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GolfTournament gt = new GolfTournament();

        System.out.println("\nAdding Player");
        gt.addPlayer("Sumama", 378); // adds to list
        gt.addPlayer("Aqsa", 378); // adds to list
        gt.addPlayer("Susan", 371); // adds to list

        System.out.println("Delete Player");
        System.out.print("Name to delete: ");
        gt.deletePlayer(sc.nextLine());

        System.out.println("Display all player's List");
        gt.display(); // displays all players

        System.out.println("Lowest Score");
        gt.lowestScore();

        System.out.println("Highest Score");
        gt.highestScore();

        System.out.println("Count of Same Score");
        gt.countSameScore(378); // counts players having score = 378

        System.out.println("Backward From Player");
        System.out.print("Name: ");
        gt.backwardFrom(sc.nextLine());
    }
}
