package medium;

public class Problem166 {
	 public static  String fractionToDecimal(int numerator, int denominator) {
         long value = numerator/denominator;
         System.out.println(value);
	      String s=String.valueOf(value);
	       return s;
    }
	public static void main(String[] args) {
		int n=1;
		int d=2;
		String value=fractionToDecimal(n, d);
		System.out.println(value);
	}

}
