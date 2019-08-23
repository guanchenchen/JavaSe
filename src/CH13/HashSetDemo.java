package CH13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("1111");
		set.add("hehe");
		set.add(new String("รรรรตฤ"));
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		set.remove("11112");
		for (String name : set) {
			System.out.print(name + " ");
		}
		System.out.println();
	}

}
