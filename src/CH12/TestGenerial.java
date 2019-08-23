package CH12;

import java.util.ArrayList;
import java.util.List;

public class TestGenerial {
	public static void main(String[] args) {
		List<Object> list1 = null;
		List<String> list2 = new ArrayList<String>();
		// list1 = list2;

		List<?> l1 = null; // Í¨Åä·û £¿
		List<String> l2 = new ArrayList<String>();
		List<Integer> l3 = new ArrayList<Integer>();
		l1 = l2;
		l1 = l3;

	}

}
