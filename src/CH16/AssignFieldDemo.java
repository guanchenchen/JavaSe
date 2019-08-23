package CH16;

import java.lang.reflect.Field;

public class AssignFieldDemo {

	private int testInt;

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		try {
			Class c = Class.forName("CH16.AssignFieldDemo");
			Object targetObj = c.newInstance();

			Field testInt = c.getField("testInt");
			testInt.setInt(targetObj, 99);

			Field testString = c.getField("testString");
			testString.set(targetObj, "caterpillar");
			System.out.println(targetObj);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
