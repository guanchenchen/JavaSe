package CH8;

public abstract class AbstractGuessGame {
	private int number;

	public void setNumber(int number) {
		this.number = number;
	}

	public void start() {
		showMessage("�gӭ");
		int guess = 0;
		do {
			guess = getUserInput();
			if (guess > number) {
				showMessage("ݔ��Ĕ����^��");
			} else if (guess < number) {
				showMessage("ݔ��Ĕ����^С");
			} else {
				showMessage("������");
			}
		} while (guess != number);
	}

	protected abstract void showMessage(String message);

	protected abstract int getUserInput();
}
