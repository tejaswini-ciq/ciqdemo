package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class People_Connect_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "My_Recruitment")
	public static WebElement My_Recruitment;

public void verify_My_Recruitment_Status(String data){
		//Verifies the Status of the My_Recruitment
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(My_Recruitment.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(My_Recruitment.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!My_Recruitment.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!My_Recruitment.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_My_Recruitment(){
		My_Recruitment.click();
}

@FindBy(how= How.ID, using = "Performance_Mgmt")
	public static WebElement Performance_Mgmt;

public void verify_Performance_Mgmt_Status(String data){
		//Verifies the Status of the Performance_Mgmt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Performance_Mgmt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Performance_Mgmt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Performance_Mgmt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Performance_Mgmt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Performance_Mgmt(){
		Performance_Mgmt.click();
}

@FindBy(how= How.ID, using = "Hall_of_Fame")
	public static WebElement Hall_of_Fame;

public void verify_Hall_of_Fame_Status(String data){
		//Verifies the Status of the Hall_of_Fame
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Hall_of_Fame.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Hall_of_Fame.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Hall_of_Fame.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Hall_of_Fame.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Hall_of_Fame(){
		Hall_of_Fame.click();
}

@FindBy(how= How.ID, using = "Hall_of_Fame")
	public static WebElement Hall_of_Fame;

public void verify_Hall_of_Fame_Status(String data){
		//Verifies the Status of the Hall_of_Fame
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Hall_of_Fame.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Hall_of_Fame.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Hall_of_Fame.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Hall_of_Fame.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Hall_of_Fame(){
		Hall_of_Fame.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}