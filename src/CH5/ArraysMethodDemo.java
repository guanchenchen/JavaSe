package CH5;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMethodDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = { 93, 5, 3, 55, 57, 7, 2, 73, 41, 91 };
		System.out.print("排序前: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		Arrays.sort(arr);

		System.out.print("排序後: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.print("\n請輸入搜尋值: ");
		int key = scan.nextInt();
		int find = -1;
		if ((find = Arrays.binarySearch(arr, key)) > -1) {
			System.out.println("找到值於索引 " + find + " 位置");
		} else {
			System.out.println("找不到指定值");
		}

	}
}
