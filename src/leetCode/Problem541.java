package leetCode;

public class Problem541 {
	public static String revereString(String s, int k) {
		char[] ch = s.toCharArray();
		int i = 0, n = s.length();
		while (i < n) {
			int j = Math.min(i + k - 1, n - 1);
			reverse(ch, i, j);
			i = i + 2 * k;
		}
		return new String(ch);
	}

	private static void reverse(char[] ch, int i, int j) {
		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}

	}

	public static void main(String[] args) {
		String s = "abcdefg";
		String rString = revereString(s, 2);
		System.out.println(rString);

	}

}
