package leetCode;

public class Problem43 {
	public static String multiply(String num1, String num2) {
		int m = Integer.parseInt(num1);
		int n = Integer.parseInt(num2);
		int result = m * n;
		return String.valueOf(result);

	}

	public static void main(String[] args) {

		String a = "2";
		String b = "3";
		String result = multiply(a, b);
		System.out.println(result);
	}

}
