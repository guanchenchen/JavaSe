package CH13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("caterpillar", "caterpillar 的訊息");
		map.put("justin", "justin 的訊息");
		map.put("momor", "momor 的訊息");
		Collection coll = map.values();
		Iterator it = coll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
