package poorvatutorial;

public class Pallindrome {
    
	public static void Pallindrome(char[] c, int start, int end)
	{ 
		int flag = 1;
		while(start<end)
		{
			if( c[start] != c[end])
			{
				flag = 0;
			}
			start++;
			end--;
		}
		
		if( flag == 1)
		{
			System.out.println("The above string is a pallindrome");
			
		}
		else
		{
			System.out.println("The above string is not a pallindrome");
		}
	}
	public static void main(String[] args) {
		
		String s = "abbahellohhhhhaaahaha";
		char[] c = s.toCharArray();
		Pallindrome(c,6,9);
	}

}
