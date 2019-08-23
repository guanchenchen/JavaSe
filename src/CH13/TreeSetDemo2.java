package CH13;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		Comparator<String> cc = new CustomComparator<String>();
		Set<String> set = new TreeSet<String>(cc);
		set.add("justin");
		set.add("caterpillar");
		set.add("momor");
		for (String name : set) {
			System.out.print(name + " ");
		}
		System.out.println();
	}

}
