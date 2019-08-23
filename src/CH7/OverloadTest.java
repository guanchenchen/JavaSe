package CH7;

public class OverloadTest {
	public static void main(String[] args) {
		someMethod(1);
	}

	public static void someMethod(int i) {
		System.out.println("int 唳掛掩網請");
	}

	public static void someMethod1(Integer integer) {
		System.out.println("Integer 唳掛掩網請");
	}

}
