package CH11;

public enum DetailAction {
	TURN_LEFT, TURN_RIGHT, SHOOT;

	public String getDes() {
		switch (this.ordinal()) {
		case 0:
			return "向右转";
		case 1:
			return "向左转";
		case 2:
			return "射擊";

		}
		return null;
	}
}
