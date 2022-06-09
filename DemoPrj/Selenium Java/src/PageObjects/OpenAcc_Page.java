package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class OpenAcc_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "AccType")
	public static WebElement AccType;

public void verify_AccType(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(AccType.getAttribute("value"),data);
	}

}

public void verify_AccType_Status(String data){
		//Verifies the Status of the AccType
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AccType.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AccType.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AccType.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AccType.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_AccType(String data){
		AccType.clear();
		AccType.sendKeys(data);
}

@FindBy(how= How.ID, using = "AccNo")
	public static WebElement AccNo;

public void verify_AccNo(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(AccNo.getAttribute("value"),data);
	}

}

public void verify_AccNo_Status(String data){
		//Verifies the Status of the AccNo
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AccNo.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AccNo.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AccNo.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AccNo.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_AccNo(String data){
		AccNo.clear();
		AccNo.sendKeys(data);
}

@FindBy(how= How.ID, using = "Submit")
	public static WebElement Submit;

public void verify_Submit_Status(String data){
		//Verifies the Status of the Submit
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Submit.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Submit.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Submit.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Submit.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Submit(){
		Submit.click();
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