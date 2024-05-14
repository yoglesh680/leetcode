package leetCode;

public class Problem258AddDigit {
	public static int addDigits(int num) {

		while (num >= 10) {
			int sum = 0;
			while (num != 0) {
				sum = sum + num % 10;
				num = num / 10;
			}
			num = sum;
		}
		return num;
	}

	public static void main(String[] args) {
		int num = 38;
		int n = addDigits(num);
		System.out.println(n);
	}

}
