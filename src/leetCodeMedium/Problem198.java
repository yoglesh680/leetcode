package leetCodeMedium;

public class Problem198 {
	public static int rob(int[] nums) {
		int sum = 0;
		int current = 0;
		for (int num : nums) {
			int find = current + num;
			int notFind = Math.max(current, sum);

			sum = find;
			current = notFind;
		}
		return Math.max(sum, current);
	}

	public static void main(String[] args) {
		int[] nums = {2,7,9,3,1};// 4
		int num = rob(nums);
		System.out.println(num);
	}

}
