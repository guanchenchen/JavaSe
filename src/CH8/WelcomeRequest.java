package CH8;

public class WelcomeRequest implements IRequest {
	private String place;

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.printf("ög”≠ÅÌµΩ %s£°%n", place);

	}

	public WelcomeRequest(String place) {
		// TODO Auto-generated constructor stub
		this.place = place;
	}

}
