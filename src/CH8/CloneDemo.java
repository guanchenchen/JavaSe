package CH8;

public class CloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Table table = new Table();
		table.setCenter(new Point(3, 5));
		Point originalCenter = table.getCenter();
		Table cloneTable = (Table) table.clone();
		Point clonedCenter = cloneTable.getCenter();

		System.out.printf("ԭ���Table���ģ�(%d, %d)\n", originalCenter.getX(), originalCenter.getY());
		System.out.printf("�}�u��Table���ģ�(%d, %d)\n", clonedCenter.getX(), clonedCenter.getY());

		clonedCenter.setX(10);
		clonedCenter.setY(10);

		System.out.printf("ԭ���Table���ģ�(%d, %d)\n", originalCenter.getX(), originalCenter.getY());
		System.out.printf("�}�u��Table���ģ�(%d, %d)\n", clonedCenter.getX(), clonedCenter.getY());
	}
}
