package leetCodeMedium;

public class Problem383 {
	  public static boolean canConstruct(String ransomNote, String magazine) {
		 if(ransomNote.length()>magazine.length()) {
			 return false;
		 }
		 int[] nums=new int[26];
		 for(char c:magazine.toCharArray()) {
			 nums[c-'a']++;
		 }
		 for(char c:ransomNote.toCharArray()) {
			 if(nums[c-'a']==0) {
				 return false;
			 }
			 nums[c-'a']--;
		 }
		return true;
	        
	    }
	public static void main(String[] args) {
		String s1="aa";
		String s2="aab";
		System.out.println(canConstruct(s1, s2));
		
	}

}
