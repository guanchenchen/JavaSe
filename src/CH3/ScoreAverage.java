package CH3;

import java.util.Scanner;

public class ScoreAverage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		int sum = 0;
		int count = -1;
		while (score != -1) {
			count++;
			sum += score;
			System.out.print("ݔ��֔�(-1�Y��)��");
			score = scanner.nextInt();
		}
		System.out.println("ƽ����" + (double) sum / count);

	}

}
