package CH6;

public class FileFilter {
	public static void main(String[] args) {
		String[] files = { "caterpillar.jpg", "cater.gif", "bush.jpg", "wuwu.jpg", "clockman.gif" };
		System.out.print("ß^žV³öjpg™n°¸: ");
		for (int i = 0; i < files.length; i++) {
			if (files[i].endsWith("jpg")) {
				System.out.print(files[i] + " ");
			}
		}
		System.out.println("");
	}
}
