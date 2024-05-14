package leetCode;

public class Problem844Backspace {
	public static boolean backspaceCompare(String s, String t) {
		return compare(s).equals(compare(t));
	}

	public static String compare(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char current = s.charAt(i);
			if (current == '#') {
				count++;
			} else if (count > 0) {
				count--;
			} else {
				sb.append(current);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "ab#c";
		String t = "ad#c";
		boolean data = backspaceCompare(s, t);
		System.out.println(data);
	}

}
