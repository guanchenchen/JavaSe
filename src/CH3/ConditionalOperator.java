package CH3;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ոݔ��W���֔�: ");
		int score = scan.nextInt();
		System.out.println("ԓ���Ƿ񼰸�? " + (score >= 60 ? '��' : '��'));

	}

}
