package poorvatutorial;

public class SortingAlgorithm {
	
	public static void BubbleSort(int[] arr) {
		
		int temp = 0;
		int n = arr.length;
		
		for (int i = 0; i < n-1 ; i++)
		{
			for ( int j = 0; j < n-1-i ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	PrintArray(arr);
	}

	
	public static void SelectionSort(int[] arr)
	{
		int temp = 0;
		int n = arr.length;
		for(int i = 0; i < n-1 ; i++)
			{
				int min = arr[i];
				for(int j = i+1 ; j < n ; j++)
				{
					if(arr[j] < min)
					{
						min = arr[j];
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
			    }							
		}
		PrintArray(arr);
		
			
	}
	
	public static int Partition(int[] arr, int l, int h)
	{ 
		System.out.println("l = " + l + " h = " + h);
		 int p = arr[l];
		 int i = l;
		 int j = h;
		 int temp = 0;	
		while(i < j)
		{
			while(arr[i] <= p)
			{
				i++;
			}
			while (arr[j] > p)
			{
				j--;
			}
			
			if(i<j)
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			
			}
		}
		//System.out.println("final swap is " + arr[l] + " and " + arr[j]);
		temp = arr[j];
		arr[j] = arr[l];
		arr[l] = temp;
		
		return j;
	}
	
	public static void QuickSort(int[] arr, int l, int h)
	{    
		if (l < h)
		{
			int j = Partition(arr,l,h);
			System.out.println("the pivot element location is :"+j);
			QuickSort(arr,l, j-1);
			QuickSort(arr, j+1,h);
			
		}		
	}
	
	
	
	public static void PrintArray(int[] arr)
	{
		for(int i = 0; i < arr.length;i++)
		{
			System.out.print(arr[i] + "- ");
		}
		System.out.println("");
	}
	
	public static void MergeSort(int[] arr,int l, int h, int[] newarray)
	{     
		if(l < h)
		{
			int mid = (l+h+1)/2;
			
			System.out.println("inside Merge sort L = " + l + " H = " + h + " mid = " + mid);
			 
			MergeSort(arr,l, mid-1, newarray);
			MergeSort(arr,mid,h,newarray);
			Merge(arr,l,h,mid,newarray);
		}
	}
	
	public static void Merge(int[] arr,int l, int h , int mid, int[] c)
	{
		System.out.println("inside Merge Method L = " + l + " H = " + h + " mid = " + mid);
		
		int i = l;
		int j = mid;	
		int k=l;
		
		for( int x = l; x <= h; x++)			
		{
			c[x] = arr[x];
		}
		while(i <= mid-1 &&j <= h )
		{
			if(c[i] < c[j])
			{
				arr[k] = c[i];
				i++;
				k++;
			}
			else 
			{
				arr[k] = c[j];
				j++;
			    k++;
				
			}
		}
			while(i<= mid-1)
			{
				arr[k] = c[i];
				k++;
				i++;
			}
			while(j<= h)
			{
				arr[k] = c[j];
				k++;
				j++;
			}
			
			PrintArray(arr);
			
						
	}
	public static void main(String[] args) {
     
//		BubbleSort(new int[] {3,9,5,1,8,2,4});
//		System.out.println("");
//		SelectionSort(new int[] {23,45,1,3,50,9,6});
//		System.out.println("");
//		//int j = Partition(new int[] {10,16,8,12,15,6,3,9,5},0,8);
//		//System.out.println(j);
//		int myarray[] = {2,3,4,1,5};
//		QuickSort(myarray, 0, myarray.length-1);
		//sortAlg(myarray);
//		PrintArray(myarray);
		int oldarray[] = {7, 1, 3, 2, 4, 5, 6};
		int newarray[]=new int[8];
		System.out.println("Starting merge sort ....");
		PrintArray(oldarray);
		MergeSort(oldarray,0,oldarray.length-1,newarray);
		System.out.println();
		
		
		
		
		
	}

}
