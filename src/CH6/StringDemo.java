package CH6;

public class StringDemo {
	public static void main(String[] args) {
		String text = "hello";

		System.out.println("字串內容: " + text);
		System.out.println("字串長度: " + text.length());
		System.out.println("等於hello? " + text.equals("hello"));
		System.out.println("轉為大寫: " + text.toUpperCase());
		System.out.println("轉為小寫: " + text.toLowerCase());
	}

}
