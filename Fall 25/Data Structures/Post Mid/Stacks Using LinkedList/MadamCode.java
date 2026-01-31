class StackLinkedList {
    // a linked list node
    private class Node {
        int data;
        Node link; // ref var Node type
    }
    // create global top ref var
    Node top;
    StackLinkedList() {
        this.top = null;
    }
    void push(int x) {
        Node temp = new Node();
        if (top == null) {
            temp.data = x;
            top = temp;
            return;
        }
        else {
            temp.data = x;
            temp = top;
            top = temp;
        }
    }
}