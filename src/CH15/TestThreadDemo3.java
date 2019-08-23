package CH15;

public class TestThreadDemo3 extends Thread {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		TestThreadDemo3 tt = new TestThreadDemo3();
		tt.setName("子线程");
		tt.start();
		Thread.currentThread().setName("==================主线程");
		for (int i = 0; i < 100; i++) {
			if (i == 20) {
				try {
					tt.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			System.out.println(Thread.currentThread().getName() + ":" + i);
			System.out.println("=============" + tt.isAlive());
		}
	}

}
