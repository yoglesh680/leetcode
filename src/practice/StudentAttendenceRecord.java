package practice;

public class StudentAttendenceRecord {
	public static boolean checkRecord(String s) {
		int a = 0, l = 0;
		for (char student : s.toCharArray()) {
			if (student == 'A') {
				a++;
			} else if (student == 'L') {
				l++;
			} else {
				l = 0;
			}
			if (a >= 2 || l >= 3) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "PPALLP";
		boolean flag = checkRecord(str);
		System.out.println(flag);
	}

}
