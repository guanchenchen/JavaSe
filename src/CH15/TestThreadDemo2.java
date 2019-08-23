package CH15;

public class TestThreadDemo2 extends Thread {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}

	}

	public static void main(String[] args) {
		TestThreadDemo2 tt = new TestThreadDemo2();
		tt.setName("���߳�");
		tt.start();
		Thread.currentThread().setName("==================���߳�");
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0) {
				Thread.currentThread().yield();
			}
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}
