package CH17;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class A {
	private void cube(int n) {
		System.out.println(n * n * n);
	}
}

public class TestDemo4 {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<A> c = A.class;
		Object obj = c.newInstance();
		try {
			Method m = c.getDeclaredMethod("cube", new Class[] { int.class });
			m.setAccessible(true);
			m.invoke(obj, 12);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
