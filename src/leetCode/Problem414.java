package leetCode;

public class Problem414 {
	public static int thirdMax(int[] nums) {
		Integer firstMax = null;
		Integer secondMax = null;
		Integer thridMax = null;
		for (Integer num : nums) {
			if (num.equals(firstMax) || num.equals(secondMax) || num.equals(thridMax)) {
				continue;
			}

			if (firstMax == null || num > firstMax) {
				thridMax = secondMax;
				secondMax = firstMax;
				firstMax = num;
			} else if (secondMax == null || num > secondMax) {
				thridMax = secondMax;
				secondMax = num;

			} else if (thridMax == null || num > thridMax) {
				thridMax = num;

			}

		}
		return thridMax != null ? thridMax : firstMax;
		
	}

	public static void main(String[] args) {
		int[] num = { 3, 2, 1 };
		int n = thirdMax(num);
		System.out.println(n);
	}

}
