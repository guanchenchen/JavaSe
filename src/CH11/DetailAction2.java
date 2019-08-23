package CH11;

public enum DetailAction2 {
	TURN_LEFT("向左转"), TURN_RIGHT("向右转"), SHOOT("射击");
	private String description;

	private DetailAction2(String description) {
		// TODO Auto-generated constructor stub
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
