/ Sumama Rahim, F24BSCS039
class Garage {
    int[] queue; 
    int front;    
    int rear;    
    int size;    
    int cap;

     Garage(int cap) {
        this.cap = cap;
        this.queue = new int[cap];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
 
     void Enter_Garage(int truckId) {
        if (size < cap) {
            rear = (rear + 1) % cap;  //  i used % to solve overflow isssue
            queue[rear] = truckId;
            size++;
            System.out.println("Truck " + truckId);
        } else {
            System.out.println("Garage is full!");
        }
    }

    
     void Exit_Garage(int truckId) {
        if (size > 0 && queue[front] == truckId) {
            System.out.println("Truck " + truckId + " exited the garage.");
            front = (front + 1) % cap;  //  i used % to solve overflow isssue 
            size--;
        } else {
            System.out.println("Truck is not near garage exit door.");
        }
    }

     void showTrucks() {
        if (size == 0) {
            System.out.println("Garage is empty.");
        } else {
            System.out.print("Trucks in the garage: ");
            int i = front;
            for (int j = 0; j < size; j++) {
                System.out.print(queue[i] + " ");
                i = (i + 1) % cap; //  i used % to solve overflow isssue
            }
            System.out.println();
        }
        
    }

}

class Main {
   
    public static void main(String[] args) {
        Garage list = new Garage(6); 
        list.Enter_Garage(10);
        list.Enter_Garage(20);
        list.Enter_Garage(30);
        list.showTrucks();
        list.Exit_Garage(10); // this should remove
        list.showTrucks(); // now 20 and 30 are in garage
        // i want to exit  the truck ID 30 from the garage
        list.Exit_Garage(30); // this should not allowed for exit
        list.showTrucks();

    }
}