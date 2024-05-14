package leetCode;

public class Problem2710 {

	public static String removeTrailingZeros(String num) {
		int n = num.length();
		int i = n - 1;
		while (i >= 0 && num.charAt(i) == '0') {
			i--;
		}
		return num.substring(0, i + 1);
//		StringBuilder sb = new StringBuilder(num);
//		for (int i = 0; i < sb.length() - 1; i++) {
//			if (num.charAt(i) == '0' && num.charAt(i + 1) == '0') {
//				sb.delete(i, i + 2);
//			}
//		}
//		return sb.toString();

	}

	public static void main(String[] args) {
		String num = "51230100";
		String result = removeTrailingZeros(num);
		System.out.println(result);

	}

}
//Input: num = "51230100"
//Output: "512301"