package practice;

public class Anagram {

	public static boolean isAnagram(String s, String t) {
		int m = s.length();
		int n = t.length();
		if (m != n) {
			return false;
		} else {
			int[] count = new int[26];
			for (int i = 0; i < m; i++) {
				count[s.charAt(i) - 'a']++;

			}
			for (int i = 0; i < n; i++) {
				count[t.charAt(i) - 'a']--;
			}
			for (int i = 0; i < count.length; i++) {
				if (count[i] != 0) {
					return false;
				}
			}

		}
		return true;
	}

	public static void main(String[] args) {
		String str = "anagra";
		String str1 = "nagaram";

		boolean flag = isAnagram(str, str1);
		System.out.println(flag);

//		char[] ch = str.toCharArray();
//		char[] ch1 = str1.toCharArray();
//        int count=0;
//		Arrays.sort(ch);
//		Arrays.sort(ch1);
//	
//		for(int i=0;i<str.length();i++) {
//			 for(int j=0;i<str1.length();j++) {
//				 if(str.charAt(i)==str.charAt(j)) {
//					 count++;
//				 }
//			 }
//			
//		}
//		if(str.length())
//
////		if (str.equalsIgnoreCase(str1)) {
////			System.out.println("true");
////		} else {
////			System.out.println("false");
////		}
	}

}
