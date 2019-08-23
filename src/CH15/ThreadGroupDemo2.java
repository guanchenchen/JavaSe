package CH15;

public class ThreadGroupDemo2 {
	public static void main(String[] args) {
		ThreadExceptionHandler handle = new ThreadExceptionHandler();
		ThreadGroup tg = new ThreadGroup("group1");
		Thread t = new Thread(tg, new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				throw new RuntimeException("úy‘á¿˝Õ‚");
			}
		});
		t.setUncaughtExceptionHandler(handle);
		t.start();
	}

}
