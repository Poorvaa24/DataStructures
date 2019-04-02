
public class TargetSUm {

	public static int[] twoSum(int[] nums, int target) 
	{
		int[] a = new int[2];
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = i+1; j < nums.length; j++)
			{
				if(nums[i] + nums[j] == target )
				{
					a[0] = i;
					a[1] = j;
					System.out.println(nums[i] + " + " + nums[j] + " = " + target);
					//return a;						
				}
				//  System.out.println(nums[j]);           	                    	              
			}	            
		}
		return (a);
	}


	public static void main(String[] args) {
		int[] nums = new int[] {2,7,8,9,3};
		twoSum(nums,9);

	}

}
