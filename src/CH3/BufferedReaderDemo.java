package CH3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Ոݔ��һ�����֣��ɰ����հ�: ");
		try {
			String msg = b.readLine();
			System.out.println("��ݔ�������: " + msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
