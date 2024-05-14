package leetCode;

public class Problem2660 {
	public static int isWinner(int[] player1, int[] player2) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < player1.length; i++) {
			sum1 = sum1 + player1[i];
		}
		for (int i = 0; i < player2.length; i++) {
			sum2 = sum2 + player2[i];
		}
		if (sum1 > sum2) {
			return 1;

		} else if (sum1 < sum2) {
			return 2;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		int[] player1 = { 5,6,1,10};
		int[] player2 = {5,1,10,5 };
		int result = isWinner(player1, player2);
		System.out.println(result);
	}

}
