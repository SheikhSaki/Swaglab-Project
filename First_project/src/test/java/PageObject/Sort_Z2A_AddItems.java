package PageObject;

import org.openqa.selenium.WebDriver;

public class Sort_Z2A_AddItems {
	
WebDriver driver;
	
	public Sort_Z2A_AddItems(WebDriver driver) {
		this.driver = driver;
	}
	
	////*[@id='inventory_container']/div/div[last()-5]  x path for 1st item of that webpage

	public void Sort1() {
		Sorting_Methods sort = new Sorting_Methods(driver);
		sort.Sort2_ZtoA();
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
		
}


