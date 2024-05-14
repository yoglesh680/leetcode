package practice;

class Signleton {
	public static Signleton signleton = null;

	private Signleton() {
		System.out.println("Signletonmethod");
	}

	public static Signleton getInstance() {
		if (signleton == null) {
			signleton = new Signleton();
		}
		return signleton;

	}
}

public class A {
	public final static  void  main(String args[]) {
		Signleton signleton = Signleton.getInstance();
		System.out.println(signleton.hashCode());
		Signleton signleton1 = Signleton.getInstance();
		System.out.println(signleton1.hashCode());
	}
}
//class Signleton {
//	private static Signleton signleton = null;
//	String s;
//
//	private Signleton() {
//		s = "hello0";
//
//	}
//
//	public static Signleton getInstance() {
//		if (signleton == null) {
//			signleton = new Signleton();
//		}
//		return signleton;
//	}
//}
//
//class A {
//	public static void main(String args[]) {
//		Signleton x = Signleton.getInstance();
//		Signleton x1 = Signleton.getInstance();
//		System.out.println(x.hashCode());
//		System.out.println(x1.hashCode());
//	}
//}