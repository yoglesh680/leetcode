package leetCodeMedium;

public class Problem179 {
	public static String largestNumber(int[] nums) {

		StringBuilder sb = new StringBuilder();
		for (int i = nums.length - 1; i > 0; i--) {

			int r = 0;
			int num = nums[i];
			int temp = num;
			while (num != 0) {
				r = num % 10;
				num /= 10;
				if (r == 0) {
					sb.append(nums[i - 1]);
				}
			}
			sb.append(temp);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		int[] nums = { 10, 2 };// "9534330"
		String result = largestNumber(nums);
		System.out.println(result);
	}
}
