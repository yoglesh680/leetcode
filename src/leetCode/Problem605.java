package leetCode;

public class Problem605 {
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {

		int count = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
					&& (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
				flowerbed[i] = 1;
				count++;
				i++;
			}
		}
		return count >= n;
	}

	public static void main(String[] args) {
		int[] nums= {1,0,0,0,1};
        boolean flag=canPlaceFlowers(nums, 2);
        System.out.println(flag);
	}
}
