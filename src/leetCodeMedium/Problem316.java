package leetCodeMedium;

import java.util.HashSet;
import java.util.Set;

public class Problem316 {
	public static String removeDuplicateLetters(String s) {
		Set<Character> set = new HashSet<>();
		StringBuilder stringBuilder = new StringBuilder();

		for (char c : s.toCharArray()) {

			if (!set.contains(c)) {
				set.add(c);
				stringBuilder.append(c);
			}

		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		String s = "bcabc";
//		output "abc"
		String value = removeDuplicateLetters(s);
		System.out.println(value);
	}

}
