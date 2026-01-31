// LinkedList - 10/23/2025
// creating a Node
class Node
{
    void createNode()
    {
        Node newNode = new Node();
        if (Head == Null)
        {
            Head = newNode;
            Tail = newNode;
        }
        else
        {
            Tail.Next = newNode;
            Tail = newNode;
        }
    }
}

class Main
{
	public static void main (String[] args)
	{
	    Node S = new Node();
	    S.createNode(4);
	}
}
