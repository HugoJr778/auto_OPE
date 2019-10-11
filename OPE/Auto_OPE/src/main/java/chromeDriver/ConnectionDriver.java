package chromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConnectionDriver extends Driver {

	public void setUpDriver() {
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 1);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("use-fake-ui-for-media-stream");
		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\chromeDriver\\chromedriver.exe");
		setDriver(new ChromeDriver(options));
		System.out.println(">>> INITIALIZED CHROME DRIVER <<<");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		setWait(new WebDriverWait(getDriver(), 60));
	}

	public void setUpUrl(String url) {
		getDriver().get(url);
	}
	public void close() {
		getDriver().close();
	}
	public void timeouts(By locator) {
		if(getWait() == null) {
			setWait(new WebDriverWait(getDriver(), 60));
			getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
		} else 
			getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public void click(By element) {
		timeouts(element);
		getDriver().findElement(element).click();
	}
	public void sendKeys(By element, String value) {
		timeouts(element);
		getDriver().findElement(element).sendKeys(value);
	}
	public void isPresentAndClick(By element) {
		timeouts(element);
		if (getDriver().findElement(element).isDisplayed()) {
			getDriver().findElement(element).click();
		}
	}
	public void selectValue(By element, String option) {
		new Select(getDriver().findElement(element)).selectByVisibleText(option);
	}
	public void clickCheckBox(By element) {
		if(!getDriver().findElement(element).isSelected()) {
			click(element);
		}
	}
	public void scroll(int pxInitial, int pxFinal) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		System.out.println(">>> Rolling...");
		js.executeScript(getElements().scriptScroll() + "(" + pxInitial + "," + pxFinal + ")");
	}
	public String getValue(By element) {
		WebElement x = getDriver().findElement(element);
		String attribute = x.getText();
		if(attribute == null) {
			return "";
		} else if(attribute.isEmpty()) {
			return "";
		} else {
			return attribute;
		}
	}
	public boolean isSelect(By element) {
		boolean result = getDriver().findElement(element).isSelected();
		return result;
	}
}