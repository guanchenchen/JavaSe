package CH13;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		CustomComparator<String> cc = new CustomComparator<String>();
		Map<String, String> map = new TreeMap<String, String>(cc);
		map.put("justin", "justin ��ӍϢ");
		map.put("momor", "momor ��ӍϢ");
		map.put("caterpillar", "caterpillar ��ӍϢ");
		for (String value : map.values()) {
			System.out.println(value);
		}

	}

}
