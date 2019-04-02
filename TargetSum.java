package poorvatutorial1;

public class TargetSum {

	
	public static void FindPairsDiff(int[] arr, int k)
	{
		for(int i = 0; i < arr.length; i ++)
		{
			for( int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] + k == arr[j] || arr[j] + k == arr[i])
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}
	
	public static void FindPairsSum(int[] arr, int k)
	{
		for(int i = 0; i < arr.length; i ++)
		{
			for( int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] + arr[j] == k)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int[] arr = new int[] {4,2,3,5,6,4,1,7};		
		//FindPairsDiff(arr,2);
		FindPairsSum(arr,8);

	}

}
