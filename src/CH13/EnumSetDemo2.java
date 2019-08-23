package CH13;

import java.util.EnumSet;

enum FontConstants {
	Plain, Bold, Italic
}

public class EnumSetDemo2 {
	public static void main(String[] args) {
		EnumSet<FontConstants> enumSet = EnumSet.noneOf(FontConstants.class);
		// º”»Î¡–≈e
		enumSet.add(FontConstants.Bold);
		enumSet.add(FontConstants.Italic);
		showEnumSet(enumSet);
	}

	private static void showEnumSet(EnumSet<FontConstants> enumSet) {
		// TODO Auto-generated method stub
		for (FontConstants constant : enumSet) {
			System.out.println(constant);
		}
		System.out.println();

	}

}
