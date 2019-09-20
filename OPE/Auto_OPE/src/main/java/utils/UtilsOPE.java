package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UtilsOPE {
	
	public static void sleep(int time, String msg) {
		try {
			System.out.println((msg.isEmpty() ? "Wating..." : msg));
			Thread.sleep(time);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage() + "\n" + e);
		}
	}
	
	public static Properties load(String way) {
		Properties p = new Properties();
		try(InputStream aqr = new FileInputStream(new File(way))) {
			p.load(aqr);
			return p;
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + "\n" + e);
		} catch (IOException e) {
			System.err.println(e.getMessage() + "\n" + e);
		}
		return null;
	}
}