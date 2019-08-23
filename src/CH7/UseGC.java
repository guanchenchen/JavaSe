package CH7;

public class UseGC {
	public static void main(String[] args) {
		System.out.println("請按Ctrl + C終止程式........");

		GcTest obj1 = new GcTest("object1");
		GcTest obj2 = new GcTest("object2");
		GcTest obj3 = new GcTest("object3");

		// 令名稱不參考至物件
		obj1 = null;
		obj2 = null;
		obj3 = null;

		// 建議回收物件
		System.gc();

		while (true)
			; // 不斷執行程式
	}

}
