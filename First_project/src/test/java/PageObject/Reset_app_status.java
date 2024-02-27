package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Reset_app_status {
	
	WebDriver driver;

	public Reset_app_status(WebDriver driver) {
		this.driver = driver;
	}
	
	By btnAbout = By.id("react-burger-menu-btn");
	By reset = By.id("reset_sidebar_link");

	public void Reset_App() {
		ItemList_CheckOutProcess items = new ItemList_CheckOutProcess(driver);
		items.Continue_Shopping();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(btnAbout).click();
		driver.findElement(reset).click();
	}
}


