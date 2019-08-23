package CH12;

public class StringGenericFoo<T extends String> {
	private T[] fooArray;

	public T[] getFooArray() {
		return fooArray;
	}

	public void setFooArray(T[] fooArray) {
		this.fooArray = fooArray;
	}

}
