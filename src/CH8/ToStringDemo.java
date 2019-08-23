package CH8;

public class ToStringDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sb.length(); i++) {
			sb.append(i);
		}

		System.out.println(sb.toString());

	}

}
