package CH3;

import java.util.Scanner;

public class OddDecider {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int odd = scan.nextInt();
		System.out.println("ÊÇ·ñžéÆæ”µ? " + (odd % 2 != 0 ? 'ÊÇ' : '·ñ'));
	}

}
