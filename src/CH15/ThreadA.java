package CH15;

public class ThreadA {
	public static void main(String[] args) {
		System.out.println("Thread A 執行");
		Thread tt = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				System.out.println("Thread B 开始");
				for (int i = 0; i <= 20; i++)
					try {
						Thread.sleep(100);
						System.out.println("Thread B 執行..");
						System.out.println(Thread.currentThread().getName() + "," + i);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				System.out.println("Thread B 即將結束..");

			}
		});
		tt.start();
		try {
			tt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread A 執行");
	}

}
