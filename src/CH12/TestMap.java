package CH12;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "111");
		map.put(2, "222");
		map.put(3, "333");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer i = entry.getKey();
			String str = entry.getValue();
		}
	}

}
