package CH15;

public class InterruptDemo {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++) {
					System.out.println("Ïß³ÌÖ´ÐÐ" + Thread.currentThread().getName() + ":" + i);
				}
			}
		});
		t.start();
	}
}
