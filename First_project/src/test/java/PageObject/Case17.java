package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Case17 {
	
WebDriver driver;
	
	public Case17(WebDriver driver) {
		this.driver = driver;
	}
	
	By error = By.xpath("//svg[@focusable=\"false\"]");
	String errorMsg = "Epic sadface: Username and password do not match any user in this service";
 	
	public void Data_provider() {
		String userID1 = "locked_out_user";
		String userID2 = "error_user";
		String userID3 = "standard_user";
		
		if (driver.findElement(error).equals(errorMsg)) {
			System.out.println("Please use another login credentials");
		}
	}

}


