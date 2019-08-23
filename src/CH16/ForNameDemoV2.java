package CH16;

public class ForNameDemoV2 {
	public static void main(String[] args) {
		try {
			System.out.println("載入TestClass2");
			Class c = Class.forName("CH16.TestClass2", false, Thread.currentThread().getContextClassLoader());

			System.out.println("使用TestClass2宣告參考名稱");
			TestClass2 test = null;

			System.out.println("使用TestClass2建立物件");
			test = new TestClass2();
		} catch (ClassNotFoundException e) {
			System.out.println("找不到指定的類別");
		}
	}
}
