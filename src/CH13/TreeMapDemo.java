package CH13;

import java.util.HashMap;
import java.util.Map;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("justin", "justin ��ӍϢ");
		map.put("momor", "momor ��ӍϢ");
		map.put("caterpillar", "caterpillar ��ӍϢ");

		for (String value : map.values()) {
			System.out.println(value);
		}
	}

}
