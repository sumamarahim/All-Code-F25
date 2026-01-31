class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;   
    }
}
 

class LinkList
{
    Node Head;      

    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if (Head == null) // checking for first node
        {
            Head = newNode;
        }
        else 
        {
            Node lastNode = Head;
            while (lastNode.next != null)
            {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }


    // insertion at beginning when not exist
    public void insertionAtBeginning1()
    {
        Node newNode = new Node(data);
        
    }
        

    // method to print link list
    public void printLL()
    {
        Node currentNode = Head;
        while (currentNode != Head)
        {
            System.out.print(currentNode.data + ", ");
            currentNode = currentNode.next;
        }
    }
}

public class Main
{
    public static void main(String... args)
    {
        LinkList list = new LinkList();
        
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);

        System.out.println("Linked List is here");
        list.printLL();
    }
}