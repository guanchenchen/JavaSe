package CH3;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sac = new Scanner(System.in);
		System.out.println("请输入你的名字");
		String name = sac.next();
		System.out.println("名字是：" + name);
	}

}
