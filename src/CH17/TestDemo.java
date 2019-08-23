package CH17;

class Tea {
}

interface My {
}

public class TestDemo {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("CH17.Tea");
			System.out.println(clazz.isInterface());
			System.err.println(clazz.isArray());
			System.out.println(clazz.isPrimitive());

			Class<?> clazz1 = Class.forName("CH17.My");
			System.out.println(clazz1.isInterface());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
