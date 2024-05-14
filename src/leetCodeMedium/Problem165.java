package leetCodeMedium;

public class Problem165 {
	public static int compareVersion(String version1, String version2) {
		String[] s1 = version1.split("\\.");
		String[] s2 = version2.split("\\.");
		int i = 0, j = 0;
		while (i < s1.length || j < s2.length) {
			int num = i < s1.length ? Integer.parseInt(s1[i]) : 0;
			int num2 = j < s2.length ? Integer.parseInt(s2[i]) : 0;
			if (num < num2) {
				return -1;
			} else if (num > num2) {
				return 1;
			}
			i++;
			j++;
		}
		return 0;

	}

	public static void main(String[] args) {
		String str = "1.01";
		String str1 = "1.001";
		int result = compareVersion(str, str1);
		System.out.println(result);

	}

}
