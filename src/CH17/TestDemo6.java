package CH17;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Swimmer {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class TestDemo6 {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		Class<?> cls = Class.forName("CH17.Swimmer");
		Object object = cls.getDeclaredConstructor().newInstance();
		Method method = cls.getMethod("setName", String.class);
		Method method2 = cls.getMethod("getName");
		method.invoke(object, "纯菜鸟");// setName方法赋值
		Object invoke2 = method2.invoke(object);// 调用getName
		System.out.println(invoke2);

	}

}
