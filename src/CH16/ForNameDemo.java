package CH16;

public class ForNameDemo {
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("CH16.ForNameDemo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("類別名稱：" + c.getName());
		System.out.println("是否為介面：" + c.isInterface());
		System.out.println("是否為基本型態：" + c.isPrimitive());
		System.out.println("是否為陣列：" + c.isArray());
		System.out.println("父類別：" + c.getSuperclass().getName());
	}
}
