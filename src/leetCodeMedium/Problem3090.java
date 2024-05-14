package leetCodeMedium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Problem3090 {
	public static int maximumLengthSubstring(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		int num = Collections.max(map.values());
		return num;
	}

	public static void main(String[] args) {
		String s = "bcbbbcba";
		int num = maximumLengthSubstring(s);
		System.out.println(num);
	}

}
