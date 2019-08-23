package CH6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {
	public static void main(String[] args) {
		String text = "abcdebcadxbc";
		Pattern p = Pattern.compile(".bc");
		Matcher m = p.matcher(text);
		while (m.find()) {
			System.out.println(m.group());
		}
		System.out.println();
	}

}
