package practice;

public class ValidParanthesis {
	public static boolean isValid(String s) {
		if (s.equals("()")) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String s = "(";
		boolean b = isValid(s);
		System.out.println(b);
		
		char[] st=s.toCharArray();
	}
}
