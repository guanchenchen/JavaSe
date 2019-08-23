package CH16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Person {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

}

class SuperMan extends Person {
	private boolean BlueBriefs;

	public boolean isBlueBriefs() {
		return BlueBriefs;
	}

	public void setBlueBriefs(boolean blueBriefs) {
		BlueBriefs = blueBriefs;
	}

	public void fly() {
		System.out.println("fly method....");
	}

	public void walk(int m) {
		System.out.println("fly in " + m + " m");
	}

	interface ActionInterface {
		public void walk(int m);
	}

}

public class TestRefl {
	public static void main(String[] args) {
		Demo1();
		System.out.println("===============================================");

		Demo2();
		System.out.println("===============================================");

		Demo3();
		System.out.println("===============================================");

		Demo4();
		System.out.println("===============================================");

		Demo5();
		System.out.println("===============================================");

		Demo6();
		System.out.println("===============================================");

		Demo7();
		System.out.println("===============================================");

		Demo8();
		System.out.println("===============================================");

	}

	private static void Demo8() {
		// TODO Auto-generated method stub
		Class<?> class1 = null;
		try {
			class1 = Class.forName("CH16.SuperMan");
			String nameString = class1.getClassLoader().getClass().getName();
			System.out.println("Demo8: 类加载器类名: " + nameString);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void Demo7() {
		// TODO Auto-generated method stub
		Class<?> class1 = null;
		try {
			class1 = Class.forName("CH16.SuperMan");
			System.out.println("Demo7: ========================================");
			try {
				Method method = class1.getMethod("fly");
				try {
					method.invoke(class1.newInstance());
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("调用有参方法walk(int m)");
				method = class1.getMethod("walk", int.class);
				try {
					method.invoke(class1.newInstance(), 100);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
						| InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (NoSuchMethodException e) {
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

	private static void Demo6() {
		// TODO Auto-generated method stub
		Class<?> class1 = null;
		try {
			class1 = Class.forName("CH16.SuperMan");
			Class<?> superClass = class1.getSuperclass();
			System.out.println("===============================================");
			Field[] fields = class1.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				System.out.println("类中的成员: " + fields[i]);
			}

			Method[] methods = class1.getDeclaredMethods();
			System.err.println("methods的长度:" + methods.length);
			for (int i = 0; i < methods.length; i++) {
				System.out.println("类中的方法: " + methods[i]);
				System.out.println("函数名：" + methods[i].getName());
				System.out.println("函数返回类型：" + methods[i].getReturnType());
				System.out.println("函数访问修饰符：" + Modifier.toString(methods[i].getModifiers()));
				System.out.println("函数代码写法： " + methods[i]);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void Demo5() {
		// TODO Auto-generated method stub
		Class<?> class1 = null;
		try {
			class1 = Class.forName("CH16.Person");
			try {
				Object obj = class1.newInstance();
				try {
					Field f = class1.getDeclaredField("name");
					f.setAccessible(true);
					f.set(obj, "HONGHENG");
					System.out.println(f.get(obj));
				} catch (NoSuchFieldException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void Demo4() {
		// TODO Auto-generated method stub
		Class<?> class1 = null;
		Person person1 = null;
		Person person2 = null;
		try {
			class1 = Class.forName("CH16.Person");
			Constructor<?>[] con = class1.getConstructors();
			try {
				person1 = (Person) con[0].newInstance(20, "Hongten");
				System.out.println(person1.getAge() + ";" + person1.getName());
				person2 = (Person) con[1].newInstance();
				person2.setAge(100);
				person2.setName("haha");
				System.out.println(person2.getAge() + ";" + person2.getName());

			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void Demo3() {
		// TODO Auto-generated method stub
		Class<?> class1 = null;
		try {
			class1 = Class.forName("CH16.Person");
			try {
				Person person = (Person) class1.newInstance();
				person.setAge(20);
				person.setName("mark");
				System.out.println(person.getName() + " : " + person.getAge());
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void Demo2() {
		// TODO Auto-generated method stub
		Class<?> class1 = null;
		Class<?> class2 = null;
		try {
			class1 = Class.forName("CH16.Person");
			System.out.println("包名:" + class1.getPackage().getName());
			System.out.println("类名:" + class1.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		class2 = Person.class;
		System.out.println("包名:" + class2.getPackage().getName());
		System.out.println("类名:" + class2.getName());

	}

	private static void Demo1() {
		// TODO Auto-generated method stub
		Person person = new Person();
		System.out.println("类名:" + person.getClass().getName());
		System.out.println("包名:" + person.getClass().getPackage().getName());

	}

}
