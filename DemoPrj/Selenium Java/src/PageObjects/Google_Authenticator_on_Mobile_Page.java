package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Google_Authenticator_on_Mobile_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Approve")
	public static WebElement Approve;

public void verify_Approve_Status(String data){
		//Verifies the Status of the Approve
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Approve.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Approve.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Approve.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Approve.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Approve(){
		Approve.click();
}

@FindBy(how= How.ID, using = "Authentication_Alert_Msg")
	public static WebElement Authentication_Alert_Msg;

public void verify_Authentication_Alert_Msg(String data){
		Assert.assertEquals(Authentication_Alert_Msg,Authentication_Alert_Msg);
}

public void verify_Authentication_Alert_Msg_Status(String data){
		//Verifies the Status of the Authentication_Alert_Msg
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Authentication_Alert_Msg.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Authentication_Alert_Msg.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Authentication_Alert_Msg.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Authentication_Alert_Msg.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "unnamed")
	public static WebElement unnamed;

public void verify_unnamed(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(unnamed.getAttribute("value"),data);
	}

}

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
public void set_unnamed(String data){
		unnamed.clear();
		unnamed.sendKeys(data);
}

@FindBy(how= How.ID, using = "I_agree")
	public static WebElement I_agree;

public void verify_I_agree(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(I_agree.getAttribute("value"),data);
	}

}

public void verify_I_agree_Status(String data){
		//Verifies the Status of the I_agree
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(I_agree.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(I_agree.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!I_agree.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!I_agree.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_I_agree(String data){
		if(I_agree.isSelected());
			I_agree.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}