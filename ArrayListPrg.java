package poorvatutorial1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPrg {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(14);
		list.add(24);
		list.add(4);
		
		Iterator<Integer> ite = list.iterator();
		//x = 4;
		while(ite.hasNext())
		{
			int item = ite.next();
			if(item == 4)
			{
				
				ite.remove();
			}
		}
		
	System.out.println(list);

	}

}
