package poorvatutorial;

import java.util.ArrayList;
import java.util.List;

public class MySearch {
	
	public static int id = 0;
	
	
	public static void MyPrint(String s)
	{
		System.out.println(s);
		System.out.println(id);
	}
	
	public static int MyListSize(List<Integer> myList)
	{
		int count = myList.size();
		return count;
	}
	
	public static void MyListPrint(List<Integer> myList)
	{
		for(int i=0;i<myList.size();i++)
		{
			System.out.println(myList.get(i));
		}
	}
	
	public static int MyListSearch(List<Integer> myList,int k)
	{
		int flag=0;
		for(int i=0;i<myList.size();i++)
		{
			if (myList.get(i) == k)
			{
				flag = 1;
				break;
			}			
		}
		return flag;
	}
    
	public static int BinarySearch(List<Integer> myList, int k)
	{
		int flag = 0;
		int l = 0 ;
		int h = myList.size();
		
		while(l <= h)
		{
			int mid = (l+h)/2;
			if (mid > myList.size())
			{
				break;
			}
			
			if (myList.get(mid) == k)
			{
				flag = 1;
				break;
			}
			else if (myList.get(mid) > k)
			{
				h = mid-1;
			}
			else				
			{
				l = mid+1;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String ss = "Poorva1";
		id++;
		List<Integer> myList = new ArrayList<>();
		for (int i=1;i<=50;i++)
		{  
			if( i % 2 == 0)
			{
				myList.add(i);
			}			
		}
		
		int count = MyListSize(myList);
		System.out.println("Count = "+count);
		//int result=MyListSearch(myList,45);
		int result = BinarySearch(myList, 21);
		if(result == 1)
		{
			System.out.println("Number found");
		}
		else
		{
			System.out.println("Number not found");
		}
		//MyListPrint(myList);
		MyPrint(ss);
		
		
		
	}

}
