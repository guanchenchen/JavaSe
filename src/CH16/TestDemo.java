package CH16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestDemo {
	public static void main(String[] args) {
		try {
			Class cs = Class.forName("CH16.Student");
			Field[] ff = cs.getFields();
			Method[] m = cs.getMethods();
			Constructor[] con = cs.getConstructors();

			for (Field f1 : ff) {
				System.out.println(f1);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
