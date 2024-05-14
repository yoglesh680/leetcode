package leetCode;

public class Problem1750 {
	public static int minimumLength(String s) {
		int p = 0;
		int n = s.length();
		int s1 = n - 1;
		while (p < s1 && s.charAt(p) == s.charAt(s1)) {
			char pChar = s.charAt(p);
			while (p <= s1 && s.charAt(p) == pChar) {
				p++;

			}
			while (p <= s1 && s.charAt(s1) == pChar) {
				s1--;

			}
		}
		return (s1 - p + 1);

	}

	public static void main(String[] args) {
		String s = "cabaabac";
		int t = minimumLength(s);
		System.out.println(t);
	}

}
