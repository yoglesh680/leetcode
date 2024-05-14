package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;

public class Problem2942 {
	public static List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].indexOf(x) != -1) {
				list.add(i);
			}

		}
		

		return list;

	}

	public static void main(String[] args) {
		String[] str = { "abc", "bcd", "aaaa", "cbc" };
		char x = 'a';
		List<Integer> result = findWordsContaining(str, x);
		System.out.println(result);

	}

}
