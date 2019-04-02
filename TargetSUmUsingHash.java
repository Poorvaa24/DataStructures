package poorvatutorial1;

import java.util.HashMap;

public class TargetSUmUsingHash {
	
	public static void FindPairs(int[] arr, int k)
	{   
		HashMap<Integer,Integer> h = new HashMap<>();
		for(int i = 0; i < arr.length ; i++)
		{
			h.put(arr[i], i);
		}
		
		System.out.println("printing hasmap size " + h.size());
		System.out.println(h);
		System.out.println("end of hasmap");
		
		
		for(int i = 0; i < h.size(); i ++)
		{
			if(h.get(k - arr[i]) != i)
			{
				System.out.println(arr[i]+ "," +(k - arr[i]));
			}
		}
	}

	public static void main(String[] args) {
		
    int[] arr = new int[] {4,2,3,5,6,4,1,7};
    FindPairs(arr,8);
	}

}
