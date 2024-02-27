package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddBtn {
	
WebDriver driver;
	
	public AddBtn(WebDriver driver) {
		this.driver = driver;
	}
	
	By cancel = By.id("cancel");
	
	public void addItemfromProductPage() {
		ItemList_CheckOutProcess items = new ItemList_CheckOutProcess(driver);
		items.Button1();
		items.Button2();
		items.Button3();
		items.Button4();
		items.Button5();
		items.Button6();
		System.out.println("We have added all the products in cart");
		items.ProdCart();
		items.ProdCheckOut();
		driver.findElement(cancel).click();
		items.Continue_Shopping();
		items.Button2();
		items.Button4();
		items.Button5();
		System.out.println("We removed 3 products");
		items.ProdCart();
		items.ProdCheckOut();
		items.First_Name("Sakib");
		items.Last_Name("Sheikh");
		items.Pin_Code("87654098");
		items.Order_Continue();
		items.Finish_Order();
		System.out.println("Order is successfully placed");
		items.BacktoHomePage();		
	}
}


