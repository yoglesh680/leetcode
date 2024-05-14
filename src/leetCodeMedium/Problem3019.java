package leetCodeMedium;

public class Problem3019 {
	public static int countKeyChanges(String s) {
		int count = 0;
		String l = s.toLowerCase();
		for (int i = 0; i < l.length() - 1; i++) {
			if (l.charAt(i) != l.charAt(i + 1)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String s = "aAbBcC";// output:2;
		int num = countKeyChanges(s);
		System.out.println(num);

	}

}
