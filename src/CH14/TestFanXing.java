package CH14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFanXing {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(122);
		l1.add(888);
		// l1.add(new String("aaa"));
		/*
		 * for (int i = 0; i < l1.size(); i++) System.out.println(l1.get(i));
		 */

		Iterator<Integer> it = l1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
