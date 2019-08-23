package CH6;

public class AppendStringTest {
	public static void main(String[] args) {
		String text = " ";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			text += i;
		}
		long end = System.currentTimeMillis();
		System.out.println("ˆÌÐÐ•rég£º" + (end - start));
		StringBuilder sb = new StringBuilder("");
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append(String.valueOf(i));
		}
		long endTime = System.currentTimeMillis();
		System.out.println("ˆÌÐÐ•rég£º" + (endTime - beginTime));

	}

}
