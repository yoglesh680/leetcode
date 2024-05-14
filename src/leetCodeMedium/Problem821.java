package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;

public class Problem821 {

	public static int[] shortestToChar(String s, char c) {
		int[] data = new int[s.length()];
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				list.add(i);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			int min = Integer.MAX_VALUE;
			for (int j = 0; j < list.size(); j++) {
				min = Math.min(min, Math.abs(i - list.get(j)));
			}
			data[i] = min;
		}

		return data;
	}

	public static void main(String[] args) {
		String str = "loveleetcode";
		char c = 'e';
		int[] data = shortestToChar(str, c);
		for (int num : data) {
			System.out.print(num + " ");
		}
	}

}
