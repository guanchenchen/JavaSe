package CH9;

public class AnonymousClassDemo {
	public static void main(String[] args) {
		Object obj = new Object() {
			public String toString() {
				return "����e���";
			}
		};
		System.out.println(obj);

	}

}
