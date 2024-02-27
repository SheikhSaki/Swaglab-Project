package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class About {
	
WebDriver driver;
	
	public About(WebDriver driver) {
		this.driver = driver;
	}
	
	By btnAbout = By.id("react-burger-menu-btn");
	By about = By.id("about_sidebar_link");

	public void buttonAbout() {
		driver.findElement(btnAbout).click();
	}
	
	public void About() {
		driver.findElement(about).click();
	}
}


