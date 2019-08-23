package CH6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsePatternMatcher {
	public static void main(String[] args) {
		String phones1 = "Justin 的手機號碼：0939-100391\n" + "momor 的手機號碼：0939-666888\n";
		Pattern p = Pattern.compile(".*0939-\\d{6}");
		Matcher m = p.matcher(phones1);
		while (m.find()) {
			System.out.println(m.group());
		}
		String phones2 = "caterpillar 的手機號碼：0952-600391\n" + "bush 的手機號碼：0939-550391";
		m = p.matcher(phones2);
		while (m.find()) {
			System.out.println(m.group());
		}
	}

}
