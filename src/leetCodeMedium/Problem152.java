package leetCodeMedium;

public class Problem152 {
	public static int maxProduct(int[] nums) {
		int sum = 1;
		if (nums[0] < 0) {
			return 0;
		}
		if(nums.length==1) {
			return nums[0];
		}
		for (int num : nums) {
			if (num <= 0) {
				return sum;
			}
			sum *= num;
		}
		return 0;

	}

	public static void main(String[] args) {
		int[] nums = { -2, 0, -1 };
		int num = maxProduct(nums);
		 float value = (1/2);
	      String s=String.valueOf(value);
	      System.out.println(s);
		System.out.println(num);
	}

}
