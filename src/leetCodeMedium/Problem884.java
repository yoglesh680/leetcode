package leetCodeMedium;

import java.util.HashMap;
import java.util.Map;

public class Problem884 {
	public static String[] uncommonFromSentences(String s1, String s2) {
		String[] st = s1.split(" ");
		String[] st1 = s2.split(" ");
		String newString = "";
		int k = 0;

		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> newMap = new HashMap<String, Integer>();
		for (String s : st) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		for (String s : st1) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				newMap.put(entry.getKey(), newMap.getOrDefault(entry.getKey(), 0) + 1);
			}
		}
		String[] result = new String[newMap.size()];
		for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
			if (entry.getValue() == 1) {
				newString = entry.getKey();
				result[k++] = newString;
			}
		}
		
		return result;

	}

	public static void main(String[] args) {
		String s1 = "this apple is sweet";
		String s2 = "this apple is sour";
		String[] words = uncommonFromSentences(s1, s2);
		for (String s : words)
			System.out.print(s + " ");
	}

}
