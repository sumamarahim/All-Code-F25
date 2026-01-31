
/** *
 *
 * Task 2: Choose appropriate data structure
 * There is a garage where the access road can accommodate 6 number of trucks
 * at one time. The garage is built in such a way that only the first
 * truck entered can be moved out.
 * Each of the trucks is identified by a positive integer
 * (a truck_id). Write a program to handle truck moves,
 *  allowing for the following commands:
 * • Enter_garage(truck_ id);
 * • Exit_garage(truck_id);
 * • Show_trucks();
 * If an attempt is made to get out a truck which is not the closest to
 * the garage exit, show the error message “Truck is not near garage exit door”.
 */
// based on the scenario, Queue is appropriate data structure.
class Queue {

    int capacity = 6; // 6 trucks can entered to the garage
    int[] garage = new int[capacity];
    // int truckId;
    int front = 0;
    int rear = 0;
    int length = 0;
    int size = 0;

    // enqueue
    void enterGarage(int truckId) {
        // if no trucks in garage
        // if (garage[rear] <= 0) {
        // System.out.println("No trucks in garage!");
        // }
        // else {
        garage[rear] = truckId;
        rear = rear + 1 % capacity; //(rear + 1) % capacity;
        // rear = 
        length++;
        System.out.println("Truck entered: " + truckId);

        // }
        if (length > capacity) {
            System.out.println("Garage is full!");
        }
    }

    // dequeue
    void exitGarage(int truckId) {
        if (garage[front] != truckId) {
            System.out.println("Truck is not near to door, so can't exit!");
        } else if (garage[front] == truckId) {
            front = front + 1 % capacity;
            length--;
            System.out.println("Truck exit: " + truckId);
        } else {
            System.out.println("No truck is in garage!");
        }
    }

    void display() {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == 0) {
                System.out.println("Empty Spot"); 
            }else {
                System.out.println(garage[i]);
            }
        }
    }
}

class Task2Main {

    public static void main(String... args) {
        Queue garage = new Queue();
        garage.enterGarage(100);
        garage.enterGarage(200);
        garage.enterGarage(300);
        garage.enterGarage(400);
        // garage.enterGarage(500);
        // garage.enterGarage(600);
        garage.display();
        garage.exitGarage(200);
        garage.display();
    }
}
