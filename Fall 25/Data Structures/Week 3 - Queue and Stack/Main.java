

class ArrayStack {
    static final int MAX_SIZE = 5;
    int[] stackArr;
    int top;

    void ArrayStack() {
        stackArr = new int[MAX_SIZE];
        top = -1; // Stack is initially empty
    }

    public void push(int x) {
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stackArr[top] = x;
        System.out.println("Pushed " + x);
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1; // Return error code
        }
        int poppedValue = stackArr[top];
        top--;
        return poppedValue;
    }
}

// --- MAIN CLASS ---
class Main {
    public static void main(String[] args) {
        ArrayStack s = new ArrayStack();
        
        s.push(10);
        s.push(20);
        int val1 = s.pop();
        System.out.println("Popped " + val1);
        
        s.push(30);
        s.push(40);
        int val2 = s.pop();
        System.out.println("Popped " + val2);
    }
}