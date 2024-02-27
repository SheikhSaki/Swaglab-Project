package PageObject;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestExecution {
	
WebDriver driver;
	
	@BeforeTest
		public void Launch() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
	}
		
	@Test 
	public void a_Login_test1() {
		Login log = new Login(driver);
		log.uName("standard_user");
		log.passwd("secret_sauce");
		log.LogIn();
		System.out.println("Logged In successfully");
		System.out.println("");
	}
	
	@Test 
	public void b_About() {
		About about = new About(driver);
		about.buttonAbout();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		about.About();
	}
	
	@Test
	public void c_Demo() {
		Request_Demo demoreq = new Request_Demo(driver);
		demoreq.demonstration();
		demoreq.Emailid("anytymsakib@gmail.com");
		demoreq.FName("sakib");
		demoreq.LName("Sheikh");
		demoreq.Company_d("abc");
		demoreq.Company_Num("1234567891");
		Select dropDown = new Select(driver.findElement(By.id("Country")));
		dropDown.selectByVisibleText("India");
		Select dropDown1 = new Select(driver.findElement(By.id("Solution_Interest__c")));
		dropDown1.selectByVisibleText("Sauce API Quality");
		demoreq.Comments("Successfully filled all the data by automation");
		demoreq.CheckBox();
		demoreq.Submit();
		System.out.println("Demo Invite Sent Succcessfully");
		System.out.println("");
		driver.switchTo().frame("chilipiper-frame");
		demoreq.cross();
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test
	public void d_Sorting() {
		Sort_Prnt sortPrint = new Sort_Prnt(driver);
		System.out.println("Products are getting sorted by following methods: ");
		sortPrint.Sort1();
		sortPrint.Sort2();
		sortPrint.Sort3();
		sortPrint.Sort4();
	}

	@Test
	public void e_LowtoHigh() {
		SortItems_LowtoHigh items = new SortItems_LowtoHigh(driver);
		System.out.println("");
		System.out.println("Product which is present at number 2 Before Sort: ");
		items.fstItem();
		items.Sort1();
		System.out.println("Product which is present at number 2 After Sort: ");
		items.fstItem();
	}
	
	@Test
	public void f_AddItem_L2H() {
		Sort_Z2A_AddItems case6 = new Sort_Z2A_AddItems(driver);
		System.out.println("");
		case6.Sort1();
		case6.AddItem1();
		case6.Sort1();
		case6.AddItem2();
		case6.Sort1();
		case6.AddItem3();
	}
	
	@Test
	public void g_CheckOut_fstOrder() {
		Checkout order = new Checkout(driver);
		System.out.println("");
		order.CheckOutOrder1();
		System.out.println("Order is successfully placed");
	}
	

	@Test
	public void h_Price_H2L() {
		Sort_Price_H2L_AddItems case8 = new Sort_Price_H2L_AddItems(driver);
		System.out.println("");
		case8.Sort1();
		case8.AddItem4();
		case8.Sort1();
		case8.AddItem5();
		case8.Sort1();
		case8.AddItem6();
	}
	
	@Test
	public void i_Checkout_Order() {
		Checkout2 case9 = new Checkout2(driver);
		System.out.println("");
		case9.CheckOutOrder1();
	}
	
	@Test
	public void j_CheckOut_order() {
		AddandRemoveItems_AtoZ case10 = new AddandRemoveItems_AtoZ(driver);
		System.out.println("");
		case10.Sort1();
		case10.AddItem1();
		case10.Sort1();
		case10.AddItem2();
		case10.Sort1();
		case10.AddItem3();
		case10.Sort1();
		case10.AddItem4();
		case10.Remove_Prod();
		System.out.println("Products removed successfully");
		case10.ContinueShopping();
	}
	
	@Test
	public void k_Reset_AppStatus() {
		Reset_app_status case11 = new Reset_app_status(driver);
		System.out.println("");
		case11.Reset_App();
		driver.navigate().refresh();
		System.out.println("App state is reset");
	}
	
	@Test
	public void l_AddButton() {
		AddBtn case12 = new AddBtn(driver);
		System.out.println("");
		case12.addItemfromProductPage();
	}
	
	@Test
	public void m_case13() {
	    ShoppingfromCart case13 = new ShoppingfromCart(driver);
		System.out.println("");
		case13.ShoppingFromCart();
	}
	
	@Test
	public void n_case14() {
		cancel case14 = new cancel(driver);
		System.out.println("");
		case14.AddItems();
	}
		
	@Test
	public void o_case15 () {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		ScrollDown tweetx = new ScrollDown(driver);
		tweetx.Tweet();
		String windowHandle = driver.getWindowHandle(); 
		ArrayList tabs = new ArrayList (driver.getWindowHandles()); //Get the list of window handles
		System.out.println(tabs.size());
		driver.switchTo().window(windowHandle);  //Switch back to original window	
	}
	
	@Test
	public void p_case16_logout() {
		Logout logout = new Logout(driver);
		logout.Logout();
	}
	
	@Test(dataProvider="testdata") 
	public void p_case17_Data_Provide(String name, String pass) {
		Login login = new Login(driver);
		
		login.uName(name);
		login.passwd(pass);
		login.LogIn();
	//	login.Clear();
	}
	
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
	Login log = new Login(driver);
	Object [][] logindata=new Object[2][2];
	// Enter data to row 1 column 0
	logindata[1][0]="standard_user";
	// Enter data to row 1 column 0
	logindata[1][1]="secret_sauce"; 	
	// return arrayobject to testscript
	return logindata;		
	}
}


