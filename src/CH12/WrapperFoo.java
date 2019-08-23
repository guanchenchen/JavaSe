package CH12;

public class WrapperFoo<T> {
	private GenericFoo<T> foo;

	public GenericFoo<T> getFoo() {
		return foo;
	}

	public void setFoo(GenericFoo<T> foo) {
		this.foo = foo;
	}

}
