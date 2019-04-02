
public class MergeTwoArray {

	public static void main(String[] args) {
		
		int[] nums1 = new int[] {1,2,3,0,0,0};
		int[] nums2 = new int[] {2,5,6};
		
		int m = 3;
		int n = 3;
		int i = 0;
        int j = 0;
        int k = 0;
        int temp = nums1[0];
      
        while( i < m && j < n)
        {
        	
            if( temp < nums2[j])
            {
            	
                nums1[k] = nums1[i];
               
              k++;
              i++;   
              temp = nums1[i];
            }
            else
            {
                nums1[k] = nums2[j];
              temp = nums1[i];
              k++;
              j++;
            }
        }
        
        while(i<m)
        {
            nums1[k] = nums1[i];
            k++;
            i++;
        }
         while(j<n)
        {
            nums1[k] = nums2[j];
            k++;
            j++;
        }
        
        for(int l = 0; l < k; l++)
        {
            System.out.print(nums1[l]);
        }

	}

}
