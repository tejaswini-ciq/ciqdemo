package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Our_Org_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Our_Story")
	public static WebElement Our_Story;

public void verify_Our_Story_Status(String data){
		//Verifies the Status of the Our_Story
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Our_Story.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Our_Story.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Our_Story.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Our_Story.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Our_Story(){
		Our_Story.click();
}

@FindBy(how= How.ID, using = "Our_People")
	public static WebElement Our_People;

public void verify_Our_People_Status(String data){
		//Verifies the Status of the Our_People
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Our_People.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Our_People.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Our_People.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Our_People.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Our_People(){
		Our_People.click();
}

@FindBy(how= How.ID, using = "Our_Location")
	public static WebElement Our_Location;

public void verify_Our_Location_Status(String data){
		//Verifies the Status of the Our_Location
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Our_Location.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Our_Location.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Our_Location.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Our_Location.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Our_Location(){
		Our_Location.click();
}

@FindBy(how= How.ID, using = "Our_Clients")
	public static WebElement Our_Clients;

public void verify_Our_Clients_Status(String data){
		//Verifies the Status of the Our_Clients
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Our_Clients.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Our_Clients.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Our_Clients.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Our_Clients.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Our_Clients(){
		Our_Clients.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}