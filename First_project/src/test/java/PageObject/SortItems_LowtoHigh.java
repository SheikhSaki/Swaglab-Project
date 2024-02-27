package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortItems_LowtoHigh {
	
WebDriver driver;
	
	public SortItems_LowtoHigh(WebDriver driver) {
		this.driver = driver;
	}
	
	By Num1 = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]");
	By Num2 = By.xpath("//*[@id=\"inventory_container\"]/div/div[2]");
	By Num3 = By.xpath("//*[@id=\"inventory_container\"]/div/div[3]");
	
	
	
	public void Sort1() {
		Sorting_Methods sort = new Sorting_Methods(driver);
		sort.Sort1_LowtoHigh();
		
	}

	public void fstItem() {
		String abc = driver.findElement(Num2).getText();
		System.out.println(abc);
	}
}


