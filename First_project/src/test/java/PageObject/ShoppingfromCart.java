package PageObject;

import org.openqa.selenium.WebDriver;

public class ShoppingfromCart {

WebDriver driver;
	
	public ShoppingfromCart(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ShoppingFromCart() {
		ItemList_CheckOutProcess items = new ItemList_CheckOutProcess(driver);
		Sorting_Methods sort = new Sorting_Methods(driver);
		items.ProdCart();
		items.Continue_Shopping();
		sort.Sort1_LowtoHigh();
		items.Button2();
		items.Button6();
		System.out.println("Added 2 more products after sorting");
		items.ProdCart();
		items.ProdCheckOut();
		
	}

}

