package leetCodeMedium;

public class Probem1071 {
	public static String gcdOfStrings(String str1, String str2) {
		if (!(str1 + str2).equals(str2 + str1)) {
			return "";
		}
		int gcd = gcd(str1.length(), str2.length());
		return str1.substring(0, gcd);
	}

	private static int gcd(int length, int length2) {
		while (length2 != 0) {
			int temp = length2;
			length2 = length % length2;
			length = temp;
		}
		return length;
	}

	public static void main(String[] args) {
		String s = "ABCABC";
		String s1 = "ABC";
		String result = gcdOfStrings(s, s1);
		System.out.println(result);

	}

}
