package practice;

public class Problem58 {
	public static int lengthOfLastWord(String s) {

		int len = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ' && len == 0) {
				continue;
			}
			if (s.charAt(i) != ' ') {
				len++;
			} else {
				break;
			}
		}
		return len;
	}

	public static void main(String[] args) {
		String str = "Hello World";
		int num = lengthOfLastWord(str);
		System.out.println(num);
	}

}
