package CH11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestSystem {
	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("ÇëÊäÈë×Ö·û´®");
		String str;
		while (true) {
			str = br.readLine();
			if (str.equalsIgnoreCase("exit") || str.equalsIgnoreCase("e")) {
				break;
			} else {
				String msg = str.toUpperCase();
				System.out.println(msg);
			}

			br.close();
		}

	}

}
