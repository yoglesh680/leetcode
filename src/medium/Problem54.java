package medium;

import java.util.ArrayList;
import java.util.List;

public class Problem54 {
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();

		int row = matrix.length;
		int col = matrix[0].length;
		int top = 0;
		int left = 0;
		int bottom = row - 1;
		int right = col - 1;
		while (top <= bottom && left <= right) {
			// Traverse from left to right
			for (int i = left; i <= right; i++) {
				result.add(matrix[top][i]);
			}
			top++;

			// Traverse from top to bottom
			for (int i = top; i <= bottom; i++) {
				result.add(matrix[i][right]);
			}
			right--;

			// Traverse from right to left
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					result.add(matrix[bottom][i]);
				}
				bottom--;
			}

			// Traverse from bottom to top
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					result.add(matrix[i][left]);
				}
				left++;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		System.out.println("hhhhhhhhhhhhhhhhhh");
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List<Integer> list = new ArrayList<Integer>();
		list = spiralOrder(matrix);
		System.out.println(list);

	}

}
