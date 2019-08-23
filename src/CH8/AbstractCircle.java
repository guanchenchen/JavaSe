package CH8;

public abstract class AbstractCircle {
	protected double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public abstract void render();

}
