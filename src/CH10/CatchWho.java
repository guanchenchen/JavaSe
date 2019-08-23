package CH10;

public class CatchWho {
	public static void main(String[] args) {
		try {
			try {
				throw new ArrayIndexOutOfBoundsException();
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.getMessage();
		}
	}
}
