package CH7;

public class GcTest {

	private String name;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		GcTest gc = new GcTest("��������");
		gc.finalize();
	}

	public GcTest(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println(name + "������");
	}

}
