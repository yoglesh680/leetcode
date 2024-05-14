package starPattern;

public class NumberPatter2 {
	public static void main(String[] args) {
		int i, j, num;
		for (i = 0; i < 5; i++) {
			num = 1;
			for (int k = 4; k >= i; k--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num++;

			}
			System.out.println();
		}

	}
}
