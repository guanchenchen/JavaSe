package CH8;

public class ConcreteCircle extends AbstractCircle {

	public ConcreteCircle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		System.out.printf("®‹Ò»‚€°ë½ %f µÄŒĞÄˆA\n", getRadius());

	}

}
