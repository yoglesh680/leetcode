package leetCode;

public class Problem80 {
	public static int removeDuplicates(int[] nums) {
		int i=0;
		for(int n:nums) {
			if(i<2||n!=nums[i-2]) {
				nums[i++]=n;
			}
		}
		return i;

	}

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		int num = removeDuplicates(nums);
		System.out.println(num);
	}
}
