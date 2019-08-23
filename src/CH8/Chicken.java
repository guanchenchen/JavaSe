package CH8;

public class Chicken extends Bird {

	private String crest;

	public String getCrest() {
		return crest;
	}

	public Chicken(String name, String crest) {
		super(name);
		this.crest = crest;
	}

	public void setCrest(String crest) {
		this.crest = crest;
	}

	public Chicken() {
		// TODO Auto-generated constructor stub
	}

	public Chicken(String crest) {
		super();
		this.crest = crest;
	}

	public void wu() {
		System.out.println("¹¾¹¾½Ð¡­");
	}

}
