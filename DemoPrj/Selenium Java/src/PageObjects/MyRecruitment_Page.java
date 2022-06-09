package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class MyRecruitment_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Resource_Requisition")
	public static WebElement Resource_Requisition;

public void verify_Resource_Requisition_Status(String data){
		//Verifies the Status of the Resource_Requisition
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resource_Requisition.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resource_Requisition.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resource_Requisition.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resource_Requisition.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Resource_Requisition(){
		Resource_Requisition.click();
}

@FindBy(how= How.ID, using = "Open_Positions")
	public static WebElement Open_Positions;

public void verify_Open_Positions_Status(String data){
		//Verifies the Status of the Open_Positions
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Open_Positions.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Open_Positions.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Open_Positions.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Open_Positions.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Open_Positions(){
		Open_Positions.click();
}

@FindBy(how= How.ID, using = "My_Candidate_Schedule")
	public static WebElement My_Candidate_Schedule;

public void verify_My_Candidate_Schedule_Status(String data){
		//Verifies the Status of the My_Candidate_Schedule
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(My_Candidate_Schedule.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(My_Candidate_Schedule.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!My_Candidate_Schedule.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!My_Candidate_Schedule.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_My_Candidate_Schedule(){
		My_Candidate_Schedule.click();
}

@FindBy(how= How.ID, using = "Onboarding")
	public static WebElement Onboarding;

public void verify_Onboarding_Status(String data){
		//Verifies the Status of the Onboarding
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Onboarding.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Onboarding.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Onboarding.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Onboarding.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Onboarding(){
		Onboarding.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}