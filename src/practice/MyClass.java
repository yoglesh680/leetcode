package practice;

public class MyClass {

	public static void main(String[] args) {
		String str = "My Name Is Yoglesh";
		String str1 = "";
		StringBuilder sb = new StringBuilder();
		String[] st = str.split(" ");
		for (int i = st.length - 1; i >= 0; i--) {
			String value = st[i];
			str1 += value;
			str1+=" ";

		}
//	for(int i=st.length-1;i>=0;i--) {
//		String value=st[i];
//		sb.append(value);
//		sb.append(" ");
//		
//	}

		System.out.println(str1);

	}
}
