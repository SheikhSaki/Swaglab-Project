package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddandRemoveItems_AtoZ {
	
WebDriver driver;
	
	public AddandRemoveItems_AtoZ(WebDriver driver) {
		this.driver = driver;
	}

	By removeProduct2 = By.xpath("//div[@class=\"cart_item\"][2]/div/div/button");
	By removedItem2 = By.xpath("//div[@class=\"cart_item\"][2]/div/a/div");
	
	public void Sort1() {
		Sorting_Methods sort = new Sorting_Methods(driver);
		sort.Sort3_AtoZ();
	}
	
	public void AddItem1() {
		ItemList_CheckOutProcess items = new ItemList_CheckOutProcess(driver);
		items.Prod1();
		items.ProdTitle();
		String Pricetag = items.ProdPrice();
		System.out.println(Pricetag);
		items.ProdAddtoCart();
		items.BacktoProd();
	}
	
	public void AddItem2() {
		ItemList_CheckOutProcess items = new ItemList_CheckOutProcess(driver);
		items.Prod2();
		items.ProdTitle();
		String Pricetag = items.ProdPrice();
		System.out.println(Pricetag);
		items.ProdAddtoCart();
		items.BacktoProd();
	}
	
	public void AddItem3() {
		ItemList_CheckOutProcess items = new ItemList_CheckOutProcess(driver);
		items.Prod3();
		items.ProdTitle();
		String Pricetag = items.ProdPrice();
		System.out.println(Pricetag);
		items.ProdAddtoCart();
		items.BacktoProd();
	}
	
	public void AddItem4() {
		ItemList_CheckOutProcess items = new ItemList_CheckOutProcess(driver);
		items.Prod4();
		items.ProdTitle();
		String Pricetag = items.ProdPrice();
		System.out.println(Pricetag);
		items.ProdAddtoCart();
		items.BacktoProd();
		items.ProdCart();
	}
	
	public void Remove_Prod() {   //it removes the product which is at number 2
		String removedItemName2 = driver.findElement(removedItem2).getText();
		System.out.println(removedItemName2);
		driver.findElement(removeProduct2).click();
		
		String removedItemName3 = driver.findElement(removedItem2).getText();
		System.out.println(removedItemName3);
		driver.findElement(removeProduct2).click();
		
		String removedItemName4 = driver.findElement(removedItem2).getText();
		System.out.println(removedItemName4);
		driver.findElement(removeProduct2).click();
	}
	
	public void ContinueShopping() {
		ItemList_CheckOutProcess items = new ItemList_CheckOutProcess(driver);
		items.Continue_Shopping();
		items.Prod5();
		items.ProdTitle();
		items.ProdAddtoCart();
		items.BacktoProd();
		items.Prod6();
		items.ProdTitle();
		items.ProdAddtoCart();
		items.ProdCart();
	}

}


