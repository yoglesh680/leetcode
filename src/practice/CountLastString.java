package practice;

public class CountLastString {
	public static int lengthOfLastWord(String s) {
		int length = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ' && length == 0) {
				continue;
			}
			if (s.charAt(i) != ' ') {
				length++;
			} else {
				break;
			}
		}
		return length;
	}
	public static void main(String[] args) {
      String str="   fly me   to   the moon  ";
      int flag=lengthOfLastWord(str);
      System.out.println(flag);
	}

}
