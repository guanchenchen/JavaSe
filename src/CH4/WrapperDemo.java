package CH4;

public class WrapperDemo {
	public static void main(String[] args) {
		int data1 = 12;
		int data2 = 38;
		Integer i1 = new Integer(data1);
		Integer i2 = new Integer(data2);
		// ֱ�ӳ���3
		System.out.println(i1 / 3);

		// �D��doubleֵ�ٳ���3
		System.out.println(i2.doubleValue() / 3);

		// �M�Ѓɂ�ֵ�ı��^
		System.out.println(i1.compareTo(i2));

	}

}
