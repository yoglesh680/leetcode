package starPattern;

public class NumberPattern4 {
	public static void main(String[] args) {

		int i, j, k, num;
		for (i = 0; i <=5; i++) {
			num = 5;
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) {
			
				System.out.print(+ num);
				num--;
			}
			System.out.println();
		}
	}

}
//for (int i = 0; i < n; i++) {
//
//	for (int j = 4; j >= i; j--) {
//		System.out.print(" ");
//
//	}
//	for (int k = 0; k <= i; k++) {
//		System.out.print(" *");
//	}
//
//	System.out.println();
//}
