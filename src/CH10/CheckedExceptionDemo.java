package CH10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Ոݔ������: ");
		try {
			int input = Integer.parseInt(buf.readLine());
			System.out.println("input x 10 = " + (input * 10));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("I/O�e�`");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ݔ���횞�����");
		}

	}

}
