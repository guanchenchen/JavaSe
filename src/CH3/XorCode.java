package CH3;

public class XorCode {
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println("���aǰ��" + ch);

		ch = (char) (ch ^ 7);
		System.out.println("���a�᣺" + ch);

		ch = (char) (ch ^ 7);
		System.out.println("��a��" + ch);
	}
}
