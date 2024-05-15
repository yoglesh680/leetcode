package medium;

import java.util.Arrays;

public class Problem97 {
	public static boolean isInterleave(String s1, String s2, String s3) {
		char[] ch2 = s3.toCharArray();
		Arrays.sort(ch2);
		String newString2 = new String(ch2);
		String str = s1 + s2;
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		String newString = new String(ch);
		if (newString2.equals(newString)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String s1 = "aabcc";
		String s2 = "dbbca";
		String s3 = "aadbbbaccc";
		System.out.println(isInterleave(s1, s2, s3));
	}

}
