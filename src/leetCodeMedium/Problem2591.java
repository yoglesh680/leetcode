package leetCodeMedium;

public class Problem2591 {
	public static int distMoney(int money, int children) {
		int maxChildrenWithEight = 0;
		if (money % children == 0) {
			return children;
		}
		for (int i = 1; i <= children; i++) {
			int remainingMoney = money - i;
			if (remainingMoney <= 0) {
				break;
			}
			if (remainingMoney % 8 == 0) {
				maxChildrenWithEight = Math.max(maxChildrenWithEight, i);
			}
		}
		return maxChildrenWithEight > 0 ? maxChildrenWithEight : -1;

	}

	public static void main(String[] args) {
		int money = 20;
		int childer = 3;
		int result = distMoney(money, childer);
		System.out.println(result);
	}
}
