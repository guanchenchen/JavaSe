package CH3;

import java.util.Scanner;

public class OddDecider2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println("ÊÇ·ñžéÆæ”µ? " + ((number & 1) != 0 ? 'ÊÇ' : '·ñ'));
	}

}
