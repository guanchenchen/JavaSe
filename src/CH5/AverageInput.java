package CH5;

import java.util.Scanner;

public class AverageInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ոݔ��W���˔�: ");

		int length = scanner.nextInt();
		float[] score = new float[length]; // �ӑB�����L��

		for (int i = 0; i < score.length; i++) {
			System.out.print("ݔ��֔���");
			float input = scanner.nextFloat();
			score[i] = input;
		}

		System.out.print("\n�֔���");
		float total = 0;
		for (int i = 0; i < score.length; i++) {
			total = total + score[i];
			System.out.print(score[i] + " ");
		}

		System.out.printf("\nƽ����%.2f", total / score.length);
	}
}