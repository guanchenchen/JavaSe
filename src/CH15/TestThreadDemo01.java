package CH15;

public class TestThreadDemo01 extends Thread {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}

	}

	public static void main(String[] args) {
		TestThreadDemo01 tt = new TestThreadDemo01();
		tt.start();
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}
