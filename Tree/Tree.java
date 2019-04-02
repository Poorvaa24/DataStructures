
public class Tree {
	
	Node root;
	
	Tree()
	{
		root = null;
	}

	public void insertKey(int value)
	{
		root = insertNode(value,root);
		
	}
	public Node insertNode(int val, Node root)
	{
		if(root == null)
		{
			Node n1 = new Node(val);
			root = n1;
			return root;
		}
		
		if(root.value > val)
		{
			if(root.left == null)
			{
				Node n2 = new Node(val);
				root.left = n2;
				
			}
			else
			{
				insertNode(val, root.left);
			}
		}
		
		else
		{
			if(root.right == null)
			{
				Node n3 = new Node(val);
				root.right = n3;
				
			}
			else
			{
				insertNode(val, root.right);
			}
		}
		
		
		return root;
		
	}
	
	public void keyPreorder()
	{
		preOrder(root); 
		
	}
	public void preOrder(Node root1)
	{
		System.out.println(root1.value);
		if(root1.left != null)
		{
			preOrder(root1.left);
		}
		if(root1.right!= null)
		{
			preOrder(root1.right);
		}
		
	}
}
