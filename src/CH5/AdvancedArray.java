package CH5;

public class AdvancedArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] temp1 = arr1;
		int[] temp2 = arr1;
		System.out.print("͸�^tmp1ȡ�����ֵ��");
		for (int i = 0; i < temp1.length; i++) {
			System.out.print(temp1[i] + " ");
		}

		System.out.print("\n͸�^tmp2ȡ�����ֵ��");
		for (int i = 0; i < temp1.length; i++) {
			System.out.print(temp2[i] + " ");
		}

		temp1[2] = 9;
		System.out.print("\n\n͸�^tmp1ȡ�����ֵ��");
		for (int i = 0; i < temp1.length; i++) {
			System.out.print(temp1[i] + " ");
		}

		System.out.print("\n\n͸�^tmp2ȡ�����ֵ��");
		for (int i = 0; i < temp2.length; i++) {
			System.out.print(temp2[i] + " ");
		}
	}

}
