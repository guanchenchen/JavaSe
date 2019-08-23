package CH9;

public class AnonymousClassDemo {
	public static void main(String[] args) {
		Object obj = new Object() {
			public String toString() {
				return "ÄäÃûî„eÎï¼ş";
			}
		};
		System.out.println(obj);

	}

}
