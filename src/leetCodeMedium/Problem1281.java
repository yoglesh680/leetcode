package leetCodeMedium;

public class Problem1281 {
	public static int subtractProductAndSum(int n) {
		int r = 0;
		int product = 1;
		int sum = 0;
		int num = n;
		int result=0;
		while (n > 0) {
			r = n % 10;
			product = product * r;
			n = n / 10;
		}
		while (num > 0) {
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
       result=product-sum;
		return result;

	}

	public static void main(String[] args) {
		int num = 234;
		int value = subtractProductAndSum(num);
		System.out.println(value);
	}

}
