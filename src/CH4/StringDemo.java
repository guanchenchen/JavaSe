package CH4;

public class StringDemo {
	public static void main(String[] args) {
		String text = "Have a nice day!! :)";
		System.out.println("�󌑣�" + text.toUpperCase());
		System.out.println("С����" + text.toLowerCase());
		System.out.println("�L�ȣ�" + text.length());
		System.out.println("ȡ����" + text.replaceAll("nice", "good"));
		System.out.println("���ִ���" + text.substring(5));
	}

}
