package CH7;

public class UseGC {
	public static void main(String[] args) {
		System.out.println("Ո��Ctrl + C�Kֹ��ʽ........");

		GcTest obj1 = new GcTest("object1");
		GcTest obj2 = new GcTest("object2");
		GcTest obj3 = new GcTest("object3");

		// �����Q�����������
		obj1 = null;
		obj2 = null;
		obj3 = null;

		// ���h�������
		System.gc();

		while (true)
			; // �������г�ʽ
	}

}
