package leetCode;

public class Problem389 {
	public static char findTheDifference(String s, String t) {
		char r = 0;
		for (char c : s.toCharArray()) {
			r = (char) (r ^ c);
		}
		for (char c : t.toCharArray()) {
			r = (char) (r ^ c);
		}
		return r;

	}

	public static void main(String[] args) {
		String s = "abcd";
		String s1 = "abcde";
		char c = findTheDifference(s, s1);
		System.out.println(c);
	}
}
//Input: s = "abcd", t = "abcde"
//Output: "e"