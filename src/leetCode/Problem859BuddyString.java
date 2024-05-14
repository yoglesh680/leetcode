package leetCode;

import java.util.Arrays;

public class Problem859BuddyString {
	public static boolean canBeEqual(String s, String goal) {
		if (s.length() != goal.length()) {
			return false;
		}
		char[] ch = new char[s.length()];
		for (int i = 0; i < ch.length - 1; i++) {
			char c = s.charAt(i + 1);
			ch[i] = c;
			ch[i + 1] = s.charAt(i);

		}
		String s1 = "";
		for (char c : ch) {
			s1+=c;
		}

		if (s1.equals(goal)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		String s = "ab";
		String t = "ba";
		boolean data = canBeEqual(s, t);
		System.out.println(data);
		int[] nu = { 6, 8, 2, 6 };
		Arrays.sort(nu);

	}

}
