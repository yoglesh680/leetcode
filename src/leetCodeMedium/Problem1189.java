package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;

public class Problem1189 {
	public static int maxNumberOfBalloons(String text) {
		List<Character> list = new ArrayList<>();
		for (char ch : text.toCharArray()) {
			list.add(ch);
		}
		int count = 0;
		while (countValue(list)) {
			count++;
		}
		return count;
	}

	private static boolean countValue(List<Character> list) {
		String str = "ballon";
		for (char ch : str.toCharArray()) {
			if (!list.remove(Character.valueOf(ch))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "ballon";
		int result = maxNumberOfBalloons(s);
		System.out.println(result);
	}

}
