package medium;

public class Problem79 {
	public static boolean exist(char[][] board, String word) {
		char[] ch = word.toCharArray();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0) && exists(board, ch, i, j, 0)) {
					return true;
				}
			}
		}
		return false;

	}

	private static boolean exists(char[][] board, char[] ch, int i, int j, int k) {
		if (k == ch.length - 1) {
			return true;
		}
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != ch[k]) {
			return false;
		}
		char c = board[i][j];
		board[i][j] = '*';
		boolean result = exists(board, ch, i + 1, j, k+1) || exists(board, ch, i - 1, j, k+1)
				|| exists(board, ch, i, j + 1, k+1) || exists(board, ch, i, j - 1, k+1);
		board[i][j] = c;
		return result;

	}

	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCB";
		boolean flag = exist(board, word);
		System.out.println(flag);
	}
}
