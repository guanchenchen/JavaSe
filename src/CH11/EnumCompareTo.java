package CH11;

public class EnumCompareTo {
	public static void main(String[] args) {
		compareToAction(Action.valueOf(args[0]));
	}

	private static void compareToAction(Action inputAction) {
		// TODO Auto-generated method stub
		System.out.println("ݔ�룺" + inputAction);
		for (Action action : Action.values()) {
			System.out.println(action.compareTo(inputAction));
		}

	}

}
