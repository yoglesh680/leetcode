package leetCodeMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem49 {
	public static List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) {
			return new ArrayList<List<String>>();
		}
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String ch : strs) {
			char[] c = ch.toCharArray();
			Arrays.sort(c);
			String r = new String(c);
			if (!map.containsKey(r)) {
				map.put(r, new ArrayList<String>());
			}
			map.get(r).add(ch);
		}
		return new ArrayList<List<String>>(map.values());

	}

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> str = groupAnagrams(strs);
		System.out.println(str);

	}

}
