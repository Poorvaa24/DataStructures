
public class Tree {
	
	Node root;
	
	Tree()
	{
		root = null;
	}

	
	// Constructing Binary Search Tree 
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
	
	// Preorder traversal of a tree 
	public void keyPreorder()
	{
		System.out.println("Preoder of tree is: ");
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
	
	// Inorder traversal of a tree 
	
	public void keyInOrder()
	{
		System.out.println("Inoder of tree is: ");
		inOrder(root);
	}
	public void inOrder(Node root)
	{
		if(root.left != null)
		{
			inOrder(root.left);
		}
		
		if(root.right != null)
		{
			inOrder(root.right);
		}
		
		System.out.println(root.value);
	}
	public void keyPostOrder()
	{
		System.out.println("PostOrder of tree is: ");
		postOrder(root);
	}
	
	// Postorder traversal of a tree 
	
	public void postOrder(Node root)
	{
		if(root.left != null)
		{
			postOrder(root.left);
		}
		System.out.println(root.value);
		
		if(root.right != null)
		{
			postOrder(root.right);
		}
	}
	
}
