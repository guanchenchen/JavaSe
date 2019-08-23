package CH3;

import java.util.Scanner;

public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入一個數字： ");
		System.out.printf("您輸入了 %d ！\n", scanner.nextInt());
	}

}
