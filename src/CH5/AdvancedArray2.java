package CH5;

public class AdvancedArray2 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 5, 6, 7 };
		int[] tmp = arr1;

		System.out.print("ʹ��tmpȡ��arr1�е�Ԫ�أ�");
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + " ");
		}
		tmp = arr2;
		System.out.print("\nʹ��tmpȡ��arr2�е�Ԫ�أ�");
		for (int i = 0; i < tmp.length; i++)
			System.out.print(tmp[i] + " ");
		System.out.println();
	}

}
