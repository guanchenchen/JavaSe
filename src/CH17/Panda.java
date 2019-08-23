package CH17;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;

class Annimal {
	public int foot;
	public String addr;

	public void breath() throws Exception {

	}

}

interface run {
	void go();
}

public class Panda extends Annimal implements run {
	public int age;
	private String name;

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface MyClassAnnotation {
		String uri();

		String desc();
	}

	@Deprecated
	@SuppressWarnings("unchecked")
	public void showSomething() {
		System.out.println("do something...");
	}

	@Override
	public String toString() {
		return "Panda [age=" + age + ", name=" + name + "]";
	}

	public Panda() {
		// TODO Auto-generated constructor stub
	}

	public Panda(int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("gogogogogoggogoog");
	}

	public void breath() {
		System.out.println("新鲜的空气");
	}

	public @interface AnnotationTest {
		String value()

		default "holle";

		String value2();

	}

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("CH17.Panda");
			try {
				Field f = clazz.getField("age");
				System.out.println(f + ":f");
				Field[] f1 = clazz.getFields();
				for (int i = 0; i < f1.length; i++) {
					System.out.println(f1[i].getName() + ":f1:" + Modifier.toString(f1[i].getModifiers()));
				}

				Field[] f2 = clazz.getDeclaredFields();
				for (int i = 0; i < f2.length; i++) {
					System.out.println(f2[i].getName() + ":f2");
				}

				Method[] m = clazz.getMethods();
				for (int i = 0; i < m.length; i++) {
					System.out.println(m[i].getName() + ":m" + Modifier.toString(m[i].getModifiers()));
				}

				Method[] m1 = clazz.getDeclaredMethods();
				for (int i = 0; i < m1.length; i++) {
					System.out.println(Modifier.toString(m1[i].getModifiers()) + ":m1");
					Class<?>[] exceptionTypes = m1[i].getExceptionTypes();
					if (exceptionTypes.length > 0) {
						System.out.print(" throws ");
					}
					for (int j = 0; j < exceptionTypes.length; j++) {

						System.out.print(exceptionTypes[j].getSimpleName() + " throws ");

					}

					int num = clazz.getModifiers();
					System.out.println(Modifier.toString(num));

					Constructor[] conn = clazz.getConstructors();
					for (int mm = 0; mm < conn.length; mm++) {
						System.out.println(conn[mm].getName() + ":conn");
					}

					Annotation[] ann = clazz.getAnnotations();
					System.out.println("getAnnotations:" + ann.length);

					Class[] interfaces = clazz.getInterfaces();
					System.out.println("getInterfaces:" + interfaces.length);

					Package p = clazz.getPackage();// 获取包
					System.out.println("getPackage：" + p);

					Class superClass = clazz.getSuperclass();// 获取父类
					System.out.println("getSuperclass：" + superClass);

					String str = clazz.getTypeName();
					System.out.println(str + ":Type");

					TypeVariable[] type = clazz.getTypeParameters();
					for (TypeVariable tv : type) {
						System.out.println(tv + ":typeStyle");
					}
				}

			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
