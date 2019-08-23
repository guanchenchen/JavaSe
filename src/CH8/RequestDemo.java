package CH8;

public class RequestDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int n = (int) (Math.random() * 10) % 2;
			switch (n) {
			case 0:
				doRequest(new HelloRequest("�����"));
				break;
			case 1:
				doRequest(new WelcomeRequest("Wiki �Wվ"));
			}
		}
	}

	private static void doRequest(IRequest request) {
		// TODO Auto-generated method stub
		request.execute();
	}
}
