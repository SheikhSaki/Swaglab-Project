package PageObject;

import org.openqa.selenium.WebDriver;

public class Checkout {
	
	WebDriver driver;

	public Checkout(WebDriver driver) {
		this.driver = driver;
	}

	public void CheckOutOrder1() {
		ItemList_CheckOutProcess items=new ItemList_CheckOutProcess (driver);
		items.ProdCart();
		items.ProdCheckOut();
		items.First_Name("Sakib");
		items.Last_Name("Sheikh");
		items.Pin_Code("41378654");
		items.Order_Continue();
		String Total=items.Prod_Total();
		System.out.println(Total);
		items.Finish_Order();
		items.BacktoHomePage();
	
	}
}


