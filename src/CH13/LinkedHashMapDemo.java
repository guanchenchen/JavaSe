package CH13;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("justin", "justin ��ӍϢ");
		map.put("momor", "momor ��ӍϢ");
		map.put("caterpillar", "caterpillar ��ӍϢ");

		for (String value : map.values()) {
			System.out.println(value);
		}
	}

}
