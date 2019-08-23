package CH7;

public class MathTool {

	public static int sum(int... nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += i;
		}
		return sum;
	}

}
