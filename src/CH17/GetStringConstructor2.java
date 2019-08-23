package CH17;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Stud {
	public Stud(String str) {
		System.out.println("构造方法Students:    " + str);
	}
}

public class GetStringConstructor2 {
	public static void main(String[] args) {
		try {
			Class<?> forName = Class.forName("CH17.Stud");
			try {
				Constructor<?> constructors = forName.getConstructor(String.class);
				try {
					constructors.newInstance("纯菜鸟-java-反射");
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

}
