package leetCodeMedium;

public class Problem326 {
	public static boolean isPowerOfThree(int n) {
		if (n <= 0) {
			return false;
		}
		int maxPowerOfThree = (int) Math.pow(3, (int) (Math.log(Integer.MAX_VALUE) / Math.log(3)));
		return maxPowerOfThree % n == 0;

	}

	public static void main(String[] args) {
		int n = 243;
		boolean flag = isPowerOfThree(n);
		System.out.println(flag);
	}
}
