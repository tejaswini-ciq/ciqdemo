package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Home_Screen_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Home_Screen_Elements")
	public static WebElement Home_Screen_Elements;

public void verify_Home_Screen_Elements(String data){
		Assert.assertEquals(Home_Screen_Elements,Home_Screen_Elements);
}

public void verify_Home_Screen_Elements_Status(String data){
		//Verifies the Status of the Home_Screen_Elements
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Home_Screen_Elements.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Home_Screen_Elements.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Home_Screen_Elements.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Home_Screen_Elements.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Left_Menu")
	public static WebElement Left_Menu;

public void click_Left_Menu(){
		Left_Menu.click();
}

@FindBy(how= How.ID, using = "Navigation_Bar")
	public static WebElement Navigation_Bar;

public void click_Navigation_Bar(){
		Navigation_Bar.click();
}

@FindBy(how= How.ID, using = "MiddleFrame")
	public static WebElement MiddleFrame;

public void click_MiddleFrame(){
		MiddleFrame.click();
}

@FindBy(how= How.ID, using = "Right_Frame")
	public static WebElement Right_Frame;

public void click_Right_Frame(){
		Right_Frame.click();
}

@FindBy(how= How.ID, using = "OpenAcc")
	public static WebElement OpenAcc;

public void verify_OpenAcc_Status(String data){
		//Verifies the Status of the OpenAcc
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OpenAcc.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OpenAcc.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OpenAcc.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OpenAcc.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OpenAcc(){
		OpenAcc.click();
}

@FindBy(how= How.ID, using = "TransferFunds")
	public static WebElement TransferFunds;

public void verify_TransferFunds_Status(String data){
		//Verifies the Status of the TransferFunds
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TransferFunds.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TransferFunds.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TransferFunds.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TransferFunds.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_TransferFunds(){
		TransferFunds.click();
}

@FindBy(how= How.ID, using = "Logout")
	public static WebElement Logout;

public void verify_Logout_Status(String data){
		//Verifies the Status of the Logout
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Logout.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Logout.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Logout.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Logout.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Logout(){
		Logout.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}