package CH16;

public class ForNameDemoV1 {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("�d��TestClass2");
		Class c = Class.forName("CH16.TestClass2");

		System.out.println("ʹ��TestClass2���慢�����Q");
		TestClass2 test = null;

		System.out.println("ʹ��TestClass2�������");
		test = new TestClass2();
	}

}
