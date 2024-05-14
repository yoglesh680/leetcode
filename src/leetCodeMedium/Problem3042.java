package leetCodeMedium;

public class Problem3042 {
	public static int countPrefixSuffixPairs(String[] words) {
		int count = 0;
		int n = words.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (isPrefixAndSuffix(words[i], words[j])) {
					count++;
				}
			}
		}
		return count;

	}

	public static boolean isPrefixAndSuffix(String str1, String str2) {
		return str2.startsWith(str1) && str2.endsWith(str1);
	}

	public static void main(String[] args) {
		String[] words = { "abab", "ab" };
		int num = countPrefixSuffixPairs(words);
		System.out.println(num);

	}
}
