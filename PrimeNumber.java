
public class PrimeNumber {

	static int flag = 1;
	public static int checkPrime(int n)
	{
		if(n == 1)
		{
			flag = 0;
			return flag;
		}
		
		
			for(int i = 2; i < n; i++)
			{
				int remainder = n % i;
				if(remainder == 0)
				{
					flag = 0;
					break;
					
				}
			}
			return flag;
	
		
		
		
	}
	public static void main(String[] args) {
		
		int n = 19;
		
		int result = checkPrime(n);
		System.out.println(flag);
		
	}

}
