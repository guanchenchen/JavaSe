package CH16;

public class ForNameDemoV2 {
	public static void main(String[] args) {
		try {
			System.out.println("�d��TestClass2");
			Class c = Class.forName("CH16.TestClass2", false, Thread.currentThread().getContextClassLoader());

			System.out.println("ʹ��TestClass2���慢�����Q");
			TestClass2 test = null;

			System.out.println("ʹ��TestClass2�������");
			test = new TestClass2();
		} catch (ClassNotFoundException e) {
			System.out.println("�Ҳ���ָ����e");
		}
	}
}
