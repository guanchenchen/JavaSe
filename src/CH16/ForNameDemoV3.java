package CH16;

public class ForNameDemoV3 {
	public static void main(String[] args) {
		try {
			System.out.println("�d��TestClass2");
			ClassLoader loader = ForNameDemoV3.class.getClassLoader();
			Class c = loader.loadClass("CH16.TestClass2");

			System.out.println("ʹ��TestClass2���慢�����Q");
			TestClass2 test = null;

			System.out.println("ʹ��TestClass2�������");
			test = new TestClass2();
		} catch (ClassNotFoundException e) {
			System.out.println("�Ҳ���ָ����e");
		}
	}
}
