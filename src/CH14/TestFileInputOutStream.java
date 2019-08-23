package CH14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputOutStream {
	public static void main(String[] args) {
		read();

		// write();
	}

	private static void read() {
		// TODO Auto-generated method stub
		File f = new File("d:" + File.separator + "FileDemo.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
			int len;
			byte[] data = new byte[1024];
			try {
				while ((len = fis.read(data)) != -1) {
					System.out.println(new String(data));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
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
		}

	}

}
