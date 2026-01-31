// Project Title: Secure Password Manager (Applied Data Structures and Information Security Concepts)

public class Main {

    class Node {

        Node next, prev;
        String passwd;
        String app;

        Node(String password, String app) {
            this.next = this.prev = null;
            this.passwd = password;
            this.app = app;
        }
    }
    Node head = null;

    // adding to list
    void insert(String password, String app) {
        Node newNode = new Node(password, app);
        // if empty list
        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
        }
        // if only one node exists then add at start
        newNode.next = head;
        head.prev = newNode;
        head.next = newNode;
        newNode.prev = head;
        head = newNode;

        //     // add if some nodes exists
        //     newNode.next = head;
        //     newNode.prev = head.prev;
        //    // head.next = newNode;
        //     newNode.prev = head;
        //     head = newNode;
    }

    // deleting record by app name,
    void delete(String value) {
        Node S = head;
        while (S.next != null) {
            if (S.app == value) {
                S.next.prev = S.prev;
                S.prev.next = S.next;
                // S = S.next; // moves to next for traversing - if need
            }
            S = S.next;
        }
    }

    // search 
    void search(String appName) {
        Node S = head;

        do {
            if (appName == S.app) {
                System.out.println("App: " + S.app + " Password: " + S.passwd);
            }
            S = S.next;
        } while (S != head);
    }

    public static void main(String... args) {
        System.out.println("Test");
        Main ll = new Main();
        // ll.search("app1");
        ll.insert("password1", "app1");
        ll.insert("password2", "app2");
        // ll.display();

    }
}
