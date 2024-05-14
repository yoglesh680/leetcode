package practice;

public class UpaarLower {

	public static void main(String[] args) {
		int uppar = 0, lower = 0;
		String str = "HeLLO Worlff";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println(" ");
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (ch >= 'A' && ch <= 'Z') {
//				uppar++;
//			} else
//				lower++;
//		}
//		System.out.println(lower);
//		System.out.println(uppar);
	//	System.out.println(str.toLowerCase());
	}

}
