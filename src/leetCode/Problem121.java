package leetCode;

public class Problem121 {
	public static int maxProfit(int[] prices) {
		int maxPrice = 0;
		int minPrice = Integer.MAX_VALUE;
		for (int i : prices) {
			minPrice = Math.min(minPrice, i);
			maxPrice = Math.max(maxPrice, i-minPrice);
		}
		return maxPrice;

	}

	public static void main(String[] args) {
		int[] prices1 = { 7, 1, 5, 3, 6, 4 };
		int result = maxProfit(prices1);
		System.out.println(result);
	}
}
