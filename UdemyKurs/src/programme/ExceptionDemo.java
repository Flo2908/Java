package programme;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

	public static void main(String[] args) {
		Object o = null;
		check(o);
	}

	static void check(Object o) {
		boolean b = false;
		try {
			o.toString();
			System.out.println(o);
		} catch (Exception e) {
			e.printStackTrace();
			b = true;
		} finally {
			if (b) {
				o = new String("Hallo");
				check(o);
			}
		}
	}

	static void checked() throws FileNotFoundException {

//		try {
//			FileReader r = new FileReader(new File("c:aefhaw.ja"));
//		}catch(FileNotFoundException e) {
//			throw e;
//		}
		FileReader r = new FileReader(new File("aöljeifkdkejf"));
		throw new NullPointerException();
	}
}
