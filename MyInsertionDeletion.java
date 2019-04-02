package poorvatutorial;


public class MyInsertionDeletion {

public static void InsertionArray(int[] arr, int p, int n)
{
	for (int i = arr.length-1; i > p-1;i--)
	{
		arr[i] = arr[i-1];		
	}
	arr[p-1]=n;
	for (int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
	public static void DeleteArray(int[] arr, int p)
	{
		for(int i = p-1; i < arr.length-1; i++)
		{
			arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = 0;
		for(int i = 0; i < arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 InsertionArray(new int[] {1,2,3,4,5,6}, 3, 40);
        DeleteArray(new int[] {12,34,56,76,23}, 1);
	}

}
