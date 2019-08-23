package CH9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollections {
	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("111");
		list.add(123);
		list.add(new String("test"));

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("==================");

		Map<String, String> map = new HashMap<String, String>();
		map.put("熊大", "棕色");
		map.put("熊二", "黄色");
		System.out.println("map的遍历方式");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ";" + value);

		}

		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
		}

		System.out.println("==================");
		// 遍历key
		Set set = map.keySet();
		Iterator its = set.iterator();
		while (its.hasNext()) {
			System.out.println(its.next());
		}

		System.out.println("==================");
		// 遍历value
		Collection coll = map.values();
		Iterator it1 = coll.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		System.out.println("==================");
		// 遍历key-value

	}

}
