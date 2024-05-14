package medium;

import java.util.Arrays;

public class Problem153 {
	 public static  int findMin(int[] nums) {
		 
		 int num=Arrays.stream(nums).sorted().findFirst().getAsInt();
			return num;
	        
	    }
	public static void main(String[] args) {
		int[] nums= {3,4,5,1,2};
		int value=findMin(nums);
		System.out.println(value);
	}

}
