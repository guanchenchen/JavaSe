package CH4;

public class StringDemo {
	public static void main(String[] args) {
		String text = "Have a nice day!! :)";
		System.out.println("大寫：" + text.toUpperCase());
		System.out.println("小寫：" + text.toLowerCase());
		System.out.println("長度：" + text.length());
		System.out.println("取代：" + text.replaceAll("nice", "good"));
		System.out.println("子字串：" + text.substring(5));
	}

}
