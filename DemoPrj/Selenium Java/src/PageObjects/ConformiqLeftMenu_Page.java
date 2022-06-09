package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class ConformiqLeftMenu_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "DemoPrj")
	public static WebElement DemoPrj;

public void click_DemoPrj(){
		DemoPrj.click();
}

@FindBy(how= How.ID, using = "DC")
	public static WebElement DC;

public void click_DC(){
		DC.click();
}

@FindBy(how= How.ID, using = "Excel")
	public static WebElement Excel;

public void click_Excel(){
		Excel.click();
}

@FindBy(how= How.ID, using = "COpt")
	public static WebElement COpt;

public void click_COpt(){
		COpt.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}