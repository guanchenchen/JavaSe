package CH8;

public class SimpleCollectionDemo {
	public static void main(String[] args) {
		SimpleCollection sc = new SimpleCollection();
		sc.add(new Foo1("һ̖Foo1"));
		sc.add(new Foo2("һ̖Foo2"));
		Foo1 f = (Foo1) sc.get(0);
		f.showName();
		Foo2 f2 = (Foo2) sc.get(1);
		f2.showName();

	}

}
