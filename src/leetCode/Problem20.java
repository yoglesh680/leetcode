package leetCode;

import java.util.Stack;

public class Problem20 {
	public static boolean isValid(String s) {
		Stack<Character> characters = new Stack<Character>();
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (c == '(' || c == '{' || c == '[') {
				characters.push(c);
			} else if (!characters.isEmpty() &&
				(c == '}' && characters.peek() == '{') ||
				(c == ')' && characters.peek() == '(') || 
				(c == ']' && characters.peek() == '[')) {
				characters.pop();
			} else {
				return false;
			}
		}
		return characters.isEmpty();
	}

	public static void main(String[] args) {
		String s = "(]{}";
		boolean value = isValid(s);
		System.out.println(value);
	}
}
