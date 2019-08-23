package CH4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestExceptions {

	public static void main(String[] args) throws IOException {
		InputStream isr = null;
		try {
			isr = new FileInputStream(new File("d:" + File.separator + "gcc.txt"));
			int b = isr.read();
			if (b != -1) {

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			isr.close();
		}
	}

}
