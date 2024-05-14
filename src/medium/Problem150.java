package medium;

import java.util.Stack;

public class Problem150 {
	public static int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		String operator = "+-/*";
		for (String token : tokens) {
			if (operator.indexOf(token) != -1) {
				int d2 = stack.pop();
				int d1 = stack.pop();
				int res = 0;
				if (token.equals("+")) {
					res = d1 + d2;
				} else if (token.equals("-")) {
					res = d1 - d2;
				} else if (token.equals("*")) {
					res = d1 * d2;
				} else if (token.equals("/")) {
					res = d1 / d2;
				}
				stack.push(res);
			} else {
				stack.push(Integer.valueOf(token));
			}

		}
		return stack.pop();

	}

	public static void main(String[] args) {
		String[] tokens = { "2", "1", "+", "3", "*" };
		int value = evalRPN(tokens);
		System.out.println(value);
	}
}
