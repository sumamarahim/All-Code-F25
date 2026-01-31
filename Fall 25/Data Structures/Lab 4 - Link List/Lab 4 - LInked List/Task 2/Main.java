
// creates nodes
class Mobile {
    Mobile next;
    public String brand; // phone brand name
    public int unitsOnHand; // holds on hand invantory
    public double price; // holds retail price

    // constructor which accepts the arguments for each member vriable
    public void Mobile(String name, int units, double price) {
        this.brand = name;
        this.unitsOnHand = units;
        this.price = price;
        this.next = null;
    }

}

// creates linked list
class Store {
    Mobile head = null;
    Mobile tail = null;

    // adding new node to the list
    public void addNode(String name, int units, double price) {
        Mobile newMobile = new Mobile();

        // adding new node or inserting at the end
        // checking if node/Mobile exist/empty
        if (head == null) {
            head = newMobile;
            tail = newMobile;
        } else {
            tail.next = newMobile;
            tail = newMobile;
        }
    }

    // inserting at the beginning in the list
    public void insertAtBeginning(String name, int units, double price) {

        Mobile newMobile = new Mobile(); // use whenever we need to insert

        // adding new node or inserting at the end
        // checking if node/Mobile exist/empty
        if (head == null) {
            head = newMobile;
            tail = newMobile;
        } else {
            newMobile = head;
            head = newMobile;
        }
    }

    // now setting the data setter
    void setBrandName(String name) {
        this.brand = name;
    }

    void setUnits(int units) {
        if (units < 0) {
            System.out.println("Units should be greater than 0");
        } else {
            this.unitsOnHand = units;
        }
    }

    void setPrice(double price) {
        this.price = price;
    }

    // setting getters
    String getBrandName() {
        System.out.println("Brand: " + brand);
    }

    // displaying the list
    void display() {
        Mobile current = head;
        // checking if nothing in list
        if (current == null) {
            System.out.println("Nothing in list!");
            return;
        } else {
            System.out.println("Linked List is: ");
            while (current != null) {
                System.out.println("Brand: " + current.brand
                        + " Units: " + current.unitsOnHand
                        + " price: " + current.price);
                current = current.next;
            }
        }
    }
}

class Main {
    public static void main(String... args) {
        // adding something to list
        Store sList = new Store();
        // sList.display(); // currently list have nothing
        // let's add some data
        sList.addNode("Samsung Note 22", 100, 190000.00);
        sList.addNode("Samsung S 22", 100, 195000.00);
        // sList.insertAtBeginning("Samsung S 25", 100, 210000.00);
        sList.setBrandName("Samsung S 26");
        sList.getBrandName();
        // // let's diplay again
        sList.display();
    }
}