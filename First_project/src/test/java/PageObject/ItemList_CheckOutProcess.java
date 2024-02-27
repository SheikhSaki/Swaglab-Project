package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemList_CheckOutProcess {
	
WebDriver driver;
	
	public ItemList_CheckOutProcess(WebDriver driver) {
		this.driver  = driver;
	}//div[@class='pricebar']/button[1]
		
		

		By Item1 = By.xpath("//*[@id='inventory_container']/div/div[1]/div/a");
		By Item2 = By.xpath("//*[@id='inventory_container']/div/div[2]/div/a");
		By Item3 = By.xpath("//*[@id='inventory_container']/div/div[3]/div/a");
		By Item4 = By.xpath("//*[@id='inventory_container']/div/div[4]/div/a");
		By Item5 = By.xpath("//*[@id='inventory_container']/div/div[5]/div/a");
		By Item6 = By.xpath("//*[@id='inventory_container']/div/div[6]/div/a");
		By Title = By.xpath("//div[@class='inventory_details_name large_size']");
		By Price = By.xpath("//div[@class='inventory_details_price']");
		By AddtoCart = By.xpath("//button[@class=\"btn btn_primary btn_small btn_inventory\"]");
		By backToproducts = By.id("back-to-products");
		By cart = By.xpath("//a[@class=\"shopping_cart_link\"]");
		By checkOut = By.id("checkout");
		By name1st = By.id("first-name");
		By nameLast = By.id("last-name");
		By zipCode = By.id("postal-code");
		By continueOrder = By.id("continue");
		By total = By.xpath("//div[@class=\"summary_info_label summary_total_label\"]");
		By finish = By.id("finish");
		By backtoHomePage = By.id("back-to-products");
		By ContinueShopping = By.id("continue-shopping");
		By button1 = By.xpath("//*[@id='inventory_container']/div/div[1]/div[2]/div[2]/button");
		By button2 = By.xpath("//*[@id='inventory_container']/div/div[2]/div[2]/div[2]/button");
		By button3 = By.xpath("//*[@id='inventory_container']/div/div[3]/div[2]/div[2]/button");
		By button4 = By.xpath("//*[@id='inventory_container']/div/div[4]/div[2]/div[2]/button");
		By button5 = By.xpath("//*[@id='inventory_container']/div/div[5]/div[2]/div[2]/button");
		By button6 = By.xpath("//*[@id='inventory_container']/div/div[6]/div[2]/div[2]/button");
		
		
	
	public void Prod1() {
		driver.findElement(Item1).click();
	}
	
	public void Prod2() {
		driver.findElement(Item2).click();
	}
	
	public void Prod3() {
		driver.findElement(Item3).click();
	}
	
	public void Prod4() {
		driver.findElement(Item4).click();
	}

	public void Prod5() {
		driver.findElement(Item5).click();
	}
	
	public void Prod6() {
		driver.findElement(Item6).click();
	}
	
	public void ProdTitle() {
		String title = driver.findElement(Title).getText();
		System.out.println(title);
	}
	
	public String ProdPrice() {
		return driver.findElement(Price).getText();
	}
	
	public void ProdAddtoCart() {
		driver.findElement(AddtoCart).click();
	}
	
	public void BacktoProd() {
		driver.findElement(backToproducts).click();
	}
	
	public void ProdCart() {
		driver.findElement(cart).click();
	}
	
	public void ProdCheckOut() {
		driver.findElement(checkOut).click();
	}
	
	public void First_Name(String name) {
		driver.findElement(name1st).sendKeys(name);
	}
	
	public void Last_Name(String lname) {
		driver.findElement(nameLast).sendKeys(lname);
	}
	
	public void Pin_Code(String postal_Code) {
		driver.findElement(zipCode).sendKeys(postal_Code);
	}
	
	public void Order_Continue() {
		driver.findElement(continueOrder).click();
	}
	
	public String Prod_Total() {
		return driver.findElement(total).getText();
	}
	
	public void Finish_Order() {
		driver.findElement(finish).click();
	}
	
	public void BacktoHomePage() {
		driver.findElement(backtoHomePage).click();
	}
	
	public void Continue_Shopping() {
		driver.findElement(ContinueShopping).click();
	}
	
	public void Button1() {
		driver.findElement(button1).click();
	}
	
	public void Button2() {
		driver.findElement(button2).click();
	}
	
	public void Button3() {
		driver.findElement(button3).click();
	}
	
	public void Button4() {
		driver.findElement(button4).click();
	}
	
	public void Button5() {
		driver.findElement(button5).click();
	}
	
	public void Button6() {
		driver.findElement(button6).click();
	}
}


