package CH16;

public class ClassInfoDemo {
	public static void main(String[] args) {
		try {
			Class demo = Class.forName("CH16.ClassInfoDemo");
			Package pkg = demo.getPackage();
			System.out.println(pkg.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
