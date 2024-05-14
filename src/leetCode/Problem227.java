package leetCode;

public class Problem227 {
	public static int calculate(String s) {
         int sum=0;
		int product = 1;
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
		
			if (c == '+') {
				product =sum+c;
			} else if (c == '*') {
				product *= c;
			}

		}
		return product;

	}

	public static void main(String[] args) {
		String str = "3+2*2";//7
		int value = calculate(str);
		System.out.println(value);
	}

}
