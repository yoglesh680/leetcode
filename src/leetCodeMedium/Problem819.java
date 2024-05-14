package leetCodeMedium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Problem819 {
	public static String mostCommonWord(String paragraph, String[] banned) {
		String str = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase();
		String[] words = str.split("\\s+");
		String result = "";
		if (banned.length == 0) {

			return words[0];
		}

		Set<String> set = new HashSet<String>();
		for (String s : banned) {
			set.add(s);
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s : words) {
			if (!set.contains(s)) {
				if (map.containsKey(s)) {
					map.put(s, map.get(s) + 1);
				} else {
					map.put(s, 1);
				}
			}
		}

		int max = 0;
		for (String st : map.keySet()) {
			if (map.get(st) >= max) {
				max = map.get(st);
				result = st;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		String str = "a, a, a, a, b,b,b,c, c";
		String[] banned = { "a" };
		String result = mostCommonWord(str, banned);
		System.out.println(result);
	}
}
