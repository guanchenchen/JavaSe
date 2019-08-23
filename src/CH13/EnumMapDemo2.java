package CH13;

import java.util.EnumMap;
import java.util.Map;

enum Color {
	red, yellow, green, blue;
}

public class EnumMapDemo2 {
	public static void main(String[] args) {
		Map<Color, String> enumMap = new EnumMap<Color, String>(Color.class);
		enumMap.put(Color.green, "��ɫ");
		enumMap.put(Color.yellow, "��ɫ");
		enumMap.put(Color.red, "��ɫ");
		enumMap.put(Color.blue, "��ɫ");

		for (String value : enumMap.values()) {
			System.out.println(value);
		}
	}

}
