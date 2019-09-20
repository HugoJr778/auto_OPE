package chromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConnectionDriver extends Driver {

	public void setUpDriver() {
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("use-fake-ui-for-media-stream");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		setDriver(new ChromeDriver(options));
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		setElements(PageFactory.initElements(getDriver(), Elements.class));
		setWait(new WebDriverWait(getDriver(), 60));
	}

	public void setUpUrl(String string) {
		getDriver().get(string);
	}
	public void close() {
		getDriver().close();
	}
	public void timeouts(By locator) {
		getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public void click(By by) {
		timeouts(by);
		getDriver().findElement(by).click();
	}
	public void sendKeys(By by, String string) {
		timeouts(by);
		getDriver().findElement(by).sendKeys(string);
	}
	public void isPresentAndClick(By by) {
		timeouts(by);
		if (getDriver().findElement(by).isDisplayed()) {
			getDriver().findElement(by).click();
		}
	}
}