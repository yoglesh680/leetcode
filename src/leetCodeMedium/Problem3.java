package leetCodeMedium;

public class Problem3 {
	public static int lengthOfLongestSubstring(String s) {
		String test = "";
		int maxLength = -1;
		if (s.isEmpty()) {
			return 0;
		}
		else if (s.length() == 1) {
			return 1;
		}
		for (char c : s.toCharArray()) {
			String current = String.valueOf(c);
			if (test.contains(current)) {
				test = test.substring(test.indexOf(current) + 1);
			}
			test = test + String.valueOf(c);
			maxLength = Math.max(maxLength,test.length());
		}

		return maxLength;
	}

	public static void main(String[] args) {
		String s = "pwwkew";
		int data = lengthOfLongestSubstring(s);
		System.out.println(data);
	}

}
