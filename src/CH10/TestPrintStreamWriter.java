package CH10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStreamWriter {
	public static void main(String[] args) throws IOException {
		// System.out.println("HelloWorld");
		// testDataStream();
		testDataStream2();
	}

	public static void testDataStream() throws IOException {
		FileOutputStream fos = new FileOutputStream(new File("d:" + File.separator + "log.txt"));
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("heheheheh");
		dos.writeLong(99999999);
	}

	public static void testDataStream2() throws IOException {
		FileInputStream fos = new FileInputStream(new File("d:" + File.separator + "log.txt"));
		DataInputStream dos = new DataInputStream(fos);
		String msg = dos.readUTF();
		System.out.println(msg);

	}

	public void test() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream(new File("d:" + File.separator + "logs.txt"));
		PrintStream ps = new PrintStream(fos, true);
		if (ps != null) {
			System.setOut(ps);
		}
		for (int i = 0; i <= 255; i++) {
			System.out.println((char) (i));
		}
		ps.close();
	}
}
