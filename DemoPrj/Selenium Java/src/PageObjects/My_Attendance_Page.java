package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class My_Attendance_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Attendance")
	public static WebElement Attendance;

public void verify_Attendance_Status(String data){
		//Verifies the Status of the Attendance
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Attendance.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Attendance.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Attendance.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Attendance.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Attendance(){
		Attendance.click();
}

@FindBy(how= How.ID, using = "Leave_Details")
	public static WebElement Leave_Details;

public void verify_Leave_Details_Status(String data){
		//Verifies the Status of the Leave_Details
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Leave_Details.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Leave_Details.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Leave_Details.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Leave_Details.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Leave_Details(){
		Leave_Details.click();
}

@FindBy(how= How.ID, using = "LeaveDetails")
	public static WebElement LeaveDetails;

public void verify_LeaveDetails_Status(String data){
		//Verifies the Status of the LeaveDetails
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(LeaveDetails.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(LeaveDetails.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!LeaveDetails.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!LeaveDetails.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_LeaveDetails(){
		LeaveDetails.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}