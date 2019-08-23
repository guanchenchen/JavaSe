package CH15;

class Ticket implements Runnable {
	private int ticket = 100;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			while (true) {
				if (ticket > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "ย๔ฦฑ,สฃำเ:" + ticket--);
				} else {
					break;
				}
			}

		}

	}
}

public class SellTicket {

	public static void main(String[] args) {
		Ticket t = new Ticket();
		Thread td = new Thread(t);
		td.start();
		Thread td1 = new Thread(t);
		td1.start();
		Thread td2 = new Thread(t);
		td2.start();
	}

}
