package leetCodeMedium;

public class Problem12 {

	public static String intToRoman(int num) {
		int[] values = { 1, 5, 10, 50, 100, 500, 1000 };
		String[] stringValues = { "I", "V", "X", "L", "C", "D", "M" };
		StringBuilder roman = new StringBuilder();

		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				
				num -= values[i];
				roman.append(stringValues[i]);
			}
		}

		return roman.toString();

	}

	public static void main(String[] args) {
		int num = 58;
		String s = intToRoman(num);
		System.out.println(s);

	}
}
