package CH11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		// read();
		write();
	}

	private static void write() throws IOException {
		// TODO Auto-generated method stub

		File f = new File("d:" + File.separator + "2.txt");
		FileOutputStream fos = new FileOutputStream(f, true);
		fos.write(new String("AAAAAAAAAAAAAAAAAAAAAAA").getBytes());
		if (fos != null) {
			fos.close();
		}

	}

	public static void read() throws IOException {
		File f = new File("d:" + File.separator + "1.txt");
		FileInputStream fis = new FileInputStream(f);
		byte[] data = new byte[1024];
		int len;
		while ((len = fis.read(data)) != -1) {
			System.out.println(new String(data, 0, len));
		}
	}

}
