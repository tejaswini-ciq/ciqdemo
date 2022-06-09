package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Holidays_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "unnamed")
	public static WebElement unnamed;

public void verify_unnamed_Status(String data){
		//Verifies the Status of the unnamed
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(unnamed.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(unnamed.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!unnamed.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!unnamed.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_unnamed(){
		unnamed.click();
}

@FindBy(how= How.ID, using = "Policy_LIst")
	public static WebElement Policy_LIst;

public void verify_Policy_LIst(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Policy_LIst.getAttribute("value"),data);
	}

}

public void verify_Policy_LIst_Status(String data){
		//Verifies the Status of the Policy_LIst
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Policy_LIst.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Policy_LIst.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Policy_LIst.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Policy_LIst.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Policy_LIst(String data){
		Select dropdown= new Select(Policy_LIst);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Calendar_Table")
	public static WebElement Calendar_Table;

public void verify_Calendar_Table(String data){
		Assert.assertEquals(Calendar_Table,Calendar_Table);
}

@FindBy(how= How.ID, using = "Jan")
	public static WebElement Jan;

public void verify_Jan(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Jan.getAttribute("value"),data);
	}

}

public void verify_Jan_Status(String data){
		//Verifies the Status of the Jan
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Jan.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Jan.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Jan.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Jan.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Jan(String data){
		Jan.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}