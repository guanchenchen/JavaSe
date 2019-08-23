package CH9;

public class Person implements Comparable<Person> {
	String name;
	int age;

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		int i = this.name.compareTo(o.name);
		if (i == 0) {
			return this.age - o.age;
		} else {
			return i;
		}
	}
}
