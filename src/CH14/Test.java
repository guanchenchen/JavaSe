package CH14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {

	private static int position = -1;

	public static void main(String[] args) {
		File sourceFile = new File("D:" + File.separator + "test.txt");
		File descFile = new File("C:" + File.separator + "test.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;

		byte[] buffer = new byte[1024];
		try {
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(descFile);
			while ((fis.read(buffer)) != -1) {
				fos.write(buffer);
				if (descFile.length() == 3) {
					position = 3;
				}
			}
			keepGoing(sourceFile, descFile, position);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	private static void keepGoing(File source, File desc, int position2) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			RandomAccessFile readFile = new RandomAccessFile(source, "rw");
			RandomAccessFile writeFile = new RandomAccessFile(desc, "rw");
			try {
				readFile.seek(position);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				writeFile.seek(position);
				byte[] buf = new byte[1];

				while (readFile.read(buf) != -1) {
					writeFile.write(buf);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
