package practice;

import java.util.Scanner;

public class NewClass {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String A = sc.next();
		String A="roshni";		
         boolean palindrome = true;
        
        for(int i = 0; i<A.length()/2;i++)
        {
        	if(!A.substring(i+1).equals(A.substring(A.length()-i-1,A.length()-i)))
            {
                palindrome = false;
            }
        }
        if(palindrome)
        {
            System.out.println("Yes");
            }
        else
        {
            System.out.println("No");
            }
       
		//sc.close();

//		String str1 = "cat";
//		String str2 = "atc";
//		str1 = str1.toLowerCase();
//		str2 = str2.toLowerCase();
//		if (str1.length() == str2.length()) {
//			char[] charArray1 = str1.toCharArray();
//			char[] charArray2 = str2.toCharArray();
//			Arrays.sort(charArray1);
//			Arrays.sort(charArray2);
//			boolean result = Arrays.equals(charArray1, charArray2);
//			if (result) {
//				System.out.println("true");
//			} else {
//				System.out.println("false");
//			}
//		} else {
//			System.out.println("false");
//		}
	}
}