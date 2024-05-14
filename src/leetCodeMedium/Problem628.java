package leetCodeMedium;

public class Problem628 {
	public static double findMaxAverage(int[] nums, int k) {
		double sum = 0;
		double val=nums[0];
		if(nums.length==1) {
			return  val;
		}
		for(int i=0;i<k;i++) {
			sum+=nums[i];
		}
		System.out.println(sum);
		double value = sum/k;
		return value;
	}

	public static void main(String[] args) {
		int[] nums = {1,12,-5,-6,50,3 };
		double num = findMaxAverage(nums, 4);
		System.out.println(num);

	}

}
