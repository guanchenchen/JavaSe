package CH13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IteratorDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		System.out.println("輸入名稱(輸入quit結束)");
		while (true) {
			System.out.println("#");
			String input = scan.next();
			if (input.equals("quit"))
				break;
			list.add(input);
		}
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) { // 還有下一個元素嗎？
			// 使用 next() 取得下一個元素
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}

}
