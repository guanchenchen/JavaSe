package CH10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	int age;
	String name;

	public Person(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

}

public class TestObjectStream {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// test();
		test1();
	}

	public static void test1() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:" + File.separator + "person.txt"));
		Person p1 = (Person) ois.readObject();
		System.out.println(p1.toString());
		Person p2 = (Person) ois.readObject();
		System.out.println(p2.toString());
		if (ois != null) {
			ois.close();
		}

	}

	public static void test() throws FileNotFoundException, IOException {
		Person p1 = new Person(10, "小米");
		Person p2 = new Person(22, "小王");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:" + File.separator + "person.txt"));
		oos.writeObject(p1);
		oos.flush();
		oos.writeObject(p2);
		oos.flush();
		if (oos != null) {
			oos.close();
		}

	}

}
