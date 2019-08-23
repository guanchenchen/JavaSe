package CH15;

public class DaemonThread {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					System.out.print("T");
				}
			}
		});
		t.setDaemon(true);
		t.start();
	}

}
