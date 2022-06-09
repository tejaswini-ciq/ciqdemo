package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class MakeMyTripSearchResults_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "SearchResults")
	public static WebElement SearchResults;

public void verify_SearchResults(String data){
		Assert.assertEquals(SearchResults,SearchResults);
}

@FindBy(how= How.ID, using = "ViewFlightDetails")
	public static WebElement ViewFlightDetails;

public void verify_ViewFlightDetails_Status(String data){
		//Verifies the Status of the ViewFlightDetails
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ViewFlightDetails.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ViewFlightDetails.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ViewFlightDetails.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ViewFlightDetails.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ViewFlightDetails(){
		ViewFlightDetails.click();
}

@FindBy(how= How.ID, using = "BookFlight")
	public static WebElement BookFlight;

public void verify_BookFlight_Status(String data){
		//Verifies the Status of the BookFlight
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(BookFlight.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(BookFlight.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!BookFlight.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!BookFlight.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_BookFlight(){
		BookFlight.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}