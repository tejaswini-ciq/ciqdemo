package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Login_Screen_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "UserName")
	public static WebElement UserName;

public void verify_UserName(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(UserName.getAttribute("value"),data);
	}

}

public void verify_UserName_Status(String data){
		//Verifies the Status of the UserName
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(UserName.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(UserName.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!UserName.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!UserName.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_UserName(String data){
		UserName.clear();
		UserName.sendKeys(data);
}

@FindBy(how= How.ID, using = "Password")
	public static WebElement Password;

public void verify_Password(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Password.getAttribute("value"),data);
	}

}

public void verify_Password_Status(String data){
		//Verifies the Status of the Password
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Password.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Password.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Password.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Password.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Password(String data){
		Password.clear();
		Password.sendKeys(data);
}

@FindBy(how= How.ID, using = "Company")
	public static WebElement Company;

public void verify_Company(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Company.getAttribute("value"),data);
	}

}

public void verify_Company_Status(String data){
		//Verifies the Status of the Company
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Company.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Company.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Company.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Company.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Company(String data){
		Company.clear();
		Company.sendKeys(data);
}

@FindBy(how= How.ID, using = "Sign_In")
	public static WebElement Sign_In;

public void verify_Sign_In_Status(String data){
		//Verifies the Status of the Sign_In
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Sign_In.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Sign_In.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Sign_In.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Sign_In.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Sign_In(){
		Sign_In.click();
}

@FindBy(how= How.ID, using = "ErrorMsg")
	public static WebElement ErrorMsg;

public void verify_ErrorMsg(String data){
		Assert.assertEquals(ErrorMsg,ErrorMsg);
}

public void verify_ErrorMsg_Status(String data){
		//Verifies the Status of the ErrorMsg
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ErrorMsg.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ErrorMsg.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ErrorMsg.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ErrorMsg.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}