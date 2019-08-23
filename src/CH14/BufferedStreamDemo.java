package CH14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo {
	public static void main(String[] args) throws IOException {
		byte[] data = new byte[1024];
		File srcFile = new File("d:" + File.separator + "FileDemo.txt");
		File desFile = new File("d:" + File.separator + "FileDemo88.txt");
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(desFile));
		System.out.println("Ñ}Ñu™n°¸£º" + srcFile.length() + "Î»Ôª½M");
		while (bufferedInputStream.read(data) != -1) {
			bufferedOutputStream.write(data);
		}
		bufferedInputStream.close();
		bufferedOutputStream.close();
	}

}
