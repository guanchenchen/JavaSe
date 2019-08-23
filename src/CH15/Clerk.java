package CH15;

public class Clerk {
	private int product = -1;

	public int getProduct() {
		synchronized (this) {
			if (this.product == -1) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			int p = this.product;
			System.out.printf("���M��ȡ�� (%d)%n", this.product);
			this.product = -1;
			notify();
			return p;
		}
	}

	public void setProduct(int product) {
		synchronized (this) {
			if (this.product != -1) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.product = product;
			System.out.printf("���a���O�� (%d)%n", this.product);
			notify();
		}
	}

}
