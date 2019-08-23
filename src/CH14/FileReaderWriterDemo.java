package CH14;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(new File("d:" + File.separator + "FileDemo.txt"));
		FileWriter fw = new FileWriter(new File("d:" + File.separator + "FileDemoCopy.txt"));
		int in = 0;
		char[] wlnchar = { '\r', '\n' };
		while ((in = fr.read()) != -1) {
			if (in == '\n') {
				fw.write(wlnchar);
			} else {
				fw.write(in);
			}
		}
		fr.close();
		fw.close();

	}
}
