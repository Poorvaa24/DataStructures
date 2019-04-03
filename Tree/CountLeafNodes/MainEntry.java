
public class MainEntry {

	public static void main(String[] args) {
	
		CountLeafNodes c = new CountLeafNodes();
		c.insertKey(5);
		c.insertKey(4);
		c.insertKey(6);
		c.insertKey(7);
		c.insertKey(10);
		c.insertKey(8);
		c.insertKey(9);
		
		c.countNodes();
		

	}

}
