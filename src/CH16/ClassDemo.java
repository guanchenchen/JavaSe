package CH16;

public class ClassDemo {
	public static void main(String[] args) {
		String name = "caterpillar";
		System.out.println(name.getClass().getName());
		System.out.println(name.getClass().isInterface());
		System.out.println(name.getClass().isArray());
		System.out.println(name.getClass().isPrimitive());
		System.out.println(name.getClass().getSuperclass());

	}

}
