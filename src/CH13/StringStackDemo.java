package CH13;

import java.util.Scanner;

public class StringStackDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		StringStack stack = new StringStack();

		System.out.println("ݔ�����Q(ʹ��quit�Y��)");

		while (true) {
			System.out.print("# ");
			String input = scanner.next();

			if (input.equals("quit"))
				break;
			stack.push(input);
		}

		System.out.print("�@ʾݔ��: ");
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}
}
