package CH3;

import java.util.Scanner;

public class OddDecider4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int replay = 0;

		do {
			System.out.print("ݔ������ֵ��");
			input = scanner.nextInt();
			System.out.println("ݔ�딵���攵��" + ((input % 2 == 1) ? 'Y' : 'N'));
			System.out.print("�^�m(1:�^�m 0:�Y��)��");
			replay = scanner.nextInt();

		} while (replay == 1);
	}

}
