package CH10;

public class CheckArgsDemo {
	public static void main(String[] args) {
		try {
			System.out.printf("���� %s ����%n", args[0]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
