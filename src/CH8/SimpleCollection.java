package CH8;

public class SimpleCollection {
	private Object[] objArr;
	private int index = 0;

	public SimpleCollection() {
		// TODO Auto-generated constructor stub
		objArr = new Object[10];
	}

	public SimpleCollection(int capacity) {
		objArr = new Object[capacity];
	}

	public void add(Object obj) {
		objArr[index] = obj;
		index++;

	}

	public int getLength() {
		return index;
	}

	public Object get(int i) {
		return objArr[i];
	}
}
