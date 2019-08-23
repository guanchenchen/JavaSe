package CH12;

import java.util.List;

public class ListGenericFoo<T extends List> {
	private T[] fooArray;

	public T[] getFooArray() {
		return fooArray;
	}

	public void setFooArray(T[] fooArray) {
		this.fooArray = fooArray;
	}
}
