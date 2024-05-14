package leetCode;

public class Problem392 {
	public static boolean isSubsequence(String s, String t) {
		int a = 0;
		int b = 0;
		while (a < s.length() && b < t.length()) {
			if (s.charAt(a) == t.charAt(b)) {
				a++;
			}
			b++;
		}

		return a == s.length();

	}

	public static void main(String[] args) {
		String s = "axc";
		String s1 = "ahbgdc";
		boolean data = isSubsequence(s, s1);
		System.out.println(data);
	}

}
