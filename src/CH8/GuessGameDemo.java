package CH8;

public class GuessGameDemo {
	public static void main(String[] args) {
		AbstractGuessGame agg = new TextModeGame();
		agg.setNumber(50);
		agg.start();
	}

}
