package CH15;

public class SomeThread implements Runnable {

	public static void main(String[] args) {
		Thread thread = new Thread(new SomeThread());
		thread.start();
		thread.interrupt();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("sleep....ÖÁ blocked  î‘B");
		while (true) {
			try {
				Thread.sleep(9999);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("I am interrupted....");
			}
		}

	}

}
