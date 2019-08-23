package CH13;

import java.util.EnumSet;

enum FontConstant {
	Plain, Bold, Italic;
}

public class EnumSetDemo {
	public static void main(String[] args) {
		EnumSet<FontConstant> enumSet = EnumSet.of(FontConstant.Plain, FontConstant.Bold);
		showEnumSet(enumSet);
	}

	private static void showEnumSet(EnumSet<FontConstant> enumSet) {
		// TODO Auto-generated method stub
		for (FontConstant constant : enumSet) {
			System.out.println(constant);
		}
		System.out.println();

	}

}
