package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class CopyToClipboard_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "unnamed")
	public static WebElement unnamed;

public void verify_unnamed(String data){
		Assert.assertEquals(unnamed,unnamed);
}

public void enter_unnamed(String data){
		unnamed.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}