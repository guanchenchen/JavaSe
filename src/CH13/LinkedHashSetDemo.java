package CH13;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("caterpillar");
		set.add("momor");
		set.add("bush");
		for (String name : set) {
			System.out.print(name + " ");
		}
		System.out.println();
	}

}
