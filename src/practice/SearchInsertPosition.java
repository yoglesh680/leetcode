package practice;

public class SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]>=target){
               return i;
            }
        }
        return nums.length;
    }
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target=5;
		int value=searchInsert(nums, target);
		System.out.println(value);
	}
}
