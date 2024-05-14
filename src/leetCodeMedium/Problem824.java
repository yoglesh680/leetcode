package leetCodeMedium;

public class Problem824 {
//	Input: sentence = "I speak Goat Latin"
//			Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
	public static String toGoatLatin(String sentence) {
		String[] s = sentence.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length; i++) {
			String newString = s[i];
			char ch = Character.toLowerCase(newString.charAt(0));

			if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e') {
				sb.append(newString).append("ma");
			} else {
				sb.append(newString.substring(1)).append(newString.charAt(0)).append("ma");
			}
			for (int j = 0; j <= i; j++) {
				sb.append("a");
			}
			sb.append(" ");

		}

		return sb.toString().trim();

	}

	public static void main(String[] args) {
		String s = "I speak Goat Latin";
		String response = toGoatLatin(s);
		System.out.println(response);

	}

}
