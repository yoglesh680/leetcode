package leetCodeMedium;

public class Problem744 {
	public static char nextGreatestLetter(char[] letters, char target) {
		int num = 0;
		int high = letters.length;
		while (num < high) {
			int mid = num + (high - num) / 2;
			if (letters[mid] <= target) {
				num = mid + 1;
			} else {
				high = mid;
			}
		}
		return num == letters.length ? letters[0] : letters[num];
	}

	public static void main(String[] args) {
		char[] letters = { 'c', 'f', 'j' };
		char target = 'a';
		char ch = nextGreatestLetter(letters, target);
		System.out.println(ch);
	}
}
