package CH6;

public class CharAtString {
	public static void main(String[] args) {
		String text = "One's left brain has nothing right.\n" + "One's right brain has nothing left.\n";
		System.out.println("×Ö´®ƒÈÈÝ: ");
		for (int i = 0; i < text.length(); i++) {
			System.out.print(text.charAt(i) + " ,");
		}
		System.out.println();
		System.out.println(text.indexOf("left"));
		System.out.println(text.lastIndexOf("left"));

		char[] ch = text.toCharArray();
		System.out.println("\n×ÖÔªArrayƒÈÈÝ: ");
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

}
