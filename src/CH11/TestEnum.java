package CH11;

enum Signal {
	green, red, yellow;
}

enum SeasonEnum {
	SPRING("����"), SUMMER("����"), FALL("����"), WINTER("����");
	private final String name;

	private SeasonEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class TestEnum {
	Signal col = Signal.red;

	public void change() {
		switch (col) {
		case red:
			col = Signal.green;
			break;
		case yellow:
			col = Signal.yellow;
			break;
		case green:
			col = Signal.green;
		}
	}

	public static void main(String[] args) {
		for (SeasonEnum se : SeasonEnum.values()) {
			System.out.println(se);
		}
	}
}
