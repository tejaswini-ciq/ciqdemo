package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class FlightSearchResults_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "FlightSearchResultsTbl")
	public static WebElement FlightSearchResultsTbl;

public void verify_FlightSearchResultsTbl(String data){
		Assert.assertEquals(FlightSearchResultsTbl,FlightSearchResultsTbl);
}

@FindBy(how= How.ID, using = "FlightInfo")
	public static WebElement FlightInfo;

public void verify_FlightInfo_Status(String data){
		//Verifies the Status of the FlightInfo
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(FlightInfo.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(FlightInfo.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!FlightInfo.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!FlightInfo.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_FlightInfo(){
		FlightInfo.click();
}

@FindBy(how= How.ID, using = "Book")
	public static WebElement Book;

public void verify_Book_Status(String data){
		//Verifies the Status of the Book
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Book.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Book.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Book.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Book.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Book(){
		Book.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}