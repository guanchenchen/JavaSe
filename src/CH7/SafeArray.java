package CH7;

public class SafeArray {
	private int[] arr;

	public SafeArray() {
		this(10); // �A�O 10 ��Ԫ��
	}

	public SafeArray(int length) {
		arr = new int[length];
	}

	public void showElement() {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public int getElement(int i) {
		if (i >= arr.length || i < 0) {
			System.err.println("�����e�`");
			return 0;
		}

		return arr[i];
	}

	public void setElement(int i, int data) {
		if (i >= arr.length || i < 0) {
			System.err.println("�����e�`");
			return;
		}

		arr[i] = data;
	}

	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}
}