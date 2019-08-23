package CH13;

import java.util.EnumMap;
import java.util.Map;

enum Color {
	red, yellow, green, blue;
}

public class EnumMapDemo2 {
	public static void main(String[] args) {
		Map<Color, String> enumMap = new EnumMap<Color, String>(Color.class);
		enumMap.put(Color.green, "绿色");
		enumMap.put(Color.yellow, "黄色");
		enumMap.put(Color.red, "红色");
		enumMap.put(Color.blue, "蓝色");

		for (String value : enumMap.values()) {
			System.out.println(value);
		}
	}

}
