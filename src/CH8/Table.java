package CH8;

public class Table implements Cloneable {

	private Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Object clone() throws CloneNotSupportedException {

		Table t = (Table) super.clone();
		if (this.center != null) {

			t.center = (Point) center.clone();
		}

		return t;

	}

}
