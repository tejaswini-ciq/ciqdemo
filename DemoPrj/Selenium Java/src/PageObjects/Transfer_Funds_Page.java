package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Transfer_Funds_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "unnamed")
	public static WebElement unnamed;

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
public void click_unnamed(){
		unnamed.click();
}

@FindBy(how= How.ID, using = "FromAccNo")
	public static WebElement FromAccNo;

public void verify_FromAccNo_Status(String data){
		//Verifies the Status of the FromAccNo
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(FromAccNo.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(FromAccNo.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!FromAccNo.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!FromAccNo.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_FromAccNo(){
		FromAccNo.click();
}

@FindBy(how= How.ID, using = "unnamed")
	public static WebElement unnamed;

public void verify_unnamed(String data){
		Assert.assertEquals(unnamed,unnamed);
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

@FindBy(how= How.ID, using = "FromAcc")
	public static WebElement FromAcc;

public void verify_FromAcc(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(FromAcc.getAttribute("value"),data);
	}

}

public void verify_FromAcc_Status(String data){
		//Verifies the Status of the FromAcc
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(FromAcc.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(FromAcc.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!FromAcc.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!FromAcc.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_FromAcc(String data){
		FromAcc.clear();
		FromAcc.sendKeys(data);
}

@FindBy(how= How.ID, using = "ToAcc")
	public static WebElement ToAcc;

public void verify_ToAcc(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(ToAcc.getAttribute("value"),data);
	}

}

public void verify_ToAcc_Status(String data){
		//Verifies the Status of the ToAcc
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ToAcc.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ToAcc.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ToAcc.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ToAcc.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_ToAcc(String data){
		ToAcc.clear();
		ToAcc.sendKeys(data);
}

@FindBy(how= How.ID, using = "Amount")
	public static WebElement Amount;

public void verify_Amount(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Amount.getAttribute("value"),data);
	}

}

public void verify_Amount_Status(String data){
		//Verifies the Status of the Amount
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Amount.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Amount.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Amount.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Amount.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Amount(String data){
		Amount.clear();
		Amount.sendKeys(data);
}

@FindBy(how= How.ID, using = "Transfer")
	public static WebElement Transfer;

public void verify_Transfer_Status(String data){
		//Verifies the Status of the Transfer
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Transfer.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Transfer.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Transfer.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Transfer.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Transfer(){
		Transfer.click();
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