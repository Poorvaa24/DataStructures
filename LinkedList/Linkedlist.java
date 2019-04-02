package poorvatutorial1;

public class Linkedlist {

	Node head;
	
	Linkedlist()
	{
		head = null;
	}
	
	public void InsertNode(int data)
	{
		Node newNode = new Node(data);
				
		if(head == null )
		{
			head = newNode;
		}
		else
		{
		  Node n = head;
		  while(n.next != null)
		  {
			  n = n.next; 
		  }
		  
		  n.next = newNode;		  
		}
	}
	
	public void InsertSort(int data)
	{
		Node newNode = new Node(data);
		System.out.println("Inserting newnode: " + data);
		if( head == null)
		{
			head = newNode;
			System.out.println("when head is null");
		}
		else
		{
			Node n = head;
			Node previous = null;
			while(n != null)
			{
				if(n.value < newNode.value)
				{
					System.out.println("when n is less than new node , value of n :" + n.value);
					previous = n;
					n = n.next;
					
				}
				else
				{
					newNode.next = n;
					System.out.println("when n is greater thann new node, n :" + n.value);
					if(previous == null)
					{
						System.out.println("when previous is null");
						head = newNode;
					}
					else
					{   
						System.out.println("insert in between");
						previous.next=newNode;
					}
					break;
				}
			} 
			if(n == null)
			{
				System.out.println("insert in last");
				previous.next = newNode;
			}
		}
	}
	
	public void ReverseList()
	{
		Node previous = null;
		Node current = head;
		Node next = null;
		
		while( current != null)
		{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		head = previous;		
	}
	
	public void DeleteNode(int x)
	{
		if(head == null)
		{
			System.out.println("No nodes in linked list");
		}
		else
		{
			Node n = head;
			Node p = null;
			Node t = n;
			while(t != null)
			{
				if(n.value == x)
				{
					if( p == null)
					{
						head = n.next;
						t = t.next;
						n.next = null;
						n = t;
					}
					else
					{
						p.next = n.next;
						t = t.next;
						n.next = null;
						n = t;
					}
				}
				else
				{
					p = n;
					n = n.next;
					t = t.next;
				}
			}
			
//			if(t == null)
//			{
//				System.out.println("Node not found");
//			}
		}
	}
	
	public void Show()
	{
		Node n = head;
		while( n != null)
		{
			System.out.print(n.value);
			n = n.next;
		}
		
		System.out.println("");
	}
}
