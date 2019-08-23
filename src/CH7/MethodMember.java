package CH7;

public class MethodMember {
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		md.scoreDemo();
		System.out.println(md.getData());

		md.setData(199);
		System.out.println(md.getData());
	}

}

class MethodDemo {
	private int data = 10;

	public void scoreDemo() {
		data = 100;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
