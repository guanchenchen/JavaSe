package CH11;

public enum DetailAction2 {
	TURN_LEFT("����ת"), TURN_RIGHT("����ת"), SHOOT("���");
	private String description;

	private DetailAction2(String description) {
		// TODO Auto-generated constructor stub
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
