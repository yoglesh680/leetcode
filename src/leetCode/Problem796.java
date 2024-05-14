package leetCode;

public class Problem796 {
	public static boolean rotateString(String s, String goal) {
		if (s.length() != goal.length()) {
			return false;
		}
		String concate = s + s;
		return concate.contains(goal);
	}

	public static void main(String[] args) {
		String s = "abcde";
		String goal = "abced";
		boolean data = rotateString(s, goal);
		System.out.println(data);

	}

}
