package poorvatutorial;

public class MergeSort {
	public static void MergeSortAlgo(int[] arr, int l, int h)
	{
		if(l<h)
		{
			int mid = (l+h+1)/2;
			System.out.println("The mid is : "+mid);
			int[] temp1 = new int[mid-l];
			int[] temp2 = new int[h-mid+1];
			for( int i = l;i <= mid-1; i++)
			{
				temp1[i-l] = arr[i];
				System.out.println("The value in array1 is: "+temp1[i-l]);
			}
			for( int i = mid;i <= h ; i++)
			{
				temp2[i-mid] = arr[i];
				System.out.println("The value in array 2 is :" +temp2[i-mid]);
			}
			MergeSortAlgo(temp1, l , mid-1);
			MergeSortAlgo(temp2, mid, h);
			Merge(temp1, temp2, arr, l, h, mid);
		}
	}
	
	public static void Merge(int[] temp1, int[] temp2, int[] arr, int l, int h, int mid)
	{
		int i = 0;
		int j = 0;	
		int k=l;
		while(i <= temp1.length-1 && j <= temp2.length-1 )
		{
			if(temp1[i] < temp2[j])
			{
				arr[k] = temp1[i];
				i++;
				k++;
				System.out.println("The value in array is: " +arr[k]);
			}
			else 
			{
				arr[k] = temp2[j];
				j++;
			    k++;
			   System.out.println("The value in array is: " +arr[k]);
			}
		}
			while(i <= temp1.length-1)
			{
				arr[k] = temp1[i];
				k++;
				i++;
			}
			while(j <= temp2.length-1)
			{
				arr[k] = temp2[j];
				k++;
				j++;
			}
			
			PrintArray(arr);
	}
	
	public static void PrintArray(int[] arr)
	{
		for( int i = 0; i < arr.length; i ++)
		{
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args) {
		
		int[] myarray= {8,4,9,2};
		MergeSortAlgo(myarray,0,myarray.length-1);		
		
	}

}
