package testsuite;
import org.testng.annotations.Test;
import PageObjects.*;
import utilities.PageObjectBase;
import org.openqa.selenium.support.PageFactory;
import utilities.Configurations;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.util.HashMap;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import utilities.TestReport;
import java.io.IOException;
import org.testng.Reporter;
import utilities.DataUtil;


/** Conformiq generated test case
	TC_DemoPrj_1
*/
public class TC_DemoPrj_1 extends PageObjectBase
{

	public TC_DemoPrj_1()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_From_TEXTBOX_Status,final String Step_1_From_TEXTBOX_Verification,final String Step_1_To_TEXTBOX_Status,final String Step_1_To_TEXTBOX_Verification,final String Step_1_DateOfTravel_TEXTBOX_Status,final String Step_1_DateOfTravel_TEXTBOX_Verification,final String Step_1_Search_BUTTON_Status,final String Step_2_From_TEXTBOX,final String Step_2_To_TEXTBOX,final String Step_2_DateOfTravel_TEXTBOX,final String Step_5_FlightNo_TEXTBOX,final String Step_5_From_TEXTBOX,final String Step_5_DepDateTime_TEXTBOX,final String Step_5_To_TEXTBOX,final String Step_5_ArrDateTime_TEXTBOX,final String Step_5_Fare_TEXTBOX) throws Exception

	{

	ADSReq_Page adsreq_page_init=PageFactory.initElements(driver, ADSReq_Page.class);

	ADSRes_Page adsres_page_init=PageFactory.initElements(driver, ADSRes_Page.class);

	Car_Buy_Sell_Page car_buy_sell_page_init=PageFactory.initElements(driver, Car_Buy_Sell_Page.class);

	TrasferRC_Page trasferrc_page_init=PageFactory.initElements(driver, TrasferRC_Page.class);

	InsuranceApplication_Page insuranceapplication_page_init=PageFactory.initElements(driver, InsuranceApplication_Page.class);

	Left_Frame_Page left_frame_page_init=PageFactory.initElements(driver, Left_Frame_Page.class);

	Our_Org_Page our_org_page_init=PageFactory.initElements(driver, Our_Org_Page.class);

	My_Attendance_Page my_attendance_page_init=PageFactory.initElements(driver, My_Attendance_Page.class);

	Policies_Page policies_page_init=PageFactory.initElements(driver, Policies_Page.class);

	Holidays_Page holidays_page_init=PageFactory.initElements(driver, Holidays_Page.class);

	Resource_Requistions_Page resource_requistions_page_init=PageFactory.initElements(driver, Resource_Requistions_Page.class);

	unnamed_Page unnamed_page_init=PageFactory.initElements(driver, unnamed_Page.class);

	People_Connect_Page people_connect_page_init=PageFactory.initElements(driver, People_Connect_Page.class);

	MyRecruitment_Page myrecruitment_page_init=PageFactory.initElements(driver, MyRecruitment_Page.class);

	Login_Screen_Page login_screen_page_init=PageFactory.initElements(driver, Login_Screen_Page.class);

	Home_Screen_Page home_screen_page_init=PageFactory.initElements(driver, Home_Screen_Page.class);

	Error_Pop_Up_Page error_pop_up_page_init=PageFactory.initElements(driver, Error_Pop_Up_Page.class);

	HolidayCustomAction_Page holidaycustomaction_page_init=PageFactory.initElements(driver, HolidayCustomAction_Page.class);

	CopyToClipboard_Page copytoclipboard_page_init=PageFactory.initElements(driver, CopyToClipboard_Page.class);

	ExportToExcel_Page exporttoexcel_page_init=PageFactory.initElements(driver, ExportToExcel_Page.class);

	PDFExport_Page pdfexport_page_init=PageFactory.initElements(driver, PDFExport_Page.class);

	CSVExport_Page csvexport_page_init=PageFactory.initElements(driver, CSVExport_Page.class);

	Print_Page print_page_init=PageFactory.initElements(driver, Print_Page.class);

	VerifySavedFile_Page verifysavedfile_page_init=PageFactory.initElements(driver, VerifySavedFile_Page.class);

	ConformiqLeftMenu_Page conformiqleftmenu_page_init=PageFactory.initElements(driver, ConformiqLeftMenu_Page.class);

	MakeMyTripSearchResults_Page makemytripsearchresults_page_init=PageFactory.initElements(driver, MakeMyTripSearchResults_Page.class);

	FlightSearch_Page flightsearch_page_init=PageFactory.initElements(driver, FlightSearch_Page.class);

	LoginReq_Page loginreq_page_init=PageFactory.initElements(driver, LoginReq_Page.class);

	LoginResponse_Page loginresponse_page_init=PageFactory.initElements(driver, LoginResponse_Page.class);

	CustomAction_Page customaction_page_init=PageFactory.initElements(driver, CustomAction_Page.class);

	OpenAcc_Page openacc_page_init=PageFactory.initElements(driver, OpenAcc_Page.class);

	Transfer_Funds_Page transfer_funds_page_init=PageFactory.initElements(driver, Transfer_Funds_Page.class);

	Google_Authenticator_on_Mobile_Page google_authenticator_on_mobile_page_init=PageFactory.initElements(driver, Google_Authenticator_on_Mobile_Page.class);

	FlightSearchResults_Page flightsearchresults_page_init=PageFactory.initElements(driver, FlightSearchResults_Page.class);
	testReport.createTesthtmlHeader(overallTestData);

	testReport.createHead(overallTestData);

	testReport.putLogo(overallTestData);

	float ne = (float) 0.0;

	testReport.generateGeneralInfo(overallTestData, "TC_DemoPrj_1", "TC_TC_DemoPrj_1", "",ne);

	testReport.createStepHeader();

	//External Circumstances


	Reporter.log("Step - 1- verify FlightSearch screen");

	testReport.fillTableStep("Step 1", "verify FlightSearch screen");

	flightsearch_page_init.verify_From_Status(Step_1_From_TEXTBOX_Status);

	flightsearch_page_init.verify_From(Step_1_From_TEXTBOX_Verification);
	flightsearch_page_init.verify_To_Status(Step_1_To_TEXTBOX_Status);

	flightsearch_page_init.verify_To(Step_1_To_TEXTBOX_Verification);
	flightsearch_page_init.verify_DateOfTravel_Status(Step_1_DateOfTravel_TEXTBOX_Status);

	flightsearch_page_init.verify_DateOfTravel(Step_1_DateOfTravel_TEXTBOX_Verification);
	flightsearch_page_init.verify_Search_Status(Step_1_Search_BUTTON_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "TC_DemoPrj_1","Step_1");

	Reporter.log("Step - 2- Fill FlightSearch form FlightSearch screen");

	testReport.fillTableStep("Step 2", "Fill FlightSearch form FlightSearch screen");

	flightsearch_page_init.set_From(Step_2_From_TEXTBOX);
	flightsearch_page_init.set_To(Step_2_To_TEXTBOX);
	flightsearch_page_init.set_DateOfTravel(Step_2_DateOfTravel_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "TC_DemoPrj_1","Step_2");

	Reporter.log("Step - 3- verify FlightSearchResults screen");

	testReport.fillTableStep("Step 3", "verify FlightSearchResults screen");

	getScreenshot(driver,Configurations.screenshotLocation , "TC_DemoPrj_1","Step_3");

	Reporter.log("Step - 4- Select FlightSearchResultsTbl table FlightSearchResults screen");

	testReport.fillTableStep("Step 4", "Select FlightSearchResultsTbl table FlightSearchResults screen");

	getScreenshot(driver,Configurations.screenshotLocation , "TC_DemoPrj_1","Step_4");

	Reporter.log("Step - 5- click Book button FlightSearchResults screen FlightSearchResultsTbl table");

	testReport.fillTableStep("Step 5", "click Book button FlightSearchResults screen FlightSearchResultsTbl table");

	flightsearchresults_page_init.click_Book();
	flightsearchresults_page_init.set_FlightNo(Step_5_FlightNo_TEXTBOX);
	flightsearchresults_page_init.set_From(Step_5_From_TEXTBOX);
	flightsearchresults_page_init.set_DepDateTime(Step_5_DepDateTime_TEXTBOX);
	flightsearchresults_page_init.set_To(Step_5_To_TEXTBOX);
	flightsearchresults_page_init.set_ArrDateTime(Step_5_ArrDateTime_TEXTBOX);
	flightsearchresults_page_init.set_Fare(Step_5_Fare_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "TC_DemoPrj_1","Step_5");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_1");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "TC_DemoPrj_1");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
