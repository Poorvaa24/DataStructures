
public class SprialMatrix {

	public static void printSpiralMatrix(int[][] arr,int m ,int  n)
	{
		
		int l = 0;
		int k = 0;
		int a = n-1;
		int b = m -1;
		int c = 0;
		
		
		while(k < m && l < n)
		{
		//printing the 1st row of the matrix //m denotes row and n denotes columns
		
		for(int j = l; j < n ; j++ )
		{
			System.out.print(arr[k][j]+" ");
		}
		k++;
		
		//printing the last column of the matrix
		for(int i = k; i < m ; i++)
		{
			System.out.print(arr[i][a]+" ");
		}
		a--;
		
		//printing the last row of the matrix
		for(int j = a; j >= l ; j--)
		{
			System.out.print(arr[b][j]+ " ");
		}
		b--;
		
		//printing the 1st column of the matrix
		for(int i = b; i > l; i--)
		{
			System.out.print(arr[i][c]+" ");
		}
		c++;	
		l++;
		n--;
		m--;
		}
	}
	
	
public static void main(String[] args)	
{
	//int a[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
	int a[][] = new int[][]{{1,2,3,4}, {5,6,7,8}};
	int m = 2;
	int n = 4;
	printSpiralMatrix(a, m , n);
}
}
