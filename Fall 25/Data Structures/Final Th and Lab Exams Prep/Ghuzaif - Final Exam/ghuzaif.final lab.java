class Order {
    int orderId;
    String customerName;
    Order next;

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.next = null;
    }
}

class PizzaOrderSystem {
    private Order front;
    private Order rear;

    public PizzaOrderSystem() {
        this.front = this.rear = null;
    }

    public void Add_Order(int orderId, String customerName) {
        Order newOrder = new Order(orderId, customerName);
        if (rear == null) {
            front = rear = newOrder;
        } else {
            rear.next = newOrder;
            rear = newOrder;
        }
      return;
    }

    public void Cancel_Order() {
        if (front == null) {
            System.out.println("No orders cancel");
            return;
        }
        
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }

    public void ViewAllOrder() {
        if (front == null) {
            System.out.println("Empty queue.");
            return;
        }
        Order temp = front;
        while (temp != null) {
          
      temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PizzaOrderSystem system = new PizzaOrderSystem();
        system.Add_Order(101, "Ali");
        system.Add_Order(102, "Babar");
        system.ViewAllOrder();
        system.Cancel_Order();
        system.ViewAllOrder();
    }
}