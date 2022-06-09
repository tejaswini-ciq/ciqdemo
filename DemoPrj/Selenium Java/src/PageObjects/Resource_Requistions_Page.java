package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Resource_Requistions_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "ResReqHdr")
	public static WebElement ResReqHdr;

public void verify_ResReqHdr(String data){
		Assert.assertEquals(ResReqHdr,ResReqHdr);
}

public void verify_ResReqHdr_Status(String data){
		//Verifies the Status of the ResReqHdr
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ResReqHdr.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ResReqHdr.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ResReqHdr.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ResReqHdr.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Home")
	public static WebElement Home;

public void verify_Home_Status(String data){
		//Verifies the Status of the Home
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Home.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Home.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Home.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Home.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Home(){
		Home.click();
}

@FindBy(how= How.ID, using = "Add_New")
	public static WebElement Add_New;

public void verify_Add_New_Status(String data){
		//Verifies the Status of the Add_New
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_New.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_New.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_New.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_New.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_New(){
		Add_New.click();
}

@FindBy(how= How.ID, using = "Resource_Requistion_Data")
	public static WebElement Resource_Requistion_Data;

public void verify_Resource_Requistion_Data(String data){
		Assert.assertEquals(Resource_Requistion_Data,Resource_Requistion_Data);
}

@FindBy(how= How.ID, using = "Cancel")
	public static WebElement Cancel;

public void verify_Cancel_Status(String data){
		//Verifies the Status of the Cancel
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Cancel.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Cancel.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Cancel.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Cancel.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Cancel(){
		Cancel.click();
}

@FindBy(how= How.ID, using = "View")
	public static WebElement View;

public void verify_View_Status(String data){
		//Verifies the Status of the View
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View(){
		View.click();
}

@FindBy(how= How.ID, using = "Edit")
	public static WebElement Edit;

public void verify_Edit_Status(String data){
		//Verifies the Status of the Edit
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Edit.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Edit.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Edit.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Edit.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Edit(){
		Edit.click();
}

@FindBy(how= How.ID, using = "Delete")
	public static WebElement Delete;

public void verify_Delete_Status(String data){
		//Verifies the Status of the Delete
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Delete.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Delete.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Delete.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Delete.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Delete(){
		Delete.click();
}

@FindBy(how= How.ID, using = "Search")
	public static WebElement Search;

public void verify_Search(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Search.getAttribute("value"),data);
	}

}

public void verify_Search_Status(String data){
		//Verifies the Status of the Search
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Search.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Search.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Search.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Search.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Search(String data){
		Search.clear();
		Search.sendKeys(data);
}

@FindBy(how= How.ID, using = "Copy")
	public static WebElement Copy;

public void verify_Copy_Status(String data){
		//Verifies the Status of the Copy
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Copy.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Copy.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Copy.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Copy.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Copy(){
		Copy.click();
}

@FindBy(how= How.ID, using = "CSV")
	public static WebElement CSV;

public void verify_CSV_Status(String data){
		//Verifies the Status of the CSV
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CSV.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CSV.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CSV.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CSV.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_CSV(){
		CSV.click();
}

@FindBy(how= How.ID, using = "Excel")
	public static WebElement Excel;

public void verify_Excel_Status(String data){
		//Verifies the Status of the Excel
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Excel.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Excel.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Excel.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Excel.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Excel(){
		Excel.click();
}

@FindBy(how= How.ID, using = "PDF")
	public static WebElement PDF;

public void verify_PDF_Status(String data){
		//Verifies the Status of the PDF
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(PDF.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(PDF.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!PDF.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!PDF.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_PDF(){
		PDF.click();
}

@FindBy(how= How.ID, using = "Print")
	public static WebElement Print;

public void verify_Print_Status(String data){
		//Verifies the Status of the Print
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Print.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Print.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Print.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Print.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Print(){
		Print.click();
}

@FindBy(how= How.ID, using = "PositionApprovalStatus")
	public static WebElement PositionApprovalStatus;

public void verify_PositionApprovalStatus_Status(String data){
		//Verifies the Status of the PositionApprovalStatus
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(PositionApprovalStatus.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(PositionApprovalStatus.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!PositionApprovalStatus.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!PositionApprovalStatus.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_PositionApprovalStatus(){
		PositionApprovalStatus.click();
}

@FindBy(how= How.ID, using = "RequestorsComments")
	public static WebElement RequestorsComments;

public void verify_RequestorsComments_Status(String data){
		//Verifies the Status of the RequestorsComments
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(RequestorsComments.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(RequestorsComments.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!RequestorsComments.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!RequestorsComments.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_RequestorsComments(){
		RequestorsComments.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}