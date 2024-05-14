package leetCodeMedium;

public class Problem5 {
	public static String longestPalindrome(String s) {
		String test = "";
		if (s.isEmpty()) {
			return "";
		} else if (s.length() == 1) {
			return s;
		}
		for (char c : s.toCharArray()) {
			String current = String.valueOf(c);
			if (test.contains(current)) {
				test = test.substring(test.indexOf(current)+1);
			}
			test = test + String.valueOf(c);
		}

		return test;

	}

	public static void main(String[] args) {
		String s = "cbbd";
		String value = longestPalindrome(s);
		System.out.println(value);

//		 "babad"
//		Output: "bab"
	}

}
