package CH14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("d:" + File.separator + "FileDemo.txt");
		byte[] buffer = new byte[1024];
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream("d:" + File.separator + "FileDemo1.txt");
		System.out.println(fis.available());
		while (true) {
			if (fis.available() < 1024) {
				int remain = -1;
				while ((remain = fis.read()) != -1) {
					fos.write(remain);
				}
			} else {
				fis.read(buffer);
				fos.write(buffer);
			}

		}

	}

}
