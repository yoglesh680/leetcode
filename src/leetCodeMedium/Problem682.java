package leetCodeMedium;

import java.util.Stack;

public class Problem682 {
//	"5" - Add 5 to the record, record is now [5].
//	"-2" - Add -2 to the record, record is now [5, -2].
//	"4" - Add 4 to the record, record is now [5, -2, 4].
//	"C" - Invalidate and remove the previous score, record is now [5, -2].
//	"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
//	"9" - Add 9 to the record, record is now [5, -2, -4, 9].
//	"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
//	"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
//	The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
	public static int calPoints(String[] operations) {
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (String st : operations) {
			if (st.equals("+")) {
				int top = stack.pop();
				int newTop = top + stack.peek();
				stack.push(top);
				stack.push(newTop);
			} else if (st.equals("D")) {
				stack.push(2 * stack.peek());

			} else if (st.equals("C")) {
				stack.pop();
			} else {
				stack.push(Integer.valueOf(st));
			}
		}
		while (!stack.isEmpty()) {
			result += stack.pop();
		}
		return result;

	}

	public static void main(String[] args) {
		String[] ops = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		int num = calPoints(ops);
		System.out.println(num);
	}
}
