package CH15;

public class TestThread00 {
	public static void main(String[] args) {
		// 1.
		Thread t = new Thread() {
			public void run() {
				System.out.println("�ҵ��߳�ִ����1");
			}
		};
		t.start();
		// 2.
		new Thread() {
			public void run() {
				System.out.println("�ҵ��߳�ִ����2");
			}
		}.start();

		// 3.
		Runnable able = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�ҵ��߳�ִ����3");
			}
		};

		Thread tt = new Thread(able);
		tt.start();

		// 4.
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�ҵ��߳�ִ����4");

			}
		});
		t1.start();

		// 5.
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("�ҵ��߳�ִ����5");
			}
		}).start();

	}

}
