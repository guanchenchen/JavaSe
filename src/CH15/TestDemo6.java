package CH15;

public class TestDemo6 {

	public static void main(String[] args) {

		new Thread() {
			public void run() {
				System.out.println("=============");
			}
		}.start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("**************************");

			}
		}).start();

	}

}
