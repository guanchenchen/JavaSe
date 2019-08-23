package CH5;

import java.util.Arrays;

public class SimpleArray {
	public static void main(String[] args) {
		int score[] = { 90, 85, 55, 94, 77 };
		Arrays.sort(score);
		for (int i = 0; i < score.length; i++) {
			System.out.printf("score[%d] = %d\n", i, score[i]);
		}
	}

}
