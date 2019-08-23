package CH6;

public class SplitStringDemo {
	public static void main(String[] args) {
		String[] fakeFileData = { "justin\t64/5/26\t0939002302\t5433343", "momor\t68/7/23\t0939100391\t5432343" };
		for (String data : fakeFileData) {
			String[] str = data.split("\t");

			for (String str2 : str) {
				System.out.print(str2 + "\t| ");
			}
			System.out.println();
		}
	}

}
