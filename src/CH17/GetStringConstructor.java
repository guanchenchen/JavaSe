package CH17;

import java.lang.reflect.Constructor;

class Students {
	public Students(String str) {
		System.out.println("构造方法Students:    " + str);
	}
}

public class GetStringConstructor {
	public static void main(String[] args) {
		try {
			Class<?> str = Class.forName("java.lang.String");
			System.out.println(str.getName());
			Constructor[] conn = str.getConstructors();
			for (int i = 0; i < conn.length; i++) {
				System.out.println(conn[i]);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
