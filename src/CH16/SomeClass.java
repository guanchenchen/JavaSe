package CH16;

public class SomeClass {
	public static void main(String[] args) {
		SomeClass sc = new SomeClass();
		Class c = sc.getClass();
		ClassLoader load = c.getClassLoader();
		System.out.println(load);
		System.out.println(load.getParent());
		System.out.println(load.getParent().getParent());
	}

}
