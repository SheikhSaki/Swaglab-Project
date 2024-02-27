package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScrollDown {

	
	
WebDriver driver;
	
	public ScrollDown(WebDriver driver) {
		this.driver = driver;
	}

	By twitter = By.xpath("//a[@href=\"https://twitter.com/saucelabs\"]");
	
	public void Tweet() {
		driver.findElement(twitter).click();
	}
}
