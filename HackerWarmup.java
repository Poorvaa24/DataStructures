package poorvatutorial1;

public class HackerWarmup {

	public static void main(String[] args) {
		String s = "bba";
		int n = 10;
		 int count = 0;
	     int l = s.length();
	     for(int i = 0; i<l; i++)
	     {
	         if(s.charAt(i) == 'a')
	         {
	             count++;
	         }
	     }
      System.out.println(count);
	     int occurances = n / l;
	     int remainder = n % l;
	     int total = occurances * count;
	     if(remainder > 0)
	     {
	        String c = s.substring(0,remainder) ;
	        int length = c.length();
	        for(int j = 0; j <length ; j++)
	        {
	            if(c.charAt(j) == 'a')
	            {
	                total++;
	            }
	        }
	       
	     }

	     

	    System.out.println(total);

	}

}
