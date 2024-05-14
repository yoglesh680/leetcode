package Notcompelte;

public class Problem2716 {
	public static int minimizedStringLength(String s) {
		StringBuilder sb = new StringBuilder(s);
		return 0;
	
//		int i = 0;
//		while (i < sb.length()) {
//			char c = sb.charAt(i);
//			int left = i - 1, right = i + 1;
//			while (left >= 0 && sb.charAt(left) == c) {
//				sb.deleteCharAt(left);
//				left--;
//			}
//			while (right < sb.length() && sb.charAt(right) == c) {
//				sb.deleteCharAt(right);
//			}
//			i = right;
		// }

	}

	public static void main(String[] args) {
		String s = "ipi";
		int n = minimizedStringLength(s);
		System.out.println(n);
	}

}
