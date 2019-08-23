package CH14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderWriterDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufWriter = new BufferedWriter(new FileWriter("d:" + File.separator + "FileDemo8.txt"));
		String str = null;
		while (!(str = bufferedReader.readLine()).equals("quit")) {
			bufWriter.write(str);
			bufWriter.newLine();
		}
		bufferedReader.close();
		bufWriter.close();

	}

}
