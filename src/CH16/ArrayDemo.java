package CH16;

public class ArrayDemo {
	public static void main(String[] args) {
		short[] sArr = new short[5];
		int[] iArr = new int[5];
		long[] lArr = new long[5];
		float[] fArr = new float[5];
		double[] dArr = new double[5];
		byte[] bArr = new byte[5];
		boolean[] zArr = new boolean[5];
		String[] strArr = new String[5];

		System.out.println("short ���e��" + sArr.getClass());
		System.out.println("int ���e��" + iArr.getClass());
		System.out.println("long ���e��" + lArr.getClass());
		System.out.println("float ���e��" + fArr.getClass());
		System.out.println("double ���e��" + dArr.getClass());
		System.out.println("byte ���e��" + bArr.getClass());
		System.out.println("boolean ���e��" + zArr.getClass());
		System.out.println("String ���e��" + strArr.getClass());

	}
}
