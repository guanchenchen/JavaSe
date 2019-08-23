package CH12;

public class GenericFooDemo {
	public static void main(String[] args) {
		GenericFoo<Boolean> foo1 = new GenericFoo<>();
		GenericFoo<Integer> foo2 = new GenericFoo<>();
		foo1.setFoo(new Boolean(true));
		Boolean b = foo1.getFoo();
		System.out.println(b);

		foo2.setFoo(new Integer(10));
		Integer i = foo2.getFoo();
		System.out.println(i);

	}
}
