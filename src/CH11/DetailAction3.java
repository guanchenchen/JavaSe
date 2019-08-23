package CH11;

public enum DetailAction3 implements IDescription {
	TURN_LEFT("œÚ◊ÛﬁD"), TURN_RIGHT("œÚ”“ﬁD"), SHOOT("…‰ìÙ");

	private String description;

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	private DetailAction3(String description) {
		this.description = description;
	}

}
