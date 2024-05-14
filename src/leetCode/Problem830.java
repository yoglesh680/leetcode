package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Problem830 {
	public static List<List<Integer>> largeGroupPositions(String s) {
		List<List<Integer>> result = new ArrayList<>();

		int start = 0;
		int end = 0;
		char current = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == current)
				end = i;
			else {
				if (end - start >= 2) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(start);
					list.add(end);
					result.add(list);
				}

				start = i;
				end = i;
				current = s.charAt(i);
			}
		}

		if (end - start >= 2) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(start);
			list.add(end);
			result.add(list);
		}
		return result;
	}

	public static void main(String[] args) {
		String s1 = "abbxxxxzzy";
		System.out.println("Input: " + s1);
		System.out.println("Output: " + largeGroupPositions(s1));

	}
}
