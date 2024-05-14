package leetCodeMedium;

public class Problem3024 {
	public static String triangleType(int[] nums) {
		int a = nums[0], b = nums[1], c = nums[2];
		if (a + b <= c || b + c <= a || a + c <= b) {
			return "none";
		}
		if (a == b || a == c) {
			return "equilateral";
		}
		if (a == b || b == c || c == a) {
			return "isosceles";
		}
		return "scalene";

	}

	public static void main(String[] args) {
		int[] nums = { 8, 4, 2 };
		String str = triangleType(nums);
		System.out.println(str);
	}

}
