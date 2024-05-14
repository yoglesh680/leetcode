package leetCodeMedium;

public class Problem72 {

	public static int minDistance(String word1, String word2) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		if(word2.isEmpty()) {
			return word1.length();
		}
		if (word1.length() != word2.length()) {
			return word2.length();
		}
		
		for (int i = 0; i < word2.length(); i++) {
			sb.append(word2.charAt(i));
			if (word1.charAt(i) != word2.charAt(i)) {
				sb.deleteCharAt(i);
				sb.append(word2.charAt(i));
				count++;
			}

		}
		return count;

	}

	public static void main(String[] args) {
		String s1 = "b";
		String s2 = "";
		int num = minDistance(s1, s2);
		System.out.println(num);
//		Input: word1 = "horse", word2 = "ros"
//				Output: 3
//				Explanation: 
//				horse -> rorse (replace 'h' with 'r')
//				rorse -> rose (remove 'r')
//				rose -> ros (remove 'e')
	}

}
