package CH11;

public class EnumDemo {
	public static void main(String[] args) {
		doAction(Action.TURN_LEFT);
	}

	private static void doAction(Action action) {
		// TODO Auto-generated method stub
		switch (action) {
		case TURN_LEFT:
			System.out.println("�����D");
			break;
		case TURN_RIGHT:
			System.out.println("�����D");
			break;
		case SHOOT:
			System.out.println("���");
			break;

		default:
			break;
		}

	}

}
