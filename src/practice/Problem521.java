package practice;

import java.util.Arrays;

public class Problem521 {
	public static int findLUSlength(String a, String b) {
		int len = 0;
		for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) != b.charAt(0)) {
					len++;
				
			}
		}
		if (len >= 0) {
			return len;
		} else {
			return -1;
		}

	}

	public static void main(String[] args) {
		String a = "aba";
		String b = "cdc";
		int value = findLUSlength(a, b);
		System.out.println(value);
		Math.max(a.length(), b.length());
		
	}

}
