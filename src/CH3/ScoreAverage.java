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
			System.out.print("輸入分數(-1結束)：");
			score = scanner.nextInt();
		}
		System.out.println("平均：" + (double) sum / count);

	}

}
