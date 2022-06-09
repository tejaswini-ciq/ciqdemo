package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class FlightSearch_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "From")
	public static WebElement From;

public void verify_From(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(From.getAttribute("value"),data);
	}

}

public void verify_From_Status(String data){
		//Verifies the Status of the From
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(From.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(From.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!From.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!From.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_From(String data){
		From.clear();
		From.sendKeys(data);
}

@FindBy(how= How.ID, using = "To")
	public static WebElement To;

public void verify_To(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(To.getAttribute("value"),data);
	}

}

public void verify_To_Status(String data){
		//Verifies the Status of the To
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(To.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(To.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!To.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!To.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_To(String data){
		To.clear();
		To.sendKeys(data);
}

@FindBy(how= How.ID, using = "DateTime")
	public static WebElement DateTime;

public void verify_DateTime(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(DateTime.getAttribute("value"),data);
	}

}

public void verify_DateTime_Status(String data){
		//Verifies the Status of the DateTime
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(DateTime.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(DateTime.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!DateTime.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!DateTime.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_DateTime(String data){
		DateTime.clear();
		DateTime.sendKeys(data);
}

@FindBy(how= How.ID, using = "Search")
	public static WebElement Search;

public void verify_Search_Status(String data){
		//Verifies the Status of the Search
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Search.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Search.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Search.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Search.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Search(){
		Search.click();
}

@FindBy(how= How.ID, using = "DateOfTravel")
	public static WebElement DateOfTravel;

public void verify_DateOfTravel(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(DateOfTravel.getAttribute("value"),data);
	}

}

public void verify_DateOfTravel_Status(String data){
		//Verifies the Status of the DateOfTravel
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(DateOfTravel.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(DateOfTravel.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!DateOfTravel.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!DateOfTravel.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_DateOfTravel(String data){
		DateOfTravel.clear();
		DateOfTravel.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}