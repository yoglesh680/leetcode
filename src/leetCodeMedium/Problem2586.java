package leetCodeMedium;

public class Problem2586 {
	public static int vowelStrings(String[] words, int left, int right) {

		int count = 0;
		for (int i = left; i < right; i++) {
			if (isVowelString(words[i])) {
				count++;
			}
		}
		return count;
	}

	public static boolean isVowelString(String string) {
		char firstChar = string.charAt(0);
		char lastChar = string.charAt(string.length() - 1);

		return isVowel(firstChar) && isVowel(lastChar);

	}

	private static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

//		while (left <= right) {
//			for (int i = 0; i < words.length; i++) {
//				if ((words[i].startsWith("a") || words[i].startsWith("i") || words[i].startsWith("o")
//						|| words[i].startsWith("u") || words[i].startsWith("e"))&&( words[i].endsWith("a")
//						|| words[i].endsWith("i") || words[i].endsWith("o") || words[i].endsWith("u")
//						|| words[i].endsWith("e"))) {
//					count++;
//				}
//				left++;
//				right--;
//			}
//		}
//		return count;

	public static void main(String[] args) {
		String[] words = { "vo", "j", "i", "s", "i" };
		int result = vowelStrings(words, 0, 3);
		System.out.println(result);
	}
}
