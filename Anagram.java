package poorvatutorial;

public class Anagram {
    public static void AnagramAlgo(char[] a, char[] b)
    {
    	int i =0;
    	int j = 0;
    	int ascii = 0;
    	int flag =1;
    	int[] c = new int[256];
    	if(a.length != b.length)
    	{
    		//System.out.println("Strings are not anagrams"); 
    		flag =0;
    	}
    	else
    	{
    		while( i < a.length)
    		{
    			 ascii = (int)a[i];
    			c[ascii] = c[ascii]+1;    			
    			i++;
    		}
    		
    		while( j < b.length)
    		{
    			ascii = (int)b[j];
    			c[ascii] = c[ascii]-1;
    			j++;
    		}
    	}
    	
    for(int k = 0; k < c.length; k++)
    {
    	if(c[k] != 0)
    	{
    		flag=0;
    	}    	    	    	
    }
	
    if(flag ==1)
    {
    	System.out.println("its a anagram");
    }
    else
    {
    	System.out.println("its not a anagram");
    }
    
    }
	
	public static void main(String[] args )
	{
		String s1 = "poorva";
		String s2 = "hajakak";
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		AnagramAlgo(a,b);
		
	}
}
