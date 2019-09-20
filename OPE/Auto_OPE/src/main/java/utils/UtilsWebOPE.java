package utils;

import chromeDriver.ConnectionDriver;

public class UtilsWebOPE extends ConnectionDriver {
	
	public static void finaliza() {
		if(getDriver() != null) {
			System.out.println(">>> Eroding...");
			getDriver().close();
			getDriver().quit();
		}
	}
}
