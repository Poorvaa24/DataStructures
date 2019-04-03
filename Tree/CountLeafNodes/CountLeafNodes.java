
public class CountLeafNodes {
	
	Node root;
	int count = 0;
	
	CountLeafNodes()
	{
		root = null;
	}

	public void insertKey(int value)
	{
		root = insertNode(root, value);
	}
	public Node insertNode(Node root, int value)
	{
		if(root == null)
		{
			Node n = new Node(value);
			root = n;
			return root;
		}
		
		if(root.value > value)
		{
			if(root.left == null)
			{
				Node n1 = new Node(value);
				root.left = n1;
			}
			else
			{
				insertNode(root.left, value);
			}
		}
		else
		{
			if(root.right == null)
			{
				Node n2 = new Node(value);
				root.right = n2;
			}
			else
			{
				insertNode(root.right, value);
			}
		}
		return root;
	}
	
	public void countNodes()
	{
		int c = countLeaf(root);
		System.out.println(c);
	}
	
	public int countLeaf(Node root)
	{
		if(root.left == null && root.right == null)
		{
			count = count + 1;
		}
		else
		{
			if(root.left != null)
			{
				countLeaf(root.left);
			}
			
			if(root.right != null)
			{
				countLeaf(root.right);
			}
		}
		return count;
	}
}
