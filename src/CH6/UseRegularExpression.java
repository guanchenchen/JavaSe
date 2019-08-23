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
		System.out.print("輸入手機號碼: ");
		String input = null;
		try {
			input = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (input.matches(phoneEL))
			System.out.println("格式正確");
		else
			System.out.println("格式錯誤");

		System.out.print("輸入href標籤: ");
		try {
			input = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 驗證href標籤
		if (input.matches(urlEL))
			System.out.println("格式正確");
		else
			System.out.println("格式錯誤");

		System.out.print("輸入電子郵件: ");
		try {
			input = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 驗證電子郵件格式
		if (input.matches(emailEL))
			System.out.println("格式正確");
		else
			System.out.println("格式錯誤");
	}

}
