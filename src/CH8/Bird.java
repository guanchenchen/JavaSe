package CH8;

public class Bird {
	private String name;

	public Bird() {
		// TODO Auto-generated constructor stub
	}

	public Bird(String name) {
		super();
		this.name = name;
	}

	public void walk() {
		System.out.println("��·");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
