package CH6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseRegularExpression {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("abcdefgabcabc".replaceAll(".bc", "###"));
		String phoneEL = "[0-9]{4}-[0-9]{6}";
		String urlEL = "<a.+href*=*['\"]?.*?['\"]?.*?>";
		String emailEL = "^[_a-z0-9-]+(.[_a-z0-9-]+)*" + "@[a-z0-9-]+(.[a-z0-9-]+)*$";
		System.out.print("ݔ���֙C̖�a: ");
		String input = null;
		try {
			input = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (input.matches(phoneEL))
			System.out.println("��ʽ���_");
		else
			System.out.println("��ʽ�e�`");

		System.out.print("ݔ��href�˻`: ");
		try {
			input = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ��Chref�˻`
		if (input.matches(urlEL))
			System.out.println("��ʽ���_");
		else
			System.out.println("��ʽ�e�`");

		System.out.print("ݔ������]��: ");
		try {
			input = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ��C����]����ʽ
		if (input.matches(emailEL))
			System.out.println("��ʽ���_");
		else
			System.out.println("��ʽ�e�`");
	}

}
