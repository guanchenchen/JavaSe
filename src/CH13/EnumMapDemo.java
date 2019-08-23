package CH13;

import java.util.EnumMap;
import java.util.Map;

enum Action {
	TURN_LEFT, TURN_RIGHT, SHOOT
}

public class EnumMapDemo {
	public static void main(String[] args) {
		Map<Action, String> map = new EnumMap<Action, String>(Action.class);
		map.put(Action.TURN_LEFT, "�����D");
		map.put(Action.TURN_RIGHT, "�����D");
		map.put(Action.SHOOT, "���");
		for (Action action : Action.values()) {
			System.out.println(map.get(action));
		}

	}
}
