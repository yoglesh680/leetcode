package Notcompelte;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem1221 {
	public static int balancedStringSplit(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		Set<Integer> value = new HashSet<Integer>(map.values());
		if (value.size() == map.size()) {
			return value.size();
		}

		return 1;

	}

	public static void main(String[] args) {
		String s = "RLRRRLLRLL";
		int value = balancedStringSplit(s);
		System.out.println(value);
	}

}
