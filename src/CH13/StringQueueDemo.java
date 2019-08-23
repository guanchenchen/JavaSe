package CH13;

import java.util.Scanner;

public class StringQueueDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		StringQueue queue = new StringQueue();

		System.out.println("輸入名稱(使用quit結束)");

		while (true) {
			System.out.print("# ");
			String input = scanner.next();

			if (input.equals("quit"))
				break;
			queue.put(input);
		}
		System.out.print("顯示輸入: ");
		while (!queue.isEmpty()) {
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}

}
