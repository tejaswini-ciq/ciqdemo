package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class ADSReq_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "UserName")
	public static WebElement UserName;

public void verify_UserName(String data){
		Assert.assertEquals(UserName,UserName);
}

public void enter_UserName(String data){
		UserName.sendKeys(data);
}

@FindBy(how= How.ID, using = "Password")
	public static WebElement Password;

public void verify_Password(String data){
		Assert.assertEquals(Password,Password);
}

public void enter_Password(String data){
		Password.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}