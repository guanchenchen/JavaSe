package CH3;

import java.util.Scanner;

public class OddDecider {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int odd = scan.nextInt();
		System.out.println("�Ƿ���攵? " + (odd % 2 != 0 ? '��' : '��'));
	}

}
