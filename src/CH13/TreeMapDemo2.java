package CH13;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		CustomComparator<String> cc = new CustomComparator<String>();
		Map<String, String> map = new TreeMap<String, String>(cc);
		map.put("justin", "justin 的訊息");
		map.put("momor", "momor 的訊息");
		map.put("caterpillar", "caterpillar 的訊息");
		for (String value : map.values()) {
			System.out.println(value);
		}

	}

}
