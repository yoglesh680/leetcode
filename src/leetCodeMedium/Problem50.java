package leetCodeMedium;

public class Problem50 {
	public static double myPow(double x, int n) {
		double value = Math.pow(x, n);
		return value;

	}

	public static void main(String[] args) {
		double x = 2.00000;
		int n = 10;

		double result = myPow(x, n);
		System.out.println(result);
	}

}
