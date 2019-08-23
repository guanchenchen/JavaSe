package CH15;

public class TestThread00 {
	public static void main(String[] args) {
		// 1.
		Thread t = new Thread() {
			public void run() {
				System.out.println("我的线程执行了1");
			}
		};
		t.start();
		// 2.
		new Thread() {
			public void run() {
				System.out.println("我的线程执行了2");
			}
		}.start();

		// 3.
		Runnable able = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("我的线程执行了3");
			}
		};

		Thread tt = new Thread(able);
		tt.start();

		// 4.
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("我的线程执行了4");

			}
		});
		t1.start();

		// 5.
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("我的线程执行了5");
			}
		}).start();

	}

}
