package CH11;

public enum DetailAction {
	TURN_LEFT, TURN_RIGHT, SHOOT;

	public String getDes() {
		switch (this.ordinal()) {
		case 0:
			return "����ת";
		case 1:
			return "����ת";
		case 2:
			return "���";

		}
		return null;
	}
}
