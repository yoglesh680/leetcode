package practice;

public class RemoveDuplicates {

	 public static int removeDuplicates(int[] nums) {
	        if (nums == null || nums.length == 0) {
	            return 0;
	        }

	        int i = 0; // Pointer for unique elements

	        // Iterate through the array
	        for (int j = 1; j < nums.length; j++) {
	            // If the current element is different from the previous one
	            if (nums[j] != nums[i]) {
	                // Move the pointer and update the element
	                i++;
	                nums[i] = nums[j];
	            }
	        }

	        // The unique elements are in the first i+1 positions
	        return i + 1;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
	        int result = removeDuplicates(nums);
	        System.out.println(result);  // Output: 5

	        // Print the array with unique elements
	        for (int k = 0; k < result; k++) {
	            System.out.print(nums[k] + " ");
	        }
	        // Output: 1 2 3 4 5
	    }
}
