package CH13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnhancedForDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		System.out.println("ݔ�����Q(ݔ��quit�Y��)");
		while (true) {
			System.out.print("# ");
			String input = scan.next();

			if (input.equals("quit")) {
				break;
			}
			list.add(input);
		}

		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

}
