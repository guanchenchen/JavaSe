package CH13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<String> queue = new LinkedList<String>();
		System.out.println("ݔ�����Q(ʹ��quit�Y��)");

		while (true) {
			System.out.print("# ");
			String input = scanner.next();

			if (input.equals("quit"))
				break;
			// offer()������Ԫ����������
			queue.offer(input);
			System.out.print("�@ʾݔ��: ");
			String element = null;
			while ((element = queue.poll()) != null) {
				System.out.println(element + " ");
			}
		}
	}

}
