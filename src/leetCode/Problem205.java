package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem205 {
	public static boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Character> sToTMap = new HashMap<>();
		Map<Character, Character> tToSMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char schar = s.charAt(i);
			char tchar = t.charAt(i);
			if (sToTMap.containsKey(schar)) {
				if (sToTMap.get(schar) != tchar)
					return false;
			} else {
				sToTMap.put(schar, tchar);
			}
			if (tToSMap.containsKey(tchar)) {
				if (tToSMap.get(tchar) != schar)
					return false;

			} else {
				tToSMap.put(schar, tchar);
			}
		}
		return true;

	}

	public static void main(String[] args) {
		String s = "paper";
		String t = "title";
		boolean data = isIsomorphic(s, t);
		System.out.println(data);
	}
}
