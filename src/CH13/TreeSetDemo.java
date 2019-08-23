package CH13;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();

		set.add("justin");
		set.add("caterpillar");
		set.add("momor");

		for (String name : set) {
			System.out.print(name + " ");
		}
		System.out.println();

	}

}
