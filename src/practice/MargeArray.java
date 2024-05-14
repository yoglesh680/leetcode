package practice;

public class MargeArray {
	public static void mergeTowArray(int[] nums1, int m, int[] nums2, int n) {
		int i=m-1;
	       int j=n-1;
	       int k=m+n-1;
	       System.out.println("value i " + i);
	       System.out.println("value j " + j);
	       System.out.println("value k " + k);
	       while(j>=0)
	       {
	       if(i>=0 && nums1[i]>nums2[j]){
	           nums1[k]=nums1[i];
	           k--;
	           i--;
	           System.out.println("value of i" + i);
	           System.out.println("value of k" + k);
	           for (int val : nums1) {
		    	   System.out.print(val +" ");
			}
	       }
	       else{
	           nums1[k]=nums2[j];
	           System.out.println("+++++++++++++++++ " + nums2[j]);
	           System.out.println("++++++++++++++++ " + k);
	           k--;
	           j--;
	           System.out.println("value of else j " + j);
	           System.out.println("value of else k " + k);
	           for (int val : nums1) {
		    	   System.out.print(val +" ");
			}
	       }

	       }
	       for (int val : nums1) {
	    	   System.out.print(val +" ");
		}
	      
	}

	public static void main(String[] args) {
		int m = 3, n = 3;
		int[] arr1 = { 1, 2, 3, 0, 0, 0 };
		int[] arr2 = { 2, 5, 6 };
		mergeTowArray(arr1, m, arr2, n);

	}

}
