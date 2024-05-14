package leetCode;

public class Problem459 {
	public static boolean repeatedSubstringPattern(String s) {
		int n = s.length();
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				String value = s.substring(0, i);
				StringBuilder builder = new StringBuilder();
				for (int j = 0; j < n / i; j++) {
					builder.append(value);
				}
				if (builder.toString().equals(s)) {
					return true;
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		String s = "abab";
		boolean s1 = repeatedSubstringPattern(s);
		System.out.println(s1);
	}
}
