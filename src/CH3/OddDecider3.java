package CH3;

import java.util.Scanner;

public class OddDecider3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("ÕˆÝ”Èë”µ×Ö:");
		int num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + "Å¼Êý");
		} else {
			System.out.println(num + "žéÆæ”µ");
		}

	}

}
