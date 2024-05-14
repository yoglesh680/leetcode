package leetCodeMedium;

public class Problem415 {
	public static String addStrings(String num1, String num2) {
		String re = "";
		int num = Integer.parseInt(num1);
		int numB = Integer.parseInt(num2);
		int result = num + numB;
		re = String.valueOf(result);
		return re;

	}

	public static void main(String[] args) {
		String s = "11";
		String s2 = "123";
		String data = addStrings(s, s2);
		System.out.println(data);
	}

}
