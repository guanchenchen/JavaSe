package CH8;

public class ExtendDemo {
	public static void main(String[] args) {
		Chicken chicken1 = new Chicken("С��", "�tɫС�u��");
		Chicken chicken2 = new Chicken();

		System.out.printf("С�u1 - ���Q %s, �u���� %s�� \n", chicken1.getName(), chicken1.getCrest());
		chicken1.wu();

		System.out.printf("С�u2 - ���Q %s, �u���� %s�� \n", chicken2.getName(), chicken2.getCrest());
		chicken2.wu();
	}

}
