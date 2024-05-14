package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem859 {
	public static List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0 || strs == null) {
			new ArrayList<List<String>>();
		}
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String s : strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String s1 = new String(ch);
			if (!map.containsKey(s1)) {
				map.put(s1, new ArrayList<String>());
			}
			map.get(s1).add(s);
		}
		return new ArrayList<List<String>>(map.values());
	}

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> list = new ArrayList<List<String>>();
		list = groupAnagrams(strs);
		System.out.println(list);
	}

}
