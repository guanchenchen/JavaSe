package CH9;

public class ImportStaticDemo {
	public static void main(String[] args) {
		int[] ints = new int[] { 2, 324, 4, 57, 1 };

		System.out.println("ÔöĞòÅÅĞòºóË³Ğò");
		Arrays.sort(ints);
		for (int i = 0; i < ints.length; i++) {
			System.out.print(ints[i] + " ");
		}
	}
}

/*
 * private static void sort(int[] arr) { // TODO Auto-generated method stub for
 * (int i = 1; i < arr.length; i++) { if (arr[i] < arr[i - 1]) { int temp =
 * arr[i]; arr[i] = arr[i - 1]; arr[i - 1] = temp;
 * 
 * } }
 * 
 * }
 */
