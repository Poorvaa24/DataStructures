package poorvatutorial;

public class SentenceReverse {
    
	// using single counter.
	// start is staring index
	// end is end index +1.	
	public static void ReverseString(char[] c,int start, int end)
	{
		char temp = 0;
		int n = end - start ;
		for( int i = 0; i < n/2; i++)
		{
			temp = c[start + i];
			c[start + i] = c[end-1-i];
			c[end-1-i] = temp;
		}
	}
	
	
	// using two counters. start is starting index. End is end index.
	public static void ReverseString1(char[] c,int start, int end)
	{   char temp = 0;
		while(start<end)
		{
			temp = c[start];
			c[start]=c[end];
			c[end]=temp;
			start++;
			end--;
		}
		//System.out.println(c);
	}
    
	public static void SentenceAlgo(char[] c)
	{		
		int start = 0;
		int n = c.length-1;
		ReverseString1(c,start,n);
		
		System.out.println(c);
		
		for(int i=0; i<= n+1; i++)
		{
			if(i == n+1)
			{			
				ReverseString1(c,start,i-1);
				
			}
			else if(c[i] == ' ')
			{				 				 
				ReverseString1(c,start,i-1);				
				start = i+1;
			}
			
		}
		System.out.println("The reverse sentence string is: ");
		System.out.println(c);
		
		
		
	}
	public static void main(String[] args) {
		
		String s = "My name is Poorva";
		System.out.println("The original string is: " + s);
		char[] c = s.toCharArray();
		SentenceAlgo(c);
		
		System.out.println(c);
		
      
      
      
	}

}
