package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class VerifySavedFile_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "EIFType")
	public static WebElement EIFType;

public void verify_EIFType(String data){
		Assert.assertEquals(EIFType,EIFType);
}

public void enter_EIFType(String data){
		EIFType.sendKeys(data);
}

@FindBy(how= How.ID, using = "FileType")
	public static WebElement FileType;

public void verify_FileType(String data){
		Assert.assertEquals(FileType,FileType);
}

public void enter_FileType(String data){
		FileType.sendKeys(data);
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}