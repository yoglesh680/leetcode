package leetCode;

public class Problem520 {
	public static boolean detectCapitalUse(String word) {
		int caps = 0, first = 0, last = 0;
		for (char c : word.toCharArray()) {
			if (c >= 65 && c <= 90) {
				caps++;
				if (first == 0)
					first = 1;
			} else {
				last++;
				if (first == 0)
					first = 2;

			}
		}
		if (caps == 0 || last == 0 || first == 1 && caps == 1) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		String s = "FlaG";
		boolean s1 = detectCapitalUse(s);
		System.out.println(s1);

	}
}
