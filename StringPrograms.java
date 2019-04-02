package poorvatutorial;

public class StringPrograms {

	
	public static String CompareString(String s1, String s2)
	{   String result = "";
		if(s1.equals(s2))
		{
			result = "Both are equal";
		}
		else
		{
			result = "Not equal";
		}
		
		return result;
	}
	
	public static String ReverseString(String s)
	{ 
		char temp = '\0';
		char[] k = s.toCharArray();
		int n = k.length;
		for ( int i = 0 ; i < n/2 ; i++)
		{
			temp = k[i];
			k[i] = k[n-1-i];
			k[n-1-i] = temp;
			
		}
		
		//return k.toString();
		return new String(k);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s = CompareString("hello","hello");
     System.out.println(s);
     String newS = ReverseString("hello gaurav");
     System.out.println(newS);
	}

}
