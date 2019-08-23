package CH16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FactoryTest {

	public static void main(String[] args) {
		Cats cats;
		try {
			cats = FactoryTest.getInstance(getPro().getProperty("tiger"));
			if (cats != null) {
				cats.eatMeat();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/*
		 * The Result : The tiger eat meat.
		 */
	}

	public static Cats getInstance(String name) {
		Cats cats = null;
		try {
			try {
				// use Class.forName() with java reflection
				cats = (Cats) Class.forName(name).newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return cats;
	}

	public static Properties getPro() throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		File f = new File("cats.properties");
		if (f.exists()) {
			pro.load(new FileInputStream(f));
		} else {
			pro.setProperty("lion", "com.b510.hongten.test.reflex.Lion");
			pro.setProperty("tiger", "com.b510.hongten.test.reflex.Tiger");
			pro.store(new FileOutputStream(f), "FRUIT CLASS");
		}
		return pro;
	}
}

interface Cats {
	public abstract void eatMeat();
}

class Tiger implements Cats {

	public void eatMeat() {
		System.out.println("The tiger eat meat.");
	}

}

class Lion implements Cats {

	public void eatMeat() {
		System.out.println("The lion eat meat.");
	}

}