package CH3;

import java.util.Scanner;

public class ScoreLevel2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ոݔ��֔�: ");
		int score = scanner.nextInt();
		int level = (int) score / 10;

		switch (level) {
		case 10:
		case 9:
			System.out.println("��A");
			break;
		case 8:
			System.out.println("��B");
			break;
		case 7:
			System.out.println("��C");
			break;
		case 6:
			System.out.println("��D");
			break;
		default:
			System.out.println("��E(������)");
		}
	}

}
