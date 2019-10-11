package utils;

import chromeDriver.ConnectionDriver;

public class UtilsWebOPE extends ConnectionDriver {
	
	public static void finaliza() {
		if(getDriver() != null) {
			System.out.println(">>> ERODING... <<<");
			getDriver().close();
			getDriver().quit();
		}
	}
}
