package CH4;

public class WrapperDemo {
	public static void main(String[] args) {
		int data1 = 12;
		int data2 = 38;
		Integer i1 = new Integer(data1);
		Integer i2 = new Integer(data2);
		// 直接除以3
		System.out.println(i1 / 3);

		// 轉為double值再除以3
		System.out.println(i2.doubleValue() / 3);

		// 進行兩個值的比較
		System.out.println(i1.compareTo(i2));

	}

}
