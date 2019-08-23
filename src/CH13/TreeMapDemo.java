package CH13;

import java.util.HashMap;
import java.util.Map;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("justin", "justin 的訊息");
		map.put("momor", "momor 的訊息");
		map.put("caterpillar", "caterpillar 的訊息");

		for (String value : map.values()) {
			System.out.println(value);
		}
	}

}
