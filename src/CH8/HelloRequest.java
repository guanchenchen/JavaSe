package CH8;

public class HelloRequest implements IRequest {
	private String name;

	public HelloRequest(String name) {
		this.name = name;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.printf("���� %s��%n", name);

	}

}
