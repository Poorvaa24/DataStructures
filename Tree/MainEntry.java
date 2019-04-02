
public class MainEntry {

	public static void main(String[] args) {
		
		
		Tree t1 = new Tree();
		t1.insertKey(4);
		t1.insertKey(2);
		t1.insertKey(6);
		
		t1.keyPreorder();
		t1.keyInOrder();
		t1.keyPostOrder();

	}

}
