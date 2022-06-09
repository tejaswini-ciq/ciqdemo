package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Error_Pop_Up_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Error_Message")
	public static WebElement Error_Message;

public void verify_Error_Message(String data){
		Assert.assertEquals(Error_Message,Error_Message);
}

public void verify_Error_Message_Status(String data){
		//Verifies the Status of the Error_Message
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Error_Message.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Error_Message.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Error_Message.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Error_Message.isEnabled());
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