package leetCode;

public class Problem345 {
	public static String reverseVowels(String s) {
		int a = 0;
		int b = s.length() - 1;
		char[] c = s.toCharArray();
		while (a < b) {
			if (!isVowels(c[a])) {
				a++;

			} else if (!isVowels(c[b])) {
				b--;
			} else {
				char temp = c[a];
				c[a] = c[b];
				c[b] = temp;
				a++;
				b--;
			}
		}
		return new String(c);

	}

	private static boolean isVowels(char c) {
		if (c == 'a' || c == 'o' || c == 'i' || c == 'e' || c == 'u' || c == 'A' || c == 'O' || c == 'I' || c == 'E'
				|| c == 'U') {
			return true;
		} else {
			return false;
		}
	}

//	Input: s = "leetcode"
//			Output: "leotcede"
	public static void main(String[] args) {
		String s = "leetcode";
		String data = reverseVowels(s);
		System.out.println(data);
	}
}
