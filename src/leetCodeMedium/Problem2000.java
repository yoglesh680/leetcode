package leetCodeMedium;

public class Problem2000 {
	public static String reversePrefix(String word, char ch) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			
			if (word.charAt(i) == ch) {
				char temp = word.charAt(i);
				sb.append(temp);
				sb.append(word.charAt(0));
			}
			else {
				sb.append(word.charAt(i));
			}
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		String str = "abcdefd";
		char c = 'd';
		String result = reversePrefix(str, c);
		System.out.println(result);
	}

}
