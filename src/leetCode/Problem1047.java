package leetCode;

import java.util.Stack;

public class Problem1047 {
	public static String removeDuplicates(String s) {
		Stack<Character> set = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (!set.isEmpty() && set.peek() == c) {
				set.pop();
			} else {
				set.push(c);
			}
		}
		StringBuilder builder = new StringBuilder();
		while (!set.isEmpty()) {
			builder.insert(0, set.pop());
		}
		return builder.toString();

	}

	public static void main(String[] args) {
		String s = "abbaca";
		String t = removeDuplicates(s);
		System.out.println(t);
	}
}
