package CH13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IteratorDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		System.out.println("ݔ�����Q(ݔ��quit�Y��)");
		while (true) {
			System.out.println("#");
			String input = scan.next();
			if (input.equals("quit"))
				break;
			list.add(input);
		}
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) { // ߀����һ��Ԫ�؆᣿
			// ʹ�� next() ȡ����һ��Ԫ��
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}

}
