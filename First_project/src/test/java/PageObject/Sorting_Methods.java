package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Sorting_Methods {

	
	WebDriver driver;
	
	public Sorting_Methods(WebDriver driver) {
	this.driver = driver;
}

By sort = By.xpath("//select[@data-test=\"product_sort_container\"]");

public void Sort1_LowtoHigh() {
	Select dropSort1 = new Select(driver.findElement(sort));
	dropSort1.selectByVisibleText("Price (low to high)");
	System.out.println("Sorted By - Price (low to high)");
}

public void Sort2_ZtoA() {
	Select dropSort2 = new Select(driver.findElement(sort));
	dropSort2.selectByVisibleText("Name (Z to A)");
	System.out.println("Sorted By - Name (Z to A)");
}

public void Sort3_AtoZ() {
	Select dropSort3 = new Select(driver.findElement(sort));
	dropSort3.selectByVisibleText("Name (A to Z)");
	System.out.println("Sorted By - Name (A to Z)");
}

public void Sort4_HightoLow() {
	Select dropSort4 = new Select(driver.findElement(sort));
	dropSort4.selectByVisibleText("Price (high to low)");
	System.out.println("Sorted By - Price (high to low)");
}
}

