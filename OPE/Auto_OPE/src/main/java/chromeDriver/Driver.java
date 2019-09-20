package chromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {
	
	private static WebDriver driver;
	private WebDriverWait wait;
	private Elements elements;
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver drivera) {
		driver = drivera;
	}
	public WebDriverWait getWait() {
		return wait;
	}
	public void setWait(WebDriverWait wait) {
		this.wait = wait;
	}
	public Elements getElements() {
		return elements;
	}
	public void setElements(Elements pageDialerWeb) {
		this.elements = pageDialerWeb;
	}
}