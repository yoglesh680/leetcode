package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;

public class Problem17 {
	public static List<String> letterCombinations(String digits) {
		String[] strs = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		List<String> list = new ArrayList<>();
		get("", digits, list, strs);
		return list;

	}

	private static void get(String string, String digits, List<String> list, String[] strs) {
		if (digits.isEmpty()) {
			list.add(string);
		} else {
			String str = strs[digits.charAt(0) - '2'];
			for (char s : str.toCharArray()) {
				get(string + s, digits.substring(1), list, strs);
			}
		}
	}

	public static void main(String[] args) {
		String s = "";
		List<String> list = letterCombinations(s);
		System.out.println(list);

	}
}
