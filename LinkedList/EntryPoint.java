package poorvatutorial1;

public class EntryPoint {

	public static void main(String[] args) {
		
		Linkedlist list = new Linkedlist();
		list.InsertNode(1);
		list.InsertNode(3);
		list.InsertNode(4);
		list.InsertNode(6);
		list.InsertNode(7);
		list.InsertNode(4);
		list.InsertNode(8);
		list.InsertNode(2);
		list.InsertNode(1);
		list.Show();
//		list.InsertSort(2);
//		list.InsertSort(15);
//		list.InsertSort(4);
//		list.Show();
//		list.ReverseList();
//		list.Show();
		list.DeleteNode(1);
		list.Show();
	}

}
