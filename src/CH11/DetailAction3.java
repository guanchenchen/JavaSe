package CH11;

public enum DetailAction3 implements IDescription {
	TURN_LEFT("�����D"), TURN_RIGHT("�����D"), SHOOT("���");

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
