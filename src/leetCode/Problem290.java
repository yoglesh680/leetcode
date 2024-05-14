package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem290 {
	public static boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");

		if (pattern.length() != words.length) {
			return false;
		}
		Map<Character, String> hm = new HashMap<Character, String>();
		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			boolean key = hm.containsKey(ch);
			if (hm.containsKey(words[i]) && !key) {
				return false;
			} else if (key && !hm.get(ch).equals(words[i])) {
				return false;
			} else {
				hm.put(ch, words[i]);
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog dog dog dog";
		boolean data = wordPattern(pattern, s);
		System.out.println(data);

	}
}
