package CH11;

public class DetailActionDemo {
	public static void main(String[] args) {
		for (DetailAction daction : DetailAction.values()) {
			System.out.println(daction.getDes());
		}
	}

}
