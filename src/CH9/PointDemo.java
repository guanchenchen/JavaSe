package CH9;

public class PointDemo {

	public void showPoints() {
		for (int i = 0; i < points.length; i++) {
			System.out.printf("Point[%d]: x = %d, y = %d%n", i, points[i].getX(), points[i].getY());
		}
	}

	private class Point {
		private int x, y;

		public Point() {
			// TODO Auto-generated constructor stub
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public void setPoint(int i, int j) {
			this.x = x;
			this.y = y;

		}

	}

	private Point[] points;

	public PointDemo(int length) {
		// TODO Auto-generated constructor stub
		points = new Point[length];

		for (int i = 0; i < points.length; i++) {
			points[i] = new Point();
			points[i].setPoint(i * 5, i * 5);
		}
	}

}
