package leetCodeMedium;

public class Problem860 {
	public static boolean lemonadeChange(int[] bills) {
		int five = 0;
		int ten = 0;
		for (int bill : bills) {
			if (bill == 5) {
				five++;
			} else if (bill == 10) {
				if (five == 0) {
					return false;
				}
				five--;
				ten++;
			} else if (bill == 20) {
				if (ten > 0 && five > 0) {
					ten--;
					five--;
				} else if (five >= 3) {
					five -= 3;
				} else {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 5, 10, 10, 20 }; // output false
		boolean flag = lemonadeChange(nums);
		System.out.println(flag);
	}
}
