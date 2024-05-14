package starPattern;

public class Pattern10 {
	public static void main(String[] args) {
		int n = 5;

		for (int i = 0; i < n; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" *");
			}

			System.out.println();
		}
		for (int i = n; i >= 0; i--) {

			for (int j = 4; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" *");
			}

			System.out.println();
		}

	}
}
