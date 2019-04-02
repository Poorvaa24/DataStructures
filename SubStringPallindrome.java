package poorvatutorial1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SubStringPallindrome {
	
	public static boolean CheckPallindrome(String str)
	{
		
		int start = 0;
		int end =str.length()- 1;
		while(start < end)
		{
			if(str.charAt(start) != str.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s = "pooorva";
		int count = 0;
		HashSet<String> h = new HashSet<String>();
		for(int i = 0; i < s.length(); i++)
		{
			for(int j = i+1; j < s.length(); j++)
			{
				//System.out.println(s.substring(i, j+1));
				
				
				if(CheckPallindrome(s.substring(i, j+1)))
				{
					System.out.println((s.substring(i, j+1)));
					//h.add(s.substring(i,j+1));
					count++;
					
				}
				
			}
		}
		System.out.println(count);
		
	
	}
	
	

}
