package leetCodeMedium;

public class Problem917 {
	public static String reverseOnlyLetters(String s) {
		char[] result = s.toCharArray();
		int left = 0;
		int right = s.length()-1;
		while (left < right) {

			while (left < right && !Character.isLetter(result[left])) {
				left++;
			}
			while (left < right && !Character.isLetter(result[right])) {
				right--;
			}
			char temp = result[left];
			result[left] = result[right];
			result[right] = temp;
			left++;
			right--;
		}
		return new String(result);
	}

	public static void main(String[] args) {
		String s = "ab-cd";
		String data = reverseOnlyLetters(s);
		System.out.println(data);
	}

}
