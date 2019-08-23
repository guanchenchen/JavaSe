package CH15;

class TestThreads extends Thread {
	public TestThreads(String name) {
		// TODO Auto-generated constructor stub
	}

	public void run() {

	}

}

public class LoggerTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			SimpleThreadLogger.log(Thread.currentThread().getName() + ": message " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				SimpleThreadLogger.log(e.toString());
			}
		}
	}

}
