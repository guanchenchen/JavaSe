package CH3;

import java.util.Scanner;

public class ConditionalOperator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("請輸入學生分數: ");
		int score = scan.nextInt();
		System.out.println("該生是否及格? " + (score >= 60 ? '是' : '否'));

	}

}
