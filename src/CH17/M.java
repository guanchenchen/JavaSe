package CH17;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Tests {
	private String school;
	private int age;

	public void show() {
		System.out.println("我是一个人");
	}

	public void display(String nation, Integer i) {
		System.out.println("我是一个人" + nation + "age:" + i);
	}
}

public class M {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		Class<?> cls = Class.forName("CH17.Tests");
		Object student = cls.getDeclaredConstructor().newInstance();
		Field school = cls.getDeclaredField("school");
		school.setAccessible(true);
		school.set(student, "河北软件");
		Object object = school.get(student);
		System.out.println(object);

		Field age = cls.getDeclaredField("age");
		age.setAccessible(true);
		age.set(student, 100);
		Object object1 = age.get(student);
		System.out.println(object1);

		Method m = cls.getDeclaredMethod("show");
		m.invoke(student);

		Method m1 = cls.getDeclaredMethod("display", String.class, Integer.class);
		m1.setAccessible(true);
		Object obj = m1.invoke(student, "CHN", 10);
		System.out.println(obj);

	}

}
