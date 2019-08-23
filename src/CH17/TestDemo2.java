package CH17;

class Teacher {
	void message() {
		System.out.println("Hello Java");
	}
}

public class TestDemo2 {
	public static void main(String args[]) {
		try {
			Class<?> c = Class.forName("CH17.Teacher");
			Teacher s = (Teacher) c.newInstance();
			s.message();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}