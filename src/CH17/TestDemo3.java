package CH17;

import java.lang.reflect.Constructor;

class Dog {
	private String msg;

	void message() {
		System.out.println("Hello Java," + msg);
	}

	private Dog(String msg) {
		this.msg = msg;
	}

}

public class TestDemo3 {
	public static void main(String args[]) {
		try {
			Class<?> c = Class.forName("CH17.Dog");
			Constructor<?> con = c.getDeclaredConstructor(new Class[] { String.class });
			con.setAccessible(true);
			Dog dog = (Dog) con.newInstance("............");
			dog.message();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}