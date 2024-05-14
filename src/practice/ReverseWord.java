package practice;

public class ReverseWord {
	public static String reverseWords(String s) {
		String[] words = s.split(" ");
		StringBuilder reverseS = new StringBuilder();

		for (String word : words) {
			StringBuilder reversedW = new StringBuilder(word);

			reverseS.append(reversedW.reverse()).append(" ");
		}

		return reverseS.toString().trim();
//		String[] words = s.split(" ");
//		int len = words.length;
//		StringBuilder builder = new StringBuilder();
//		for (int i = len - 1; i >= 0; i--) {
//
//			builder.append(words[i]);
//			builder.append(" ");
//
//		}
//		builder.reverse();
//		return builder.toString();

	}

	public static void main(String[] args) {
		String str = "take LeetCode contest";
		System.out.println(str);
		String value = reverseWords(str);
		System.out.println(value);
	}
}
