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
		System.out.println("���M���_ʼ��������......");
		for (int i = 1; i <= 10; i++) {
			try {
				// �ȴ��S�C�r�g
				Thread.sleep((int) (Math.random() * 3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
