class QNode {
    int key;
    QNode next;
    QNode (int key) {
        this.key = key;
        this.next = null;
    }

class Queue {
    QNode rare, front;
    public Queue() {
        this.front = this.rare = null;
    }


    void enqueue(int key) {
        QNode temp = new QNode(key);
        // if queue is empty
        if (this.rare == null) {
            this.front = this.rare = temp;
            return;
        }

        // add new nod eate end of queue and change rare
        this.rare.next = temp;
        this.rare = temp;
    }


    void dequeue() {
        // if queue is empty
        if (this.front == null) {
            return;
        }

        // store previous front and move front one node ahead
        this.front = this.front.next;
        // if front becomes NULL, then change rare also as NULL
        if (this.front == null) {
            this.rare = null;
        }
    }

    public static void main(String... args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Queue Front: " + q.front.key);
    }
}
}
