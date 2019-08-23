package CH3;

public class BreakTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 9) {
				System.out.println("break");
				break;
			}
		}
		System.out.println("test");
	}

}
