package practice;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			index ^= nums[i];
		}
		return index;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 1, 2, 1, 2 };
		int value = singleNumber(nums);
		System.out.println(value);
		StringBuilder rev = new StringBuilder("A man, a plan, a canal: Panama");
		rev.reverse();
		boolean flag = "race a car".equals(rev.toString());
		System.out.println(flag);
		 StringBuilder str=new StringBuilder("hryur");
		 str.toString().length();

	}
}
