package CH11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestInpouOutputStreamWriterReader {
	public static void main(String[] args) throws IOException {

		BufferedReader bread = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File("d:" + File.separator + "1.txt", "GBK"))));
		BufferedWriter bwriter = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(new File("d:" + File.separator + "22.txt", "GBK"))));
		String str = null;
		while ((str = bread.readLine()) != null) {
			bwriter.write(str);
			bwriter.newLine();
		}
		if (bwriter != null) {
			bwriter.close();
		}

		if (bread != null) {
			bread.close();
		}

	}

}
