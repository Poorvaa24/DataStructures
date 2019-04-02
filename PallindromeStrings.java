package poorvatutorial1;

public class PallindromeStrings {

	static int PallindromeCount(char str[], int n) 
	{ 
		int arr[][] = new int[n][n]; 
	
		boolean A[][] = new boolean[n][n]; 
	
		for (int i= 0; i< n; i++) 
			A[i][i] = true; 

		for (int i=0; i<n-1; i++) 
		{ 
			if (str[i] == str[i+1]) 
			{ 
				A[i][i+1] = true; 
				arr[i][i+1] = 1 ; 
			} 
		} 

		for (int gap=2 ; gap<n; gap++) 
		{ 

			for (int i=0; i<n-gap; i++) 
			{ 

				int j = gap + i; 
	
				if (str[i] == str[j] && A[i+1][j-1] ) 
					A[i][j] = true; 

				if (A[i][j] == true) 
					arr[i][j] = arr[i][j-1] + arr[i+1][j] + 1 - arr[i+1][j-1]; 
				else
					arr[i][j] = arr[i][j-1] + arr[i+1][j] - arr[i+1][j-1]; 
			} 
		} 
	
		return arr[0][n-1]; 
	} 
	
	
	public static void main(String[] args) {
		
		String str = "madam"; 
		System.out.println(PallindromeCount(str.toCharArray(), str.length())); 
	
	}

}
