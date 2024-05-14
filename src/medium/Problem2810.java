package medium;

public class Problem2810 {
	public static String finalString(String s) {
		StringBuilder result = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (c == 'i') {
				result.reverse();
			} else {
				result.append(c);
			}
		}
		return result.toString();

	}

	public static void main(String[] args) {
		String s = "poiinter";
		String s1 = finalString(s);
		System.out.println(s1);
	}
}
