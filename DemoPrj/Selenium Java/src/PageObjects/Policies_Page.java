package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Policies_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "PolicyListByFunction")
	public static WebElement PolicyListByFunction;

public void verify_PolicyListByFunction(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(PolicyListByFunction.getAttribute("value"),data);
	}

}

public void verify_PolicyListByFunction_Status(String data){
		//Verifies the Status of the PolicyListByFunction
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(PolicyListByFunction.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(PolicyListByFunction.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!PolicyListByFunction.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!PolicyListByFunction.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_PolicyListByFunction(String data){
		Select dropdown= new Select(PolicyListByFunction);
		 dropdown.selectByVisibleText(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}