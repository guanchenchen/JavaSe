package CH8;

public class HollowCircle extends AbstractCircle {
	public HollowCircle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.printf("��һ���돽 %f �Ŀ��ĈA\n", getRadius());

	}

}
