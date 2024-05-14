package leetCodeMedium;

public class Problem3081 {
	public static String minimizeStringValue(String s) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '?') {
				sb.append(s.charAt(i) + 1);
			}
			sb.append(s.charAt(i));
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		String s = "a?a?";
		String s1 = minimizeStringValue(s);
		System.out.println(s1);
	}

}
