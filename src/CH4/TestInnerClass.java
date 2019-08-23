package CH4;

public class TestInnerClass {
	public static void main(String[] args) {
		// 静态内部类
		Person.Dog d = new Person.Dog();
		// 非静态内部类
		Person per = new Person();
		Person.Bird b = per.new Bird();
		b.setName("乌鸦");
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

			System.out.println("内部类方法");
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
