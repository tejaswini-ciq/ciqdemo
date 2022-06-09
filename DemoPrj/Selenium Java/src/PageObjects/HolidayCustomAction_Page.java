package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class HolidayCustomAction_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Verify_the_holidays_are_as_below")
	public static WebElement Verify_the_holidays_are_as_below;

public void verify_Verify_the_holidays_are_as_below(String data){
		Assert.assertEquals(Verify_the_holidays_are_as_below,Verify_the_holidays_are_as_below);
}

public void verify_Verify_the_holidays_are_as_below_Status(String data){
		//Verifies the Status of the Verify_the_holidays_are_as_below
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Verify_the_holidays_are_as_below.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Verify_the_holidays_are_as_below.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Verify_the_holidays_are_as_below.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Verify_the_holidays_are_as_below.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Holiday1")
	public static WebElement Holiday1;

public void verify_Holiday1(String data){
		Assert.assertEquals(Holiday1,Holiday1);
}

public void enter_Holiday1(String data){
		Holiday1.sendKeys(data);
}

@FindBy(how= How.ID, using = "Holiday2")
	public static WebElement Holiday2;

public void verify_Holiday2(String data){
		Assert.assertEquals(Holiday2,Holiday2);
}

public void enter_Holiday2(String data){
		Holiday2.sendKeys(data);
}

@FindBy(how= How.ID, using = "Holiday3")
	public static WebElement Holiday3;

public void verify_Holiday3(String data){
		Assert.assertEquals(Holiday3,Holiday3);
}

public void enter_Holiday3(String data){
		Holiday3.sendKeys(data);
}

@FindBy(how= How.ID, using = "Month")
	public static WebElement Month;

public void verify_Month(String data){
		Assert.assertEquals(Month,Month);
}

public void enter_Month(String data){
		Month.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}