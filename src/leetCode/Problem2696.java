package leetCode;

public class Problem2696 {
	public static int minLength(String s) {
		StringBuilder sb = new StringBuilder(s);
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < sb.length()-1; i++) {
				if (sb.charAt(i) == 'A' && sb.charAt(i + 1) == 'B') {
					sb.delete(i, i + 2);
					flag = true;
					break;
				} else if (sb.charAt(i) == 'C' && sb.charAt(i + 1) == 'D') {
					sb.delete(i, i + 2);
					flag = true;
					break;
				}
			}
		}
		return sb.length();

	}

	public static void main(String[] args) {
		String s = "ABFCACDB";
		int n = minLength(s);
		System.out.println(n);
	}

}
//Input: s = "ABFCACDB"
//Output: 2