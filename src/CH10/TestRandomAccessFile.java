package CH10;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
	public static void main(String[] args) throws IOException {
		// test();
		test1();
	}

	public static void test1() throws IOException {

		RandomAccessFile raf2 = new RandomAccessFile(new File("d:" + File.separator + "gcc1.txt"), "rw");
		raf2.seek(3);
		raf2.write("xyx".getBytes());
		raf2.close();

	}

	public static void test() throws IOException {
		RandomAccessFile raf1 = new RandomAccessFile(new File("d:" + File.separator + "log.txt"), "r");
		RandomAccessFile raf2 = new RandomAccessFile(new File("d:" + File.separator + "gcc1.txt"), "rw");
		byte[] b = new byte[1024];
		int len;
		while ((len = raf1.read()) != -1) {
			raf2.write(b, 0, len);
		}
	}

}
