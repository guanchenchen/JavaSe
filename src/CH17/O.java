package CH17;

import java.lang.reflect.Field;

interface Peoples {
	public static final String age = "男";
}

class Person {
	private String name;
}

class Studentss extends Person implements Peoples {
	private String school;
}

public class O {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> cls = Class.forName("CH17.Peoples");
		System.out.println("================本类属性==================");
		Field[] declaredFields = cls.getDeclaredFields();
		for (int i = 0; i < declaredFields.length; i++) {
			System.out.println(declaredFields[i]);
		}

		System.out.println("================接口属性==================");
		Field[] df = cls.getFields();
		for (int i = 0; i < df.length; i++) {
			System.out.println(df[i]);
		}

		// 获得父类的属性
		System.out.println("================父类属性==================");
		// 在这是已经得到父类的对象，所以再调用本类的属性方法时是在调父类中的属性
		Field[] ff = cls.getSuperclass().getDeclaredFields();
		for (int i = 0; i < ff.length; i++) {
			System.out.println(ff[i]);
		}

	}

}
