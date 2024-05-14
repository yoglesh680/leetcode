package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem187 {
	public static List<String> findRepeatedDnaSequences(String s) {

		List<String> list = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		Set<String> rSet = new HashSet<String>();
		int size = 10;
		for (int i = 0; i < s.length() - size; i++) {
			String s1 = s.substring(i, i + size);
			if (set.contains(s1)) {
				rSet.add(s1);
			}
			set.add(s1);
		}
		for (String s1 : rSet) {
			list.add(s1);
		}
		return list;

	}

	public static void main(String[] args) {
		String str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		List<String> list = new ArrayList<String>();
		list = findRepeatedDnaSequences(str);
		System.out.println(list);

	}
}
