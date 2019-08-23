package CH17;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

class Cat {
	private String Cat(String name, Integer age) {
		return name + " " + age;
	}

	public final void tt() throws Exception {

	}
}

public class T {
	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName("CH17.Cat");
			Method[] methods = cls.getDeclaredMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i]);
				System.out.println(methods[i].getModifiers());
				System.out.println(Modifier.toString(methods[i].getModifiers()));

				System.out.println(" ?????? " + methods[i].getReturnType().getSimpleName());
				System.out.print("*********** " + methods[i].getName());

				Class<?>[] ExType = methods[i].getExceptionTypes();
				if (ExType.length > 0) {
					System.out.print(" throws ");
					for (int j = 0; j < ExType.length; j++) {
						System.out.print(ExType[j].getSimpleName());
						if (ExType.length - 1 > j) {
							System.out.print(",");
						}
					}
				}
				System.out.print("(");
				Parameter[] param = methods[i].getParameters();

				for (int j = 0; j < param.length; j++) {
					System.out.println(param[i].getType().getSimpleName() + "args" + j);
					if (j + 1 < param.length) {
						System.out.println(",");
					}
				}
				System.out.println(")");
				System.out.println("{}");

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
