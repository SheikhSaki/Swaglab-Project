package PageObject;

import org.openqa.selenium.WebDriver;

public class Sort_Price_H2L_AddItems {
	
	
WebDriver driver;
	
	
	public Sort_Price_H2L_AddItems(WebDriver driver) {
		this.driver = driver;
	}

	public void Sort1() {
		Sorting_Methods sort = new Sorting_Methods(driver);
		sort.Sort4_HightoLow();
	}
	
	public void AddItem4() {
		ItemList_CheckOutProcess items = new ItemList_CheckOutProcess(driver);
		items.Prod4();
		items.ProdTitle();
		String Pricetag = items.ProdPrice();
		System.out.println(Pricetag);
		items.ProdAddtoCart();
		items.BacktoProd();
	}
	
	
	public void AddItem5() {
		ItemList_CheckOutProcess items = new ItemList_CheckOutProcess(driver);
		items.Prod5();
		items.ProdTitle();
		String Pricetag = items.ProdPrice();
		System.out.println(Pricetag);
		items.ProdAddtoCart();
		items.BacktoProd();
	}
	
	
	public void AddItem6() {
		ItemList_CheckOutProcess items = new ItemList_CheckOutProcess(driver);
		items.Prod6();
		items.ProdTitle();
		String Pricetag = items.ProdPrice();
		System.out.println(Pricetag);
		items.ProdAddtoCart();
		items.BacktoProd();
	}

}


