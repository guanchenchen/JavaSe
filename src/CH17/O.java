package CH17;

import java.lang.reflect.Field;

interface Peoples {
	public static final String age = "��";
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
		System.out.println("================��������==================");
		Field[] declaredFields = cls.getDeclaredFields();
		for (int i = 0; i < declaredFields.length; i++) {
			System.out.println(declaredFields[i]);
		}

		System.out.println("================�ӿ�����==================");
		Field[] df = cls.getFields();
		for (int i = 0; i < df.length; i++) {
			System.out.println(df[i]);
		}

		// ��ø��������
		System.out.println("================��������==================");
		// �������Ѿ��õ�����Ķ��������ٵ��ñ�������Է���ʱ���ڵ������е�����
		Field[] ff = cls.getSuperclass().getDeclaredFields();
		for (int i = 0; i < ff.length; i++) {
			System.out.println(ff[i]);
		}

	}

}
