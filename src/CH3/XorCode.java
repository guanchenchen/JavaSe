package CH3;

public class XorCode {
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println("¾Ž´aÇ°£º" + ch);

		ch = (char) (ch ^ 7);
		System.out.println("¾Ž´aáá£º" + ch);

		ch = (char) (ch ^ 7);
		System.out.println("½â´a£º" + ch);
	}
}
