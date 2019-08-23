package CH17;

class Simple {

}

public class Test {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("CH17.Simple");
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Simple si = new Simple();
		Class<? extends Object> cla = si.getClass();
		System.out.println(cla.getName());
		System.out.println(cla.getSimpleName());

		Class<?> caa = String.class;
		System.out.println(caa.getName());
		System.out.println(caa.getSimpleName());

		Class<?> class1 = Test.class;
		System.out.println(class1.getName());
		System.out.println(class1.getSimpleName());

		Class<Boolean> c = boolean.class;
		System.out.println(c.getName());

		ClassLoader cl = ClassLoader.getSystemClassLoader();
		ClassLoader par = cl.getParent();
		System.out.println(par);

		Class clazz1 = Simple.class;
		ClassLoader c2 = clazz1.getClassLoader();
		System.out.println(c2);
		System.out.println(c2.getParent());

	}

}
