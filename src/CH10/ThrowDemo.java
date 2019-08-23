package CH10;

public class ThrowDemo {
	public static void main(String[] args) {
		double data = 10.0 / 0.0;
		if (String.valueOf(data).equals("Infinity")) {
			throw new ArithmeticException("³ıÁãÀıÍâ");
		}
	}
}
