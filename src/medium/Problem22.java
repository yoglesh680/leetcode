package medium;

import java.util.ArrayList;
import java.util.List;

public class Problem22 {
	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		if (n == 1) {
			list.add("()");
		} else {
			helper(list, "", n, n);
		}

		return list;

	}

	private static void helper(List<String> list, String str, int left, int right) {
		if (left == 0 && right == 0) {
			list.add(str);
		}
		if (left > 0) {
			helper(list, str + "(", left - 1, right);
		}

		if (right > left) {
			helper(list, str + ")", left, right - 1);
		}
	}

	public static void main(String[] args) {
		int n = 3;
		List<String> list = new ArrayList<String>();
		list = generateParenthesis(n);
		System.out.println(list);
	}

}
