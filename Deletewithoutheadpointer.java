
/*
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/

//Function to delete a node without any reference to head pointer.
class Solution
{
    void deleteNode(Node del)
    {
         Node currnode=del.next;
         del.data=del.next.data;
         del.next=currnode.next;
    }
}

