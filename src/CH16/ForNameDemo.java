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
		System.out.println("e���Q��" + c.getName());
		System.out.println("�Ƿ����棺" + c.isInterface());
		System.out.println("�Ƿ������͑B��" + c.isPrimitive());
		System.out.println("�Ƿ����У�" + c.isArray());
		System.out.println("��e��" + c.getSuperclass().getName());
	}
}
