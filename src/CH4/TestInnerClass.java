package CH4;

public class TestInnerClass {
	public static void main(String[] args) {
		// ��̬�ڲ���
		Person.Dog d = new Person.Dog();
		// �Ǿ�̬�ڲ���
		Person per = new Person();
		Person.Bird b = per.new Bird();
		b.setName("��ѻ");
		b.info();
		per.name = "hehe";

	}

}

class Person {
	String name;
	int age;

	class Bird {
		String name;
		int age;

		public void info() {
			// TODO Auto-generated method stub

			System.out.println("�ڲ��෽��");
			System.out.println(name);

		}

		public void setName(String name) {
			this.name = name;
		}
	}

	static class Dog {

	}

	public void show() {
		class Cat {

		}
	}
}
