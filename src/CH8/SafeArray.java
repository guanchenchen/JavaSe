package CH8;

public class SafeArray extends SimpleArray {

	public SafeArray(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	public void setElement(int i, int data) {
		if (i < array.length)
			super.setElement(i, data);
	}

}
