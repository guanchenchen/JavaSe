package CH4;

import java.util.Scanner;

public class UserLogin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ʹ�������Q��");
		String username = scanner.next();
		System.out.print("ʹ�����ܴa��");
		String password = scanner.next();
		if ("caterpillar".equals(username) && "1975".equals(password)) {

			System.out.println("�����YӍ�ڴˣ�");
		} else {
			System.out.println(username + " ���ã�ݔ��ĵ����Y�����`��Ո����ݔ�룡");
		}
	}

}
