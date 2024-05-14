package practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Singleton {
	public static Singleton singleton = new Singleton();

	private Singleton() {

	}
}

public class B {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton instance1 = Singleton.singleton;
		Singleton instance2 = null;
		@SuppressWarnings("rawtypes")
		Constructor[] constructors = Singleton.class.getDeclaredConstructors();
		for (@SuppressWarnings("rawtypes")
		Constructor constructor : constructors) {
			constructor.setAccessible(true);
			instance2 = (Singleton) constructor.newInstance();

			break;
		}

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}
