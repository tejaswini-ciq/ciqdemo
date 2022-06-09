package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class ADSRes_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Status")
	public static WebElement Status;

public void verify_Status(String data){
		Assert.assertEquals(Status,Status);
}

public void enter_Status(String data){
		Status.sendKeys(data);
}

@FindBy(how= How.ID, using = "UserInfo")
	public static WebElement UserInfo;

public void verify_UserInfo(String data){
		Assert.assertEquals(UserInfo,UserInfo);
}

public void enter_UserInfo(String data){
		UserInfo.sendKeys(data);
}

@FindBy(how= How.ID, using = "FirstName")
	public static WebElement FirstName;

public void verify_FirstName(String data){
		Assert.assertEquals(FirstName,FirstName);
}

public void enter_FirstName(String data){
		FirstName.sendKeys(data);
}

@FindBy(how= How.ID, using = "LastName")
	public static WebElement LastName;

public void verify_LastName(String data){
		Assert.assertEquals(LastName,LastName);
}

public void enter_LastName(String data){
		LastName.sendKeys(data);
}

@FindBy(how= How.ID, using = "DOB")
	public static WebElement DOB;

public void verify_DOB(String data){
		Assert.assertEquals(DOB,DOB);
}

public void enter_DOB(String data){
		DOB.sendKeys(data);
}

@FindBy(how= How.ID, using = "isAdmin")
	public static WebElement isAdmin;

public void verify_isAdmin(String data){
		Assert.assertEquals(isAdmin,isAdmin);
}

public void enter_isAdmin(String data){
		isAdmin.sendKeys(data);
}

@FindBy(how= How.ID, using = "isManager")
	public static WebElement isManager;

public void verify_isManager(String data){
		Assert.assertEquals(isManager,isManager);
}

public void enter_isManager(String data){
		isManager.sendKeys(data);
}

@FindBy(how= How.ID, using = "unnamed")
	public static WebElement unnamed;

public void verify_unnamed(String data){
		Assert.assertEquals(unnamed,unnamed);
}

public void enter_unnamed(String data){
		unnamed.sendKeys(data);
}

@FindBy(how= How.ID, using = "ScreenAuthList")
	public static WebElement ScreenAuthList;

public void verify_ScreenAuthList(String data){
		Assert.assertEquals(ScreenAuthList,ScreenAuthList);
}

public void enter_ScreenAuthList(String data){
		ScreenAuthList.sendKeys(data);
}

@FindBy(how= How.ID, using = "ViewAcc")
	public static WebElement ViewAcc;

public void verify_ViewAcc(String data){
		Assert.assertEquals(ViewAcc,ViewAcc);
}

public void enter_ViewAcc(String data){
		ViewAcc.sendKeys(data);
}

@FindBy(how= How.ID, using = "OpenAcc")
	public static WebElement OpenAcc;

public void verify_OpenAcc(String data){
		Assert.assertEquals(OpenAcc,OpenAcc);
}

public void enter_OpenAcc(String data){
		OpenAcc.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}