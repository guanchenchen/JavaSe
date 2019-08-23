package CH11;

public class EnumDemo2 {
	private enum InnerAction {
		TURN_LEFT, TURN_RIGHT, SHOOT
	};

	public static void main(String[] args) {
		doAction(InnerAction.TURN_LEFT);
	}

	private static void doAction(InnerAction action) {
		// TODO Auto-generated method stub
		switch (action) {
		case TURN_LEFT:
			System.out.println("œÚ◊ÛﬁD");
			break;
		case TURN_RIGHT:
			System.out.println("œÚ”“ﬁD");
			break;
		case SHOOT:
			System.out.println("…‰ìÙ");
			break;

		}
	}

}
