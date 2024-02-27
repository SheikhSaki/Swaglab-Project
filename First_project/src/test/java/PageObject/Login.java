package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		}
	
	By username = By.id("user-name");
	By password = By.id("password");
	By submit = By.id("login-button");
	
	
	public void uName(String name) {
		driver.findElement(username).sendKeys(name);
		}
	
	public void passwd(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void LogIn() {
		driver.findElement(submit).click();
	}
	
	public void Clear() {
		driver.findElement(username).clear();
		driver.findElement(password).clear();
	}
}


