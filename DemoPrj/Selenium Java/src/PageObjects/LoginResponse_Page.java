package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class LoginResponse_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Username")
	public static WebElement Username;

public void verify_Username(String data){
		Assert.assertEquals(Username,Username);
}

public void enter_Username(String data){
		Username.sendKeys(data);
}

@FindBy(how= How.ID, using = "Password")
	public static WebElement Password;

public void verify_Password(String data){
		Assert.assertEquals(Password,Password);
}

public void enter_Password(String data){
		Password.sendKeys(data);
}

@FindBy(how= How.ID, using = "Role")
	public static WebElement Role;

public void verify_Role(String data){
		Assert.assertEquals(Role,Role);
}

public void enter_Role(String data){
		Role.sendKeys(data);
}

@FindBy(how= How.ID, using = "AccessRights")
	public static WebElement AccessRights;

public void verify_AccessRights(String data){
		Assert.assertEquals(AccessRights,AccessRights);
}

public void enter_AccessRights(String data){
		AccessRights.sendKeys(data);
}

@FindBy(how= How.ID, using = "NewCustomAction")
	public static WebElement NewCustomAction;

public void verify_NewCustomAction(String data){
		Assert.assertEquals(NewCustomAction,NewCustomAction);
}

public void enter_NewCustomAction(String data){
		NewCustomAction.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}