
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 646;
		int temp = num;
		int reverse = 0;
		int digit = 0;
		while(num>0)
		{
			digit = num % 10;
			num = num/10;
			reverse = reverse*10 + digit;
		}
		
		if(temp == reverse)
		{
			System.out.println("Pallindrome");
		}
		else
		{
		System.out.println("Not Pallindrome");
		}
	}

}
