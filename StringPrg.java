package poorvatutorial;

public class StringPrg {

	public static String ReverseString(String s)
	{
		char[] c = s.toCharArray();
		int n = c.length;
		char temp = 0;
		for (int i = 0; i < n/2 ; i ++)
		{
			temp = c[i];
			c[i] = c[n-1-i];
			c[n-1-i] = temp;
		}
		return new String(c);
	}
	public static void main(String[] args) {
		String s = "Poorva";
		System.out.println(s);
		String r=ReverseString("This is my india");
		
		System.out.println(r);
    
	}

}
