package CH13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		System.out.println("ݔ�����Q(ʹ��quit�Y��)");
		while (true) {
			System.out.println("#");
			String msg = scan.next();
			if (msg.equals("quit")) {
				break;
			}
			list.add(msg);
		}
		System.out.print("�@ʾݔ��: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
	}
}
