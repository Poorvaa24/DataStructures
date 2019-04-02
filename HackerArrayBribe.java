package poorvatutorial1;

public class HackerArrayBribe {
	
	
	public static void main(String[] args) {
		int[] a = new int[]{1,2,5,3,4,7,8,6};
		int n = 0;
		int m = 0;
		int l = a.length;
		int flag = 0;
		int bribe = 0;
		int j = 0;
		for(int i = 0; i < a.length; i++)
		{
			while( j < a.length-1)
			{
				if(a[j] > a[j+1])
				{  
					n = j+2;
					m = j+3;
					if(n<l && m<l)
					{
						if((a[j] > a[j+2]) && (a[j] > a[j+3]))
								{
							        System.out.println("Too chaotic");
							        flag = 1;
							        break;
								}
					}
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					bribe++;
					j++;
					break;
				} 
				j++;
				
			}
			if(flag == 1)
			{
				break;
			}
		}
		if(flag == 0)
		{
		System.out.println(bribe);
		}
		      	

	}

}
