package poorvatutorial1;

public class HackerRankMinSwap {

	public static void main(String[] args) {
		
		int[] arr = new int[] {3, 7 ,6 ,9 ,1 ,8, 10 ,4 ,2, 5};
		int min_swap = 0;
		int temp = 0;
		int mid =(arr.length)/2;
		
		if(arr[0] > arr[mid])
		{
			temp = arr[0];
			arr[0] = arr[mid];
			arr[mid] = temp;
			min_swap++;
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					min_swap++;
				}
			}
		}
		System.out.println(min_swap);
	}

}
