package poorvatutorial1;

public class LexographicStringSort {

	public static void main(String[] args) {
		
		String[] str = {"poorva", "gaurav", "neha","golu"};
		for(int i = 0; i < str.length ; i++)
		{
			for(int j = 0; j < str.length-1-i ; j++)
			{
				if(str[j].compareToIgnoreCase(str[j+1]) > 0)
				{
					String temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < str.length ; i++)
		{
			System.out.println(str[i]);
		}

	}

}
