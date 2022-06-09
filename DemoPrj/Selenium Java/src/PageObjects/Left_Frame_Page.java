package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Left_Frame_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Settings")
	public static WebElement Settings;

public void verify_Settings_Status(String data){
		//Verifies the Status of the Settings
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Settings.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Settings.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Settings.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Settings.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Settings(){
		Settings.click();
}

@FindBy(how= How.ID, using = "Home")
	public static WebElement Home;

public void verify_Home_Status(String data){
		//Verifies the Status of the Home
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Home.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Home.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Home.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Home.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Home(){
		Home.click();
}

@FindBy(how= How.ID, using = "Our_Org")
	public static WebElement Our_Org;

public void verify_Our_Org_Status(String data){
		//Verifies the Status of the Our_Org
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Our_Org.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Our_Org.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Our_Org.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Our_Org.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Our_Org(){
		Our_Org.click();
}

@FindBy(how= How.ID, using = "Policies")
	public static WebElement Policies;

public void verify_Policies_Status(String data){
		//Verifies the Status of the Policies
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Policies.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Policies.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Policies.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Policies.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Policies(){
		Policies.click();
}

@FindBy(how= How.ID, using = "MyAttendance")
	public static WebElement MyAttendance;

public void verify_MyAttendance_Status(String data){
		//Verifies the Status of the MyAttendance
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(MyAttendance.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(MyAttendance.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!MyAttendance.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!MyAttendance.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_MyAttendance(){
		MyAttendance.click();
}

@FindBy(how= How.ID, using = "Holidays")
	public static WebElement Holidays;

public void verify_Holidays_Status(String data){
		//Verifies the Status of the Holidays
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Holidays.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Holidays.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Holidays.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Holidays.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Holidays(){
		Holidays.click();
}

@FindBy(how= How.ID, using = "People_Connect")
	public static WebElement People_Connect;

public void verify_People_Connect_Status(String data){
		//Verifies the Status of the People_Connect
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(People_Connect.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(People_Connect.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!People_Connect.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!People_Connect.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_People_Connect(){
		People_Connect.click();
}

@FindBy(how= How.ID, using = "My_Requests")
	public static WebElement My_Requests;

public void verify_My_Requests_Status(String data){
		//Verifies the Status of the My_Requests
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(My_Requests.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(My_Requests.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!My_Requests.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!My_Requests.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_My_Requests(){
		My_Requests.click();
}

@FindBy(how= How.ID, using = "Manage_Requests")
	public static WebElement Manage_Requests;

public void verify_Manage_Requests_Status(String data){
		//Verifies the Status of the Manage_Requests
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Manage_Requests.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Manage_Requests.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Manage_Requests.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Manage_Requests.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Manage_Requests(){
		Manage_Requests.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}