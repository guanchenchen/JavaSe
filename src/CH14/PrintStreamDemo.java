package CH14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		try {
			PrintStream ps = new PrintStream(new FileOutputStream(new File("d:" + File.separator + "FileDemo.txt")));
			ps.print(1);
			ps.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
