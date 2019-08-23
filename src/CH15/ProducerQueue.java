package CH15;

import java.util.concurrent.BlockingQueue;

public class ProducerQueue implements Runnable {
	private BlockingQueue<Integer> queue;

	public ProducerQueue(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int product = 1; product <= 10; product++) {
			try {
				Thread.sleep((int) (Math.random() * 1000));
				queue.put(product);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
