package CH13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("caterpillar", "caterpillar ��ӍϢ");
		map.put("justin", "justin ��ӍϢ");
		map.put("momor", "momor ��ӍϢ");
		Collection coll = map.values();
		Iterator it = coll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
