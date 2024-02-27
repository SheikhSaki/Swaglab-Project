package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Request_Demo {
	
	WebDriver driver;
	
	public Request_Demo(WebDriver driver) {
		this.driver = driver;
		}
	
	By demo = By.xpath("//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedDark MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-disableElevation MuiButton-root MuiButton-outlined MuiButton-outlinedDark MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-disableElevation css-1r365wf\"]");
	By email_demo = By.xpath("//input[@name=\"Email\"]");
	By firstName = By.id("FirstName");
	By lastName = By.id("LastName");
	By company = By.id("Company");
	By phoneNum = By.id("Phone");
	By comments = By.id("Sales_Contact_Comments__c");
	By checkBox = By.id("LblmktoCheckbox_40726_0");
	By submit = By.xpath("//button[@type='submit']");
	By cross = By.xpath("//div[@class=\"sc-bgqQcB sc-gTRrQi IUJkD fBDdCu\"]");
	
	public void demonstration() {
		driver.findElement(demo).click();
	}
	
	public void Emailid(String emailId) {
		driver.findElement(email_demo).sendKeys(emailId);
	}
	
	public void FName(String fName) {
		driver.findElement(firstName).sendKeys(fName);
	}
	
	public void LName(String lName) {
		driver.findElement(lastName).sendKeys(lName);
	}
	
	public void Company_d(String CompName) {
		driver.findElement(company).sendKeys(CompName);
	}
	
	public void Company_Num(String num) {
		driver.findElement(phoneNum).sendKeys(num);
	}
	
	public void Comments(String comment) {
		driver.findElement(comments).sendKeys(comment);
	}
	
	public void CheckBox() {
		driver.findElement(checkBox).click();
	}
	
	public void Submit() {
		driver.findElement(submit).click();
	}
	
	public void cross() {
		driver.findElement(cross).click();
	}
}


