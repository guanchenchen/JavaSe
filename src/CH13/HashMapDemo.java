package CH13;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("caterpillar", "caterpillar ��ӍϢ");
		map.put("justin", "justin ��ӍϢ");
		System.out.println(map.get("caterpillar"));
		System.out.println(map.get("justin"));

	}

}
