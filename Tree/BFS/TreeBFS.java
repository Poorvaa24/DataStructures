import java.util.LinkedList;
import java.util.Queue;

public class TreeBFS {

	Node root;
	
	TreeBFS()
	{
		root = null;
	}
	
	public void insertKey(int value)
	{
		root = insertNode(value, root);
	}
	public Node insertNode(int value, Node root)
	
	{
		if(root == null)
		{
			Node n1 = new Node(value);
			root = n1;
			return root;
		}
		
		if(root.value > value)
		{
			if(root.left == null)
			{
				Node n2 = new Node(value);
				root.left = n2;
			}
			else
			{
				insertNode(value,root.left);
			}
		}
		else
		{
			if(root.right == null)
			{
				Node n3 = new Node(value);
				root.right  = n3;
				
			}
			else
			{
				insertNode(value,root.right);
			}
		}
		return root;
	}
	
	public void printAllNodes()
	{
		System.out.println("All level traversal");
		printAllLevelTraversal(root);
	}
	
	public void printAllLevelTraversal(Node root)
	{
		Queue<Node> q1 = new LinkedList<Node>();
		q1.add(root);
		
		while(!q1.isEmpty())
		{
			Node n = q1.poll();
			System.out.print(n.value +" ");
			if(n.left != null)
			{
				q1.add(n.left);
			}
			
			if(n.right != null)
			{
				q1.add(n.right);
			}
			
		}
		
		
	}
	
}
