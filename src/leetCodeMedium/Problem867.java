package leetCodeMedium;

public class Problem867 {
	public static int[][] transpose(int[][] matrix) {
		int[][] resultMatrix = new int[matrix.length][matrix.length];
		return matrix;
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };// Output: [[1,4,7],[2,5,8],[3,6,9]]
		int[][] newMetrix = transpose(matrix);
		System.out.println(newMetrix);
	}
}
