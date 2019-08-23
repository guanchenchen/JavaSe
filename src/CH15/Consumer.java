package CH15;

public class Consumer implements Runnable {
	private Clerk clerk;

	public Consumer(Clerk clerk) {
		// TODO Auto-generated constructor stub
		this.clerk = clerk;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("消費者開始消耗整數......");
		for (int i = 1; i <= 10; i++) {
			try {
				// 等待隨機時間
				Thread.sleep((int) (Math.random() * 3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
