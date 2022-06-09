package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Car_Buy_Sell_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Buy")
	public static WebElement Buy;

public void verify_Buy(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Buy.getAttribute("name"),data);
	}

}

public void verify_Buy_Status(String data){
		//Verifies the Status of the Buy
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Buy.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Buy.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Buy.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Buy.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "TradeType")
	public static WebElement TradeType;

public void verify_TradeType(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(TradeType.getAttribute("name"),data);
	}

}

public void verify_TradeType_Status(String data){
		//Verifies the Status of the TradeType
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TradeType.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TradeType.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TradeType.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TradeType.isEnabled());
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
		Assert.assertEquals(unnamed.getAttribute("name"),data);
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
@FindBy(how= How.ID, using = "Submit")
	public static WebElement Submit;

public void verify_Submit_Status(String data){
		//Verifies the Status of the Submit
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Submit.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Submit.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Submit.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Submit.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Submit(){
		Submit.click();
}

@FindBy(how= How.ID, using = "AddressLine1")
	public static WebElement AddressLine1;

public void verify_AddressLine1(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(AddressLine1.getAttribute("value"),data);
	}

}

public void verify_AddressLine1_Status(String data){
		//Verifies the Status of the AddressLine1
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AddressLine1.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AddressLine1.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AddressLine1.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AddressLine1.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_AddressLine1(String data){
		AddressLine1.clear();
		AddressLine1.sendKeys(data);
}

@FindBy(how= How.ID, using = "AddressLine2")
	public static WebElement AddressLine2;

public void verify_AddressLine2(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(AddressLine2.getAttribute("value"),data);
	}

}

public void verify_AddressLine2_Status(String data){
		//Verifies the Status of the AddressLine2
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(AddressLine2.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(AddressLine2.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!AddressLine2.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!AddressLine2.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_AddressLine2(String data){
		AddressLine2.clear();
		AddressLine2.sendKeys(data);
}

@FindBy(how= How.ID, using = "City")
	public static WebElement City;

public void verify_City(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(City.getAttribute("value"),data);
	}

}

public void verify_City_Status(String data){
		//Verifies the Status of the City
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(City.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(City.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!City.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!City.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_City(String data){
		City.clear();
		City.sendKeys(data);
}

@FindBy(how= How.ID, using = "Location")
	public static WebElement Location;

public void verify_Location(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Location.getAttribute("value"),data);
	}

}

public void verify_Location_Status(String data){
		//Verifies the Status of the Location
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Location.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Location.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Location.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Location.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Location(String data){
		Select dropdown= new Select(Location);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Brand")
	public static WebElement Brand;

public void verify_Brand(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Brand.getAttribute("name"),data);
	}

}

public void verify_Brand_Status(String data){
		//Verifies the Status of the Brand
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Brand.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Brand.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Brand.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Brand.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "regNos")
	public static WebElement regNos;

public void verify_regNos(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(regNos.getAttribute("value"),data);
	}

}

public void verify_regNos_Status(String data){
		//Verifies the Status of the regNos
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(regNos.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(regNos.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!regNos.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!regNos.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_regNos(String data){
		Select dropdown= new Select(regNos);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "OrderType")
	public static WebElement OrderType;

public void verify_OrderType(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OrderType.getAttribute("value"),data);
	}

}

public void verify_OrderType_Status(String data){
		//Verifies the Status of the OrderType
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OrderType.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OrderType.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OrderType.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OrderType.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_OrderType(String data){
		Select dropdown= new Select(OrderType);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "OrderTime")
	public static WebElement OrderTime;

public void verify_OrderTime(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OrderTime.getAttribute("name"),data);
	}

}

public void verify_OrderTime_Status(String data){
		//Verifies the Status of the OrderTime
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OrderTime.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OrderTime.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OrderTime.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OrderTime.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "TransferRC")
	public static WebElement TransferRC;

public void verify_TransferRC_Status(String data){
		//Verifies the Status of the TransferRC
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(TransferRC.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(TransferRC.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!TransferRC.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!TransferRC.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_TransferRC(){
		TransferRC.click();
}

@FindBy(how= How.ID, using = "Buy_Insurance")
	public static WebElement Buy_Insurance;

public void verify_Buy_Insurance_Status(String data){
		//Verifies the Status of the Buy_Insurance
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Buy_Insurance.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Buy_Insurance.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Buy_Insurance.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Buy_Insurance.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Buy_Insurance(){
		Buy_Insurance.click();
}

@FindBy(how= How.ID, using = "TradeType_Buy")
	public WebElement TradeType_Buy;

public void verify_TradeType_Buy_Status(String data){
		//Verifies the Status of the TradeType_Buy
		Assert.assertEquals(TradeType_Buy,TradeType_Buy);
}

public void select_TradeType_Buy(){
		TradeType_Buy.click();
}

@FindBy(how= How.ID, using = "TradeType_Sell")
	public WebElement TradeType_Sell;

public void verify_TradeType_Sell_Status(String data){
		//Verifies the Status of the TradeType_Sell
		Assert.assertEquals(TradeType_Sell,TradeType_Sell);
}

public void select_TradeType_Sell(){
		TradeType_Sell.click();
}

@FindBy(how= How.ID, using = "TradeType_City")
	public WebElement TradeType_City;

public void verify_TradeType_City_Status(String data){
		//Verifies the Status of the TradeType_City
		Assert.assertEquals(TradeType_City,TradeType_City);
}

public void select_TradeType_City(){
		TradeType_City.click();
}

@FindBy(how= How.ID, using = "TradeType_Mumbai")
	public WebElement TradeType_Mumbai;

public void verify_TradeType_Mumbai_Status(String data){
		//Verifies the Status of the TradeType_Mumbai
		Assert.assertEquals(TradeType_Mumbai,TradeType_Mumbai);
}

public void select_TradeType_Mumbai(){
		TradeType_Mumbai.click();
}

@FindBy(how= How.ID, using = "TradeType_Delhi")
	public WebElement TradeType_Delhi;

public void verify_TradeType_Delhi_Status(String data){
		//Verifies the Status of the TradeType_Delhi
		Assert.assertEquals(TradeType_Delhi,TradeType_Delhi);
}

public void select_TradeType_Delhi(){
		TradeType_Delhi.click();
}

@FindBy(how= How.ID, using = "TradeType_Brands")
	public WebElement TradeType_Brands;

public void verify_TradeType_Brands_Status(String data){
		//Verifies the Status of the TradeType_Brands
		Assert.assertEquals(TradeType_Brands,TradeType_Brands);
}

public void select_TradeType_Brands(){
		TradeType_Brands.click();
}

@FindBy(how= How.ID, using = "TradeType_BMW")
	public WebElement TradeType_BMW;

public void verify_TradeType_BMW_Status(String data){
		//Verifies the Status of the TradeType_BMW
		Assert.assertEquals(TradeType_BMW,TradeType_BMW);
}

public void select_TradeType_BMW(){
		TradeType_BMW.click();
}

@FindBy(how= How.ID, using = "TradeType_Mercedes")
	public WebElement TradeType_Mercedes;

public void verify_TradeType_Mercedes_Status(String data){
		//Verifies the Status of the TradeType_Mercedes
		Assert.assertEquals(TradeType_Mercedes,TradeType_Mercedes);
}

public void select_TradeType_Mercedes(){
		TradeType_Mercedes.click();
}

@FindBy(how= How.ID, using = "TradeType_Audi")
	public WebElement TradeType_Audi;

public void verify_TradeType_Audi_Status(String data){
		//Verifies the Status of the TradeType_Audi
		Assert.assertEquals(TradeType_Audi,TradeType_Audi);
}

public void select_TradeType_Audi(){
		TradeType_Audi.click();
}

@FindBy(how= How.ID, using = "TradeType_Jaguar")
	public WebElement TradeType_Jaguar;

public void verify_TradeType_Jaguar_Status(String data){
		//Verifies the Status of the TradeType_Jaguar
		Assert.assertEquals(TradeType_Jaguar,TradeType_Jaguar);
}

public void select_TradeType_Jaguar(){
		TradeType_Jaguar.click();
}

@FindBy(how= How.ID, using = "TradeType_Honda")
	public WebElement TradeType_Honda;

public void verify_TradeType_Honda_Status(String data){
		//Verifies the Status of the TradeType_Honda
		Assert.assertEquals(TradeType_Honda,TradeType_Honda);
}

public void select_TradeType_Honda(){
		TradeType_Honda.click();
}

@FindBy(how= How.ID, using = "TradeType_RegNos")
	public WebElement TradeType_RegNos;

public void verify_TradeType_RegNos_Status(String data){
		//Verifies the Status of the TradeType_RegNos
		Assert.assertEquals(TradeType_RegNos,TradeType_RegNos);
}

public void select_TradeType_RegNos(){
		TradeType_RegNos.click();
}

@FindBy(how= How.ID, using = "TradeType_ValidList")
	public WebElement TradeType_ValidList;

public void verify_TradeType_ValidList_Status(String data){
		//Verifies the Status of the TradeType_ValidList
		Assert.assertEquals(TradeType_ValidList,TradeType_ValidList);
}

public void select_TradeType_ValidList(){
		TradeType_ValidList.click();
}

@FindBy(how= How.ID, using = "TradeType_InvalidList")
	public WebElement TradeType_InvalidList;

public void verify_TradeType_InvalidList_Status(String data){
		//Verifies the Status of the TradeType_InvalidList
		Assert.assertEquals(TradeType_InvalidList,TradeType_InvalidList);
}

public void select_TradeType_InvalidList(){
		TradeType_InvalidList.click();
}

@FindBy(how= How.ID, using = "TradeType_OrderType")
	public WebElement TradeType_OrderType;

public void verify_TradeType_OrderType_Status(String data){
		//Verifies the Status of the TradeType_OrderType
		Assert.assertEquals(TradeType_OrderType,TradeType_OrderType);
}

public void select_TradeType_OrderType(){
		TradeType_OrderType.click();
}

@FindBy(how= How.ID, using = "TradeType_EBooking")
	public WebElement TradeType_EBooking;

public void verify_TradeType_EBooking_Status(String data){
		//Verifies the Status of the TradeType_EBooking
		Assert.assertEquals(TradeType_EBooking,TradeType_EBooking);
}

public void select_TradeType_EBooking(){
		TradeType_EBooking.click();
}

@FindBy(how= How.ID, using = "TradeType_InStore")
	public WebElement TradeType_InStore;

public void verify_TradeType_InStore_Status(String data){
		//Verifies the Status of the TradeType_InStore
		Assert.assertEquals(TradeType_InStore,TradeType_InStore);
}

public void select_TradeType_InStore(){
		TradeType_InStore.click();
}

@FindBy(how= How.ID, using = "TradeType_OrderTime")
	public WebElement TradeType_OrderTime;

public void verify_TradeType_OrderTime_Status(String data){
		//Verifies the Status of the TradeType_OrderTime
		Assert.assertEquals(TradeType_OrderTime,TradeType_OrderTime);
}

public void select_TradeType_OrderTime(){
		TradeType_OrderTime.click();
}

@FindBy(how= How.ID, using = "TradeType_DuringWkgHrs")
	public WebElement TradeType_DuringWkgHrs;

public void verify_TradeType_DuringWkgHrs_Status(String data){
		//Verifies the Status of the TradeType_DuringWkgHrs
		Assert.assertEquals(TradeType_DuringWkgHrs,TradeType_DuringWkgHrs);
}

public void select_TradeType_DuringWkgHrs(){
		TradeType_DuringWkgHrs.click();
}

@FindBy(how= How.ID, using = "TradeType_OutsideWkgHrs")
	public WebElement TradeType_OutsideWkgHrs;

public void verify_TradeType_OutsideWkgHrs_Status(String data){
		//Verifies the Status of the TradeType_OutsideWkgHrs
		Assert.assertEquals(TradeType_OutsideWkgHrs,TradeType_OutsideWkgHrs);
}

public void select_TradeType_OutsideWkgHrs(){
		TradeType_OutsideWkgHrs.click();
}

@FindBy(how= How.ID, using = "TradeType_TrasferRC")
	public WebElement TradeType_TrasferRC;

public void verify_TradeType_TrasferRC_Status(String data){
		//Verifies the Status of the TradeType_TrasferRC
		Assert.assertEquals(TradeType_TrasferRC,TradeType_TrasferRC);
}

public void select_TradeType_TrasferRC(){
		TradeType_TrasferRC.click();
}

@FindBy(how= How.ID, using = "Submit_BuySell")
	public WebElement Submit_BuySell;

public void verify_Submit_BuySell_Status(String data){
		//Verifies the Status of the Submit_BuySell
		Assert.assertEquals(Submit_BuySell,Submit_BuySell);
}

public void select_Submit_BuySell(){
		Submit_BuySell.click();
}

@FindBy(how= How.ID, using = "Submit_Buy")
	public WebElement Submit_Buy;

public void verify_Submit_Buy_Status(String data){
		//Verifies the Status of the Submit_Buy
		Assert.assertEquals(Submit_Buy,Submit_Buy);
}

public void select_Submit_Buy(){
		Submit_Buy.click();
}

@FindBy(how= How.ID, using = "Submit_Sell")
	public WebElement Submit_Sell;

public void verify_Submit_Sell_Status(String data){
		//Verifies the Status of the Submit_Sell
		Assert.assertEquals(Submit_Sell,Submit_Sell);
}

public void select_Submit_Sell(){
		Submit_Sell.click();
}

@FindBy(how= How.ID, using = "Submit_City")
	public WebElement Submit_City;

public void verify_Submit_City_Status(String data){
		//Verifies the Status of the Submit_City
		Assert.assertEquals(Submit_City,Submit_City);
}

public void select_Submit_City(){
		Submit_City.click();
}

@FindBy(how= How.ID, using = "Submit_Mumbai")
	public WebElement Submit_Mumbai;

public void verify_Submit_Mumbai_Status(String data){
		//Verifies the Status of the Submit_Mumbai
		Assert.assertEquals(Submit_Mumbai,Submit_Mumbai);
}

public void select_Submit_Mumbai(){
		Submit_Mumbai.click();
}

@FindBy(how= How.ID, using = "Submit_Delhi")
	public WebElement Submit_Delhi;

public void verify_Submit_Delhi_Status(String data){
		//Verifies the Status of the Submit_Delhi
		Assert.assertEquals(Submit_Delhi,Submit_Delhi);
}

public void select_Submit_Delhi(){
		Submit_Delhi.click();
}

@FindBy(how= How.ID, using = "Submit_Brands")
	public WebElement Submit_Brands;

public void verify_Submit_Brands_Status(String data){
		//Verifies the Status of the Submit_Brands
		Assert.assertEquals(Submit_Brands,Submit_Brands);
}

public void select_Submit_Brands(){
		Submit_Brands.click();
}

@FindBy(how= How.ID, using = "Submit_BMW")
	public WebElement Submit_BMW;

public void verify_Submit_BMW_Status(String data){
		//Verifies the Status of the Submit_BMW
		Assert.assertEquals(Submit_BMW,Submit_BMW);
}

public void select_Submit_BMW(){
		Submit_BMW.click();
}

@FindBy(how= How.ID, using = "Submit_Mercedes")
	public WebElement Submit_Mercedes;

public void verify_Submit_Mercedes_Status(String data){
		//Verifies the Status of the Submit_Mercedes
		Assert.assertEquals(Submit_Mercedes,Submit_Mercedes);
}

public void select_Submit_Mercedes(){
		Submit_Mercedes.click();
}

@FindBy(how= How.ID, using = "Submit_Audi")
	public WebElement Submit_Audi;

public void verify_Submit_Audi_Status(String data){
		//Verifies the Status of the Submit_Audi
		Assert.assertEquals(Submit_Audi,Submit_Audi);
}

public void select_Submit_Audi(){
		Submit_Audi.click();
}

@FindBy(how= How.ID, using = "Submit_Jaguar")
	public WebElement Submit_Jaguar;

public void verify_Submit_Jaguar_Status(String data){
		//Verifies the Status of the Submit_Jaguar
		Assert.assertEquals(Submit_Jaguar,Submit_Jaguar);
}

public void select_Submit_Jaguar(){
		Submit_Jaguar.click();
}

@FindBy(how= How.ID, using = "Submit_Honda")
	public WebElement Submit_Honda;

public void verify_Submit_Honda_Status(String data){
		//Verifies the Status of the Submit_Honda
		Assert.assertEquals(Submit_Honda,Submit_Honda);
}

public void select_Submit_Honda(){
		Submit_Honda.click();
}

@FindBy(how= How.ID, using = "Submit_RegNos")
	public WebElement Submit_RegNos;

public void verify_Submit_RegNos_Status(String data){
		//Verifies the Status of the Submit_RegNos
		Assert.assertEquals(Submit_RegNos,Submit_RegNos);
}

public void select_Submit_RegNos(){
		Submit_RegNos.click();
}

@FindBy(how= How.ID, using = "Submit_ValidList")
	public WebElement Submit_ValidList;

public void verify_Submit_ValidList_Status(String data){
		//Verifies the Status of the Submit_ValidList
		Assert.assertEquals(Submit_ValidList,Submit_ValidList);
}

public void select_Submit_ValidList(){
		Submit_ValidList.click();
}

@FindBy(how= How.ID, using = "Submit_InvalidList")
	public WebElement Submit_InvalidList;

public void verify_Submit_InvalidList_Status(String data){
		//Verifies the Status of the Submit_InvalidList
		Assert.assertEquals(Submit_InvalidList,Submit_InvalidList);
}

public void select_Submit_InvalidList(){
		Submit_InvalidList.click();
}

@FindBy(how= How.ID, using = "Submit_OrderType")
	public WebElement Submit_OrderType;

public void verify_Submit_OrderType_Status(String data){
		//Verifies the Status of the Submit_OrderType
		Assert.assertEquals(Submit_OrderType,Submit_OrderType);
}

public void select_Submit_OrderType(){
		Submit_OrderType.click();
}

@FindBy(how= How.ID, using = "Submit_EBooking")
	public WebElement Submit_EBooking;

public void verify_Submit_EBooking_Status(String data){
		//Verifies the Status of the Submit_EBooking
		Assert.assertEquals(Submit_EBooking,Submit_EBooking);
}

public void select_Submit_EBooking(){
		Submit_EBooking.click();
}

@FindBy(how= How.ID, using = "Submit_InStore")
	public WebElement Submit_InStore;

public void verify_Submit_InStore_Status(String data){
		//Verifies the Status of the Submit_InStore
		Assert.assertEquals(Submit_InStore,Submit_InStore);
}

public void select_Submit_InStore(){
		Submit_InStore.click();
}

@FindBy(how= How.ID, using = "Submit_OrderTime")
	public WebElement Submit_OrderTime;

public void verify_Submit_OrderTime_Status(String data){
		//Verifies the Status of the Submit_OrderTime
		Assert.assertEquals(Submit_OrderTime,Submit_OrderTime);
}

public void select_Submit_OrderTime(){
		Submit_OrderTime.click();
}

@FindBy(how= How.ID, using = "Submit_DuringWkgHrs")
	public WebElement Submit_DuringWkgHrs;

public void verify_Submit_DuringWkgHrs_Status(String data){
		//Verifies the Status of the Submit_DuringWkgHrs
		Assert.assertEquals(Submit_DuringWkgHrs,Submit_DuringWkgHrs);
}

public void select_Submit_DuringWkgHrs(){
		Submit_DuringWkgHrs.click();
}

@FindBy(how= How.ID, using = "Submit_OutsideWkgHrs")
	public WebElement Submit_OutsideWkgHrs;

public void verify_Submit_OutsideWkgHrs_Status(String data){
		//Verifies the Status of the Submit_OutsideWkgHrs
		Assert.assertEquals(Submit_OutsideWkgHrs,Submit_OutsideWkgHrs);
}

public void select_Submit_OutsideWkgHrs(){
		Submit_OutsideWkgHrs.click();
}

@FindBy(how= How.ID, using = "Submit_TrasferRC")
	public WebElement Submit_TrasferRC;

public void verify_Submit_TrasferRC_Status(String data){
		//Verifies the Status of the Submit_TrasferRC
		Assert.assertEquals(Submit_TrasferRC,Submit_TrasferRC);
}

public void select_Submit_TrasferRC(){
		Submit_TrasferRC.click();
}

@FindBy(how= How.ID, using = "Submit_BuySell")
	public WebElement Submit_BuySell;

public void verify_Submit_BuySell_Status(String data){
		//Verifies the Status of the Submit_BuySell
		Assert.assertEquals(Submit_BuySell,Submit_BuySell);
}

public void select_Submit_BuySell(){
		Submit_BuySell.click();
}

@FindBy(how= How.ID, using = "Submit_Buy")
	public WebElement Submit_Buy;

public void verify_Submit_Buy_Status(String data){
		//Verifies the Status of the Submit_Buy
		Assert.assertEquals(Submit_Buy,Submit_Buy);
}

public void select_Submit_Buy(){
		Submit_Buy.click();
}

@FindBy(how= How.ID, using = "Submit_Sell")
	public WebElement Submit_Sell;

public void verify_Submit_Sell_Status(String data){
		//Verifies the Status of the Submit_Sell
		Assert.assertEquals(Submit_Sell,Submit_Sell);
}

public void select_Submit_Sell(){
		Submit_Sell.click();
}

@FindBy(how= How.ID, using = "Submit_City")
	public WebElement Submit_City;

public void verify_Submit_City_Status(String data){
		//Verifies the Status of the Submit_City
		Assert.assertEquals(Submit_City,Submit_City);
}

public void select_Submit_City(){
		Submit_City.click();
}

@FindBy(how= How.ID, using = "Submit_Mumbai")
	public WebElement Submit_Mumbai;

public void verify_Submit_Mumbai_Status(String data){
		//Verifies the Status of the Submit_Mumbai
		Assert.assertEquals(Submit_Mumbai,Submit_Mumbai);
}

public void select_Submit_Mumbai(){
		Submit_Mumbai.click();
}

@FindBy(how= How.ID, using = "Submit_Delhi")
	public WebElement Submit_Delhi;

public void verify_Submit_Delhi_Status(String data){
		//Verifies the Status of the Submit_Delhi
		Assert.assertEquals(Submit_Delhi,Submit_Delhi);
}

public void select_Submit_Delhi(){
		Submit_Delhi.click();
}

@FindBy(how= How.ID, using = "Submit_Brands")
	public WebElement Submit_Brands;

public void verify_Submit_Brands_Status(String data){
		//Verifies the Status of the Submit_Brands
		Assert.assertEquals(Submit_Brands,Submit_Brands);
}

public void select_Submit_Brands(){
		Submit_Brands.click();
}

@FindBy(how= How.ID, using = "Submit_BMW")
	public WebElement Submit_BMW;

public void verify_Submit_BMW_Status(String data){
		//Verifies the Status of the Submit_BMW
		Assert.assertEquals(Submit_BMW,Submit_BMW);
}

public void select_Submit_BMW(){
		Submit_BMW.click();
}

@FindBy(how= How.ID, using = "Submit_Mercedes")
	public WebElement Submit_Mercedes;

public void verify_Submit_Mercedes_Status(String data){
		//Verifies the Status of the Submit_Mercedes
		Assert.assertEquals(Submit_Mercedes,Submit_Mercedes);
}

public void select_Submit_Mercedes(){
		Submit_Mercedes.click();
}

@FindBy(how= How.ID, using = "Submit_Audi")
	public WebElement Submit_Audi;

public void verify_Submit_Audi_Status(String data){
		//Verifies the Status of the Submit_Audi
		Assert.assertEquals(Submit_Audi,Submit_Audi);
}

public void select_Submit_Audi(){
		Submit_Audi.click();
}

@FindBy(how= How.ID, using = "Submit_Jaguar")
	public WebElement Submit_Jaguar;

public void verify_Submit_Jaguar_Status(String data){
		//Verifies the Status of the Submit_Jaguar
		Assert.assertEquals(Submit_Jaguar,Submit_Jaguar);
}

public void select_Submit_Jaguar(){
		Submit_Jaguar.click();
}

@FindBy(how= How.ID, using = "Submit_Honda")
	public WebElement Submit_Honda;

public void verify_Submit_Honda_Status(String data){
		//Verifies the Status of the Submit_Honda
		Assert.assertEquals(Submit_Honda,Submit_Honda);
}

public void select_Submit_Honda(){
		Submit_Honda.click();
}

@FindBy(how= How.ID, using = "Submit_RegNos")
	public WebElement Submit_RegNos;

public void verify_Submit_RegNos_Status(String data){
		//Verifies the Status of the Submit_RegNos
		Assert.assertEquals(Submit_RegNos,Submit_RegNos);
}

public void select_Submit_RegNos(){
		Submit_RegNos.click();
}

@FindBy(how= How.ID, using = "Submit_ValidList")
	public WebElement Submit_ValidList;

public void verify_Submit_ValidList_Status(String data){
		//Verifies the Status of the Submit_ValidList
		Assert.assertEquals(Submit_ValidList,Submit_ValidList);
}

public void select_Submit_ValidList(){
		Submit_ValidList.click();
}

@FindBy(how= How.ID, using = "Submit_InvalidList")
	public WebElement Submit_InvalidList;

public void verify_Submit_InvalidList_Status(String data){
		//Verifies the Status of the Submit_InvalidList
		Assert.assertEquals(Submit_InvalidList,Submit_InvalidList);
}

public void select_Submit_InvalidList(){
		Submit_InvalidList.click();
}

@FindBy(how= How.ID, using = "Submit_OrderType")
	public WebElement Submit_OrderType;

public void verify_Submit_OrderType_Status(String data){
		//Verifies the Status of the Submit_OrderType
		Assert.assertEquals(Submit_OrderType,Submit_OrderType);
}

public void select_Submit_OrderType(){
		Submit_OrderType.click();
}

@FindBy(how= How.ID, using = "Submit_EBooking")
	public WebElement Submit_EBooking;

public void verify_Submit_EBooking_Status(String data){
		//Verifies the Status of the Submit_EBooking
		Assert.assertEquals(Submit_EBooking,Submit_EBooking);
}

public void select_Submit_EBooking(){
		Submit_EBooking.click();
}

@FindBy(how= How.ID, using = "Submit_InStore")
	public WebElement Submit_InStore;

public void verify_Submit_InStore_Status(String data){
		//Verifies the Status of the Submit_InStore
		Assert.assertEquals(Submit_InStore,Submit_InStore);
}

public void select_Submit_InStore(){
		Submit_InStore.click();
}

@FindBy(how= How.ID, using = "Submit_OrderTime")
	public WebElement Submit_OrderTime;

public void verify_Submit_OrderTime_Status(String data){
		//Verifies the Status of the Submit_OrderTime
		Assert.assertEquals(Submit_OrderTime,Submit_OrderTime);
}

public void select_Submit_OrderTime(){
		Submit_OrderTime.click();
}

@FindBy(how= How.ID, using = "Submit_DuringWkgHrs")
	public WebElement Submit_DuringWkgHrs;

public void verify_Submit_DuringWkgHrs_Status(String data){
		//Verifies the Status of the Submit_DuringWkgHrs
		Assert.assertEquals(Submit_DuringWkgHrs,Submit_DuringWkgHrs);
}

public void select_Submit_DuringWkgHrs(){
		Submit_DuringWkgHrs.click();
}

@FindBy(how= How.ID, using = "Submit_OutsideWkgHrs")
	public WebElement Submit_OutsideWkgHrs;

public void verify_Submit_OutsideWkgHrs_Status(String data){
		//Verifies the Status of the Submit_OutsideWkgHrs
		Assert.assertEquals(Submit_OutsideWkgHrs,Submit_OutsideWkgHrs);
}

public void select_Submit_OutsideWkgHrs(){
		Submit_OutsideWkgHrs.click();
}

@FindBy(how= How.ID, using = "Submit_TrasferRC")
	public WebElement Submit_TrasferRC;

public void verify_Submit_TrasferRC_Status(String data){
		//Verifies the Status of the Submit_TrasferRC
		Assert.assertEquals(Submit_TrasferRC,Submit_TrasferRC);
}

public void select_Submit_TrasferRC(){
		Submit_TrasferRC.click();
}

@FindBy(how= How.ID, using = "Submit_BuySell")
	public WebElement Submit_BuySell;

public void verify_Submit_BuySell_Status(String data){
		//Verifies the Status of the Submit_BuySell
		Assert.assertEquals(Submit_BuySell,Submit_BuySell);
}

public void select_Submit_BuySell(){
		Submit_BuySell.click();
}

@FindBy(how= How.ID, using = "Submit_Buy")
	public WebElement Submit_Buy;

public void verify_Submit_Buy_Status(String data){
		//Verifies the Status of the Submit_Buy
		Assert.assertEquals(Submit_Buy,Submit_Buy);
}

public void select_Submit_Buy(){
		Submit_Buy.click();
}

@FindBy(how= How.ID, using = "Submit_Sell")
	public WebElement Submit_Sell;

public void verify_Submit_Sell_Status(String data){
		//Verifies the Status of the Submit_Sell
		Assert.assertEquals(Submit_Sell,Submit_Sell);
}

public void select_Submit_Sell(){
		Submit_Sell.click();
}

@FindBy(how= How.ID, using = "Submit_City")
	public WebElement Submit_City;

public void verify_Submit_City_Status(String data){
		//Verifies the Status of the Submit_City
		Assert.assertEquals(Submit_City,Submit_City);
}

public void select_Submit_City(){
		Submit_City.click();
}

@FindBy(how= How.ID, using = "Submit_Mumbai")
	public WebElement Submit_Mumbai;

public void verify_Submit_Mumbai_Status(String data){
		//Verifies the Status of the Submit_Mumbai
		Assert.assertEquals(Submit_Mumbai,Submit_Mumbai);
}

public void select_Submit_Mumbai(){
		Submit_Mumbai.click();
}

@FindBy(how= How.ID, using = "Submit_Delhi")
	public WebElement Submit_Delhi;

public void verify_Submit_Delhi_Status(String data){
		//Verifies the Status of the Submit_Delhi
		Assert.assertEquals(Submit_Delhi,Submit_Delhi);
}

public void select_Submit_Delhi(){
		Submit_Delhi.click();
}

@FindBy(how= How.ID, using = "Submit_Brands")
	public WebElement Submit_Brands;

public void verify_Submit_Brands_Status(String data){
		//Verifies the Status of the Submit_Brands
		Assert.assertEquals(Submit_Brands,Submit_Brands);
}

public void select_Submit_Brands(){
		Submit_Brands.click();
}

@FindBy(how= How.ID, using = "Submit_BMW")
	public WebElement Submit_BMW;

public void verify_Submit_BMW_Status(String data){
		//Verifies the Status of the Submit_BMW
		Assert.assertEquals(Submit_BMW,Submit_BMW);
}

public void select_Submit_BMW(){
		Submit_BMW.click();
}

@FindBy(how= How.ID, using = "Submit_Mercedes")
	public WebElement Submit_Mercedes;

public void verify_Submit_Mercedes_Status(String data){
		//Verifies the Status of the Submit_Mercedes
		Assert.assertEquals(Submit_Mercedes,Submit_Mercedes);
}

public void select_Submit_Mercedes(){
		Submit_Mercedes.click();
}

@FindBy(how= How.ID, using = "Submit_Audi")
	public WebElement Submit_Audi;

public void verify_Submit_Audi_Status(String data){
		//Verifies the Status of the Submit_Audi
		Assert.assertEquals(Submit_Audi,Submit_Audi);
}

public void select_Submit_Audi(){
		Submit_Audi.click();
}

@FindBy(how= How.ID, using = "Submit_Jaguar")
	public WebElement Submit_Jaguar;

public void verify_Submit_Jaguar_Status(String data){
		//Verifies the Status of the Submit_Jaguar
		Assert.assertEquals(Submit_Jaguar,Submit_Jaguar);
}

public void select_Submit_Jaguar(){
		Submit_Jaguar.click();
}

@FindBy(how= How.ID, using = "Submit_Honda")
	public WebElement Submit_Honda;

public void verify_Submit_Honda_Status(String data){
		//Verifies the Status of the Submit_Honda
		Assert.assertEquals(Submit_Honda,Submit_Honda);
}

public void select_Submit_Honda(){
		Submit_Honda.click();
}

@FindBy(how= How.ID, using = "Submit_RegNos")
	public WebElement Submit_RegNos;

public void verify_Submit_RegNos_Status(String data){
		//Verifies the Status of the Submit_RegNos
		Assert.assertEquals(Submit_RegNos,Submit_RegNos);
}

public void select_Submit_RegNos(){
		Submit_RegNos.click();
}

@FindBy(how= How.ID, using = "Submit_ValidList")
	public WebElement Submit_ValidList;

public void verify_Submit_ValidList_Status(String data){
		//Verifies the Status of the Submit_ValidList
		Assert.assertEquals(Submit_ValidList,Submit_ValidList);
}

public void select_Submit_ValidList(){
		Submit_ValidList.click();
}

@FindBy(how= How.ID, using = "Submit_InvalidList")
	public WebElement Submit_InvalidList;

public void verify_Submit_InvalidList_Status(String data){
		//Verifies the Status of the Submit_InvalidList
		Assert.assertEquals(Submit_InvalidList,Submit_InvalidList);
}

public void select_Submit_InvalidList(){
		Submit_InvalidList.click();
}

@FindBy(how= How.ID, using = "Submit_OrderType")
	public WebElement Submit_OrderType;

public void verify_Submit_OrderType_Status(String data){
		//Verifies the Status of the Submit_OrderType
		Assert.assertEquals(Submit_OrderType,Submit_OrderType);
}

public void select_Submit_OrderType(){
		Submit_OrderType.click();
}

@FindBy(how= How.ID, using = "Submit_EBooking")
	public WebElement Submit_EBooking;

public void verify_Submit_EBooking_Status(String data){
		//Verifies the Status of the Submit_EBooking
		Assert.assertEquals(Submit_EBooking,Submit_EBooking);
}

public void select_Submit_EBooking(){
		Submit_EBooking.click();
}

@FindBy(how= How.ID, using = "Submit_InStore")
	public WebElement Submit_InStore;

public void verify_Submit_InStore_Status(String data){
		//Verifies the Status of the Submit_InStore
		Assert.assertEquals(Submit_InStore,Submit_InStore);
}

public void select_Submit_InStore(){
		Submit_InStore.click();
}

@FindBy(how= How.ID, using = "Submit_OrderTime")
	public WebElement Submit_OrderTime;

public void verify_Submit_OrderTime_Status(String data){
		//Verifies the Status of the Submit_OrderTime
		Assert.assertEquals(Submit_OrderTime,Submit_OrderTime);
}

public void select_Submit_OrderTime(){
		Submit_OrderTime.click();
}

@FindBy(how= How.ID, using = "Submit_DuringWkgHrs")
	public WebElement Submit_DuringWkgHrs;

public void verify_Submit_DuringWkgHrs_Status(String data){
		//Verifies the Status of the Submit_DuringWkgHrs
		Assert.assertEquals(Submit_DuringWkgHrs,Submit_DuringWkgHrs);
}

public void select_Submit_DuringWkgHrs(){
		Submit_DuringWkgHrs.click();
}

@FindBy(how= How.ID, using = "Submit_OutsideWkgHrs")
	public WebElement Submit_OutsideWkgHrs;

public void verify_Submit_OutsideWkgHrs_Status(String data){
		//Verifies the Status of the Submit_OutsideWkgHrs
		Assert.assertEquals(Submit_OutsideWkgHrs,Submit_OutsideWkgHrs);
}

public void select_Submit_OutsideWkgHrs(){
		Submit_OutsideWkgHrs.click();
}

@FindBy(how= How.ID, using = "Submit_TrasferRC")
	public WebElement Submit_TrasferRC;

public void verify_Submit_TrasferRC_Status(String data){
		//Verifies the Status of the Submit_TrasferRC
		Assert.assertEquals(Submit_TrasferRC,Submit_TrasferRC);
}

public void select_Submit_TrasferRC(){
		Submit_TrasferRC.click();
}

@FindBy(how= How.ID, using = "Submit_BuySell")
	public WebElement Submit_BuySell;

public void verify_Submit_BuySell_Status(String data){
		//Verifies the Status of the Submit_BuySell
		Assert.assertEquals(Submit_BuySell,Submit_BuySell);
}

public void select_Submit_BuySell(){
		Submit_BuySell.click();
}

@FindBy(how= How.ID, using = "Submit_Buy")
	public WebElement Submit_Buy;

public void verify_Submit_Buy_Status(String data){
		//Verifies the Status of the Submit_Buy
		Assert.assertEquals(Submit_Buy,Submit_Buy);
}

public void select_Submit_Buy(){
		Submit_Buy.click();
}

@FindBy(how= How.ID, using = "Submit_Sell")
	public WebElement Submit_Sell;

public void verify_Submit_Sell_Status(String data){
		//Verifies the Status of the Submit_Sell
		Assert.assertEquals(Submit_Sell,Submit_Sell);
}

public void select_Submit_Sell(){
		Submit_Sell.click();
}

@FindBy(how= How.ID, using = "Submit_Mumbai")
	public WebElement Submit_Mumbai;

public void verify_Submit_Mumbai_Status(String data){
		//Verifies the Status of the Submit_Mumbai
		Assert.assertEquals(Submit_Mumbai,Submit_Mumbai);
}

public void select_Submit_Mumbai(){
		Submit_Mumbai.click();
}

@FindBy(how= How.ID, using = "Submit_Delhi")
	public WebElement Submit_Delhi;

public void verify_Submit_Delhi_Status(String data){
		//Verifies the Status of the Submit_Delhi
		Assert.assertEquals(Submit_Delhi,Submit_Delhi);
}

public void select_Submit_Delhi(){
		Submit_Delhi.click();
}

@FindBy(how= How.ID, using = "Submit_Brands")
	public WebElement Submit_Brands;

public void verify_Submit_Brands_Status(String data){
		//Verifies the Status of the Submit_Brands
		Assert.assertEquals(Submit_Brands,Submit_Brands);
}

public void select_Submit_Brands(){
		Submit_Brands.click();
}

@FindBy(how= How.ID, using = "Submit_BMW")
	public WebElement Submit_BMW;

public void verify_Submit_BMW_Status(String data){
		//Verifies the Status of the Submit_BMW
		Assert.assertEquals(Submit_BMW,Submit_BMW);
}

public void select_Submit_BMW(){
		Submit_BMW.click();
}

@FindBy(how= How.ID, using = "Submit_Mercedes")
	public WebElement Submit_Mercedes;

public void verify_Submit_Mercedes_Status(String data){
		//Verifies the Status of the Submit_Mercedes
		Assert.assertEquals(Submit_Mercedes,Submit_Mercedes);
}

public void select_Submit_Mercedes(){
		Submit_Mercedes.click();
}

@FindBy(how= How.ID, using = "Submit_Audi")
	public WebElement Submit_Audi;

public void verify_Submit_Audi_Status(String data){
		//Verifies the Status of the Submit_Audi
		Assert.assertEquals(Submit_Audi,Submit_Audi);
}

public void select_Submit_Audi(){
		Submit_Audi.click();
}

@FindBy(how= How.ID, using = "Submit_Jaguar")
	public WebElement Submit_Jaguar;

public void verify_Submit_Jaguar_Status(String data){
		//Verifies the Status of the Submit_Jaguar
		Assert.assertEquals(Submit_Jaguar,Submit_Jaguar);
}

public void select_Submit_Jaguar(){
		Submit_Jaguar.click();
}

@FindBy(how= How.ID, using = "Submit_Honda")
	public WebElement Submit_Honda;

public void verify_Submit_Honda_Status(String data){
		//Verifies the Status of the Submit_Honda
		Assert.assertEquals(Submit_Honda,Submit_Honda);
}

public void select_Submit_Honda(){
		Submit_Honda.click();
}

@FindBy(how= How.ID, using = "Submit_RegNos")
	public WebElement Submit_RegNos;

public void verify_Submit_RegNos_Status(String data){
		//Verifies the Status of the Submit_RegNos
		Assert.assertEquals(Submit_RegNos,Submit_RegNos);
}

public void select_Submit_RegNos(){
		Submit_RegNos.click();
}

@FindBy(how= How.ID, using = "Submit_ValidList")
	public WebElement Submit_ValidList;

public void verify_Submit_ValidList_Status(String data){
		//Verifies the Status of the Submit_ValidList
		Assert.assertEquals(Submit_ValidList,Submit_ValidList);
}

public void select_Submit_ValidList(){
		Submit_ValidList.click();
}

@FindBy(how= How.ID, using = "Submit_InvalidList")
	public WebElement Submit_InvalidList;

public void verify_Submit_InvalidList_Status(String data){
		//Verifies the Status of the Submit_InvalidList
		Assert.assertEquals(Submit_InvalidList,Submit_InvalidList);
}

public void select_Submit_InvalidList(){
		Submit_InvalidList.click();
}

@FindBy(how= How.ID, using = "Submit_OrderType")
	public WebElement Submit_OrderType;

public void verify_Submit_OrderType_Status(String data){
		//Verifies the Status of the Submit_OrderType
		Assert.assertEquals(Submit_OrderType,Submit_OrderType);
}

public void select_Submit_OrderType(){
		Submit_OrderType.click();
}

@FindBy(how= How.ID, using = "Submit_EBooking")
	public WebElement Submit_EBooking;

public void verify_Submit_EBooking_Status(String data){
		//Verifies the Status of the Submit_EBooking
		Assert.assertEquals(Submit_EBooking,Submit_EBooking);
}

public void select_Submit_EBooking(){
		Submit_EBooking.click();
}

@FindBy(how= How.ID, using = "Submit_InStore")
	public WebElement Submit_InStore;

public void verify_Submit_InStore_Status(String data){
		//Verifies the Status of the Submit_InStore
		Assert.assertEquals(Submit_InStore,Submit_InStore);
}

public void select_Submit_InStore(){
		Submit_InStore.click();
}

@FindBy(how= How.ID, using = "Submit_OrderTime")
	public WebElement Submit_OrderTime;

public void verify_Submit_OrderTime_Status(String data){
		//Verifies the Status of the Submit_OrderTime
		Assert.assertEquals(Submit_OrderTime,Submit_OrderTime);
}

public void select_Submit_OrderTime(){
		Submit_OrderTime.click();
}

@FindBy(how= How.ID, using = "Submit_DuringWkgHrs")
	public WebElement Submit_DuringWkgHrs;

public void verify_Submit_DuringWkgHrs_Status(String data){
		//Verifies the Status of the Submit_DuringWkgHrs
		Assert.assertEquals(Submit_DuringWkgHrs,Submit_DuringWkgHrs);
}

public void select_Submit_DuringWkgHrs(){
		Submit_DuringWkgHrs.click();
}

@FindBy(how= How.ID, using = "Submit_OutsideWkgHrs")
	public WebElement Submit_OutsideWkgHrs;

public void verify_Submit_OutsideWkgHrs_Status(String data){
		//Verifies the Status of the Submit_OutsideWkgHrs
		Assert.assertEquals(Submit_OutsideWkgHrs,Submit_OutsideWkgHrs);
}

public void select_Submit_OutsideWkgHrs(){
		Submit_OutsideWkgHrs.click();
}

@FindBy(how= How.ID, using = "Submit_TrasferRC")
	public WebElement Submit_TrasferRC;

public void verify_Submit_TrasferRC_Status(String data){
		//Verifies the Status of the Submit_TrasferRC
		Assert.assertEquals(Submit_TrasferRC,Submit_TrasferRC);
}

public void select_Submit_TrasferRC(){
		Submit_TrasferRC.click();
}

@FindBy(how= How.ID, using = "Brand_BuySell")
	public WebElement Brand_BuySell;

public void verify_Brand_BuySell_Status(String data){
		//Verifies the Status of the Brand_BuySell
		Assert.assertEquals(Brand_BuySell,Brand_BuySell);
}

public void select_Brand_BuySell(){
		Brand_BuySell.click();
}

@FindBy(how= How.ID, using = "Brand_Buy")
	public WebElement Brand_Buy;

public void verify_Brand_Buy_Status(String data){
		//Verifies the Status of the Brand_Buy
		Assert.assertEquals(Brand_Buy,Brand_Buy);
}

public void select_Brand_Buy(){
		Brand_Buy.click();
}

@FindBy(how= How.ID, using = "Brand_Sell")
	public WebElement Brand_Sell;

public void verify_Brand_Sell_Status(String data){
		//Verifies the Status of the Brand_Sell
		Assert.assertEquals(Brand_Sell,Brand_Sell);
}

public void select_Brand_Sell(){
		Brand_Sell.click();
}

@FindBy(how= How.ID, using = "Brand_City")
	public WebElement Brand_City;

public void verify_Brand_City_Status(String data){
		//Verifies the Status of the Brand_City
		Assert.assertEquals(Brand_City,Brand_City);
}

public void select_Brand_City(){
		Brand_City.click();
}

@FindBy(how= How.ID, using = "Brand_Mumbai")
	public WebElement Brand_Mumbai;

public void verify_Brand_Mumbai_Status(String data){
		//Verifies the Status of the Brand_Mumbai
		Assert.assertEquals(Brand_Mumbai,Brand_Mumbai);
}

public void select_Brand_Mumbai(){
		Brand_Mumbai.click();
}

@FindBy(how= How.ID, using = "Brand_Delhi")
	public WebElement Brand_Delhi;

public void verify_Brand_Delhi_Status(String data){
		//Verifies the Status of the Brand_Delhi
		Assert.assertEquals(Brand_Delhi,Brand_Delhi);
}

public void select_Brand_Delhi(){
		Brand_Delhi.click();
}

@FindBy(how= How.ID, using = "Brand_BMW")
	public WebElement Brand_BMW;

public void verify_Brand_BMW_Status(String data){
		//Verifies the Status of the Brand_BMW
		Assert.assertEquals(Brand_BMW,Brand_BMW);
}

public void select_Brand_BMW(){
		Brand_BMW.click();
}

@FindBy(how= How.ID, using = "Brand_Mercedes")
	public WebElement Brand_Mercedes;

public void verify_Brand_Mercedes_Status(String data){
		//Verifies the Status of the Brand_Mercedes
		Assert.assertEquals(Brand_Mercedes,Brand_Mercedes);
}

public void select_Brand_Mercedes(){
		Brand_Mercedes.click();
}

@FindBy(how= How.ID, using = "Brand_Audi")
	public WebElement Brand_Audi;

public void verify_Brand_Audi_Status(String data){
		//Verifies the Status of the Brand_Audi
		Assert.assertEquals(Brand_Audi,Brand_Audi);
}

public void select_Brand_Audi(){
		Brand_Audi.click();
}

@FindBy(how= How.ID, using = "Brand_Jaguar")
	public WebElement Brand_Jaguar;

public void verify_Brand_Jaguar_Status(String data){
		//Verifies the Status of the Brand_Jaguar
		Assert.assertEquals(Brand_Jaguar,Brand_Jaguar);
}

public void select_Brand_Jaguar(){
		Brand_Jaguar.click();
}

@FindBy(how= How.ID, using = "Brand_Honda")
	public WebElement Brand_Honda;

public void verify_Brand_Honda_Status(String data){
		//Verifies the Status of the Brand_Honda
		Assert.assertEquals(Brand_Honda,Brand_Honda);
}

public void select_Brand_Honda(){
		Brand_Honda.click();
}

@FindBy(how= How.ID, using = "Brand_RegNos")
	public WebElement Brand_RegNos;

public void verify_Brand_RegNos_Status(String data){
		//Verifies the Status of the Brand_RegNos
		Assert.assertEquals(Brand_RegNos,Brand_RegNos);
}

public void select_Brand_RegNos(){
		Brand_RegNos.click();
}

@FindBy(how= How.ID, using = "Brand_ValidList")
	public WebElement Brand_ValidList;

public void verify_Brand_ValidList_Status(String data){
		//Verifies the Status of the Brand_ValidList
		Assert.assertEquals(Brand_ValidList,Brand_ValidList);
}

public void select_Brand_ValidList(){
		Brand_ValidList.click();
}

@FindBy(how= How.ID, using = "Brand_InvalidList")
	public WebElement Brand_InvalidList;

public void verify_Brand_InvalidList_Status(String data){
		//Verifies the Status of the Brand_InvalidList
		Assert.assertEquals(Brand_InvalidList,Brand_InvalidList);
}

public void select_Brand_InvalidList(){
		Brand_InvalidList.click();
}

@FindBy(how= How.ID, using = "Brand_OrderType")
	public WebElement Brand_OrderType;

public void verify_Brand_OrderType_Status(String data){
		//Verifies the Status of the Brand_OrderType
		Assert.assertEquals(Brand_OrderType,Brand_OrderType);
}

public void select_Brand_OrderType(){
		Brand_OrderType.click();
}

@FindBy(how= How.ID, using = "Brand_EBooking")
	public WebElement Brand_EBooking;

public void verify_Brand_EBooking_Status(String data){
		//Verifies the Status of the Brand_EBooking
		Assert.assertEquals(Brand_EBooking,Brand_EBooking);
}

public void select_Brand_EBooking(){
		Brand_EBooking.click();
}

@FindBy(how= How.ID, using = "Brand_InStore")
	public WebElement Brand_InStore;

public void verify_Brand_InStore_Status(String data){
		//Verifies the Status of the Brand_InStore
		Assert.assertEquals(Brand_InStore,Brand_InStore);
}

public void select_Brand_InStore(){
		Brand_InStore.click();
}

@FindBy(how= How.ID, using = "Brand_OrderTime")
	public WebElement Brand_OrderTime;

public void verify_Brand_OrderTime_Status(String data){
		//Verifies the Status of the Brand_OrderTime
		Assert.assertEquals(Brand_OrderTime,Brand_OrderTime);
}

public void select_Brand_OrderTime(){
		Brand_OrderTime.click();
}

@FindBy(how= How.ID, using = "Brand_DuringWkgHrs")
	public WebElement Brand_DuringWkgHrs;

public void verify_Brand_DuringWkgHrs_Status(String data){
		//Verifies the Status of the Brand_DuringWkgHrs
		Assert.assertEquals(Brand_DuringWkgHrs,Brand_DuringWkgHrs);
}

public void select_Brand_DuringWkgHrs(){
		Brand_DuringWkgHrs.click();
}

@FindBy(how= How.ID, using = "Brand_OutsideWkgHrs")
	public WebElement Brand_OutsideWkgHrs;

public void verify_Brand_OutsideWkgHrs_Status(String data){
		//Verifies the Status of the Brand_OutsideWkgHrs
		Assert.assertEquals(Brand_OutsideWkgHrs,Brand_OutsideWkgHrs);
}

public void select_Brand_OutsideWkgHrs(){
		Brand_OutsideWkgHrs.click();
}

@FindBy(how= How.ID, using = "Brand_TrasferRC")
	public WebElement Brand_TrasferRC;

public void verify_Brand_TrasferRC_Status(String data){
		//Verifies the Status of the Brand_TrasferRC
		Assert.assertEquals(Brand_TrasferRC,Brand_TrasferRC);
}

public void select_Brand_TrasferRC(){
		Brand_TrasferRC.click();
}

@FindBy(how= How.ID, using = "regNos_BuySell")
	public WebElement regNos_BuySell;

public void verify_regNos_BuySell_Status(String data){
		//Verifies the Status of the regNos_BuySell
		Assert.assertEquals(regNos_BuySell,regNos_BuySell);
}

public void select_regNos_BuySell(){
		regNos_BuySell.click();
}

@FindBy(how= How.ID, using = "regNos_Buy")
	public WebElement regNos_Buy;

public void verify_regNos_Buy_Status(String data){
		//Verifies the Status of the regNos_Buy
		Assert.assertEquals(regNos_Buy,regNos_Buy);
}

public void select_regNos_Buy(){
		regNos_Buy.click();
}

@FindBy(how= How.ID, using = "regNos_Sell")
	public WebElement regNos_Sell;

public void verify_regNos_Sell_Status(String data){
		//Verifies the Status of the regNos_Sell
		Assert.assertEquals(regNos_Sell,regNos_Sell);
}

public void select_regNos_Sell(){
		regNos_Sell.click();
}

@FindBy(how= How.ID, using = "regNos_City")
	public WebElement regNos_City;

public void verify_regNos_City_Status(String data){
		//Verifies the Status of the regNos_City
		Assert.assertEquals(regNos_City,regNos_City);
}

public void select_regNos_City(){
		regNos_City.click();
}

@FindBy(how= How.ID, using = "regNos_Mumbai")
	public WebElement regNos_Mumbai;

public void verify_regNos_Mumbai_Status(String data){
		//Verifies the Status of the regNos_Mumbai
		Assert.assertEquals(regNos_Mumbai,regNos_Mumbai);
}

public void select_regNos_Mumbai(){
		regNos_Mumbai.click();
}

@FindBy(how= How.ID, using = "regNos_Delhi")
	public WebElement regNos_Delhi;

public void verify_regNos_Delhi_Status(String data){
		//Verifies the Status of the regNos_Delhi
		Assert.assertEquals(regNos_Delhi,regNos_Delhi);
}

public void select_regNos_Delhi(){
		regNos_Delhi.click();
}

@FindBy(how= How.ID, using = "regNos_Brands")
	public WebElement regNos_Brands;

public void verify_regNos_Brands_Status(String data){
		//Verifies the Status of the regNos_Brands
		Assert.assertEquals(regNos_Brands,regNos_Brands);
}

public void select_regNos_Brands(){
		regNos_Brands.click();
}

@FindBy(how= How.ID, using = "regNos_BMW")
	public WebElement regNos_BMW;

public void verify_regNos_BMW_Status(String data){
		//Verifies the Status of the regNos_BMW
		Assert.assertEquals(regNos_BMW,regNos_BMW);
}

public void select_regNos_BMW(){
		regNos_BMW.click();
}

@FindBy(how= How.ID, using = "regNos_Mercedes")
	public WebElement regNos_Mercedes;

public void verify_regNos_Mercedes_Status(String data){
		//Verifies the Status of the regNos_Mercedes
		Assert.assertEquals(regNos_Mercedes,regNos_Mercedes);
}

public void select_regNos_Mercedes(){
		regNos_Mercedes.click();
}

@FindBy(how= How.ID, using = "regNos_Audi")
	public WebElement regNos_Audi;

public void verify_regNos_Audi_Status(String data){
		//Verifies the Status of the regNos_Audi
		Assert.assertEquals(regNos_Audi,regNos_Audi);
}

public void select_regNos_Audi(){
		regNos_Audi.click();
}

@FindBy(how= How.ID, using = "regNos_Jaguar")
	public WebElement regNos_Jaguar;

public void verify_regNos_Jaguar_Status(String data){
		//Verifies the Status of the regNos_Jaguar
		Assert.assertEquals(regNos_Jaguar,regNos_Jaguar);
}

public void select_regNos_Jaguar(){
		regNos_Jaguar.click();
}

@FindBy(how= How.ID, using = "regNos_Honda")
	public WebElement regNos_Honda;

public void verify_regNos_Honda_Status(String data){
		//Verifies the Status of the regNos_Honda
		Assert.assertEquals(regNos_Honda,regNos_Honda);
}

public void select_regNos_Honda(){
		regNos_Honda.click();
}

@FindBy(how= How.ID, using = "regNos_ValidList")
	public WebElement regNos_ValidList;

public void verify_regNos_ValidList_Status(String data){
		//Verifies the Status of the regNos_ValidList
		Assert.assertEquals(regNos_ValidList,regNos_ValidList);
}

public void select_regNos_ValidList(){
		regNos_ValidList.click();
}

@FindBy(how= How.ID, using = "regNos_InvalidList")
	public WebElement regNos_InvalidList;

public void verify_regNos_InvalidList_Status(String data){
		//Verifies the Status of the regNos_InvalidList
		Assert.assertEquals(regNos_InvalidList,regNos_InvalidList);
}

public void select_regNos_InvalidList(){
		regNos_InvalidList.click();
}

@FindBy(how= How.ID, using = "regNos_OrderType")
	public WebElement regNos_OrderType;

public void verify_regNos_OrderType_Status(String data){
		//Verifies the Status of the regNos_OrderType
		Assert.assertEquals(regNos_OrderType,regNos_OrderType);
}

public void select_regNos_OrderType(){
		regNos_OrderType.click();
}

@FindBy(how= How.ID, using = "regNos_EBooking")
	public WebElement regNos_EBooking;

public void verify_regNos_EBooking_Status(String data){
		//Verifies the Status of the regNos_EBooking
		Assert.assertEquals(regNos_EBooking,regNos_EBooking);
}

public void select_regNos_EBooking(){
		regNos_EBooking.click();
}

@FindBy(how= How.ID, using = "regNos_InStore")
	public WebElement regNos_InStore;

public void verify_regNos_InStore_Status(String data){
		//Verifies the Status of the regNos_InStore
		Assert.assertEquals(regNos_InStore,regNos_InStore);
}

public void select_regNos_InStore(){
		regNos_InStore.click();
}

@FindBy(how= How.ID, using = "regNos_OrderTime")
	public WebElement regNos_OrderTime;

public void verify_regNos_OrderTime_Status(String data){
		//Verifies the Status of the regNos_OrderTime
		Assert.assertEquals(regNos_OrderTime,regNos_OrderTime);
}

public void select_regNos_OrderTime(){
		regNos_OrderTime.click();
}

@FindBy(how= How.ID, using = "regNos_DuringWkgHrs")
	public WebElement regNos_DuringWkgHrs;

public void verify_regNos_DuringWkgHrs_Status(String data){
		//Verifies the Status of the regNos_DuringWkgHrs
		Assert.assertEquals(regNos_DuringWkgHrs,regNos_DuringWkgHrs);
}

public void select_regNos_DuringWkgHrs(){
		regNos_DuringWkgHrs.click();
}

@FindBy(how= How.ID, using = "regNos_OutsideWkgHrs")
	public WebElement regNos_OutsideWkgHrs;

public void verify_regNos_OutsideWkgHrs_Status(String data){
		//Verifies the Status of the regNos_OutsideWkgHrs
		Assert.assertEquals(regNos_OutsideWkgHrs,regNos_OutsideWkgHrs);
}

public void select_regNos_OutsideWkgHrs(){
		regNos_OutsideWkgHrs.click();
}

@FindBy(how= How.ID, using = "regNos_TrasferRC")
	public WebElement regNos_TrasferRC;

public void verify_regNos_TrasferRC_Status(String data){
		//Verifies the Status of the regNos_TrasferRC
		Assert.assertEquals(regNos_TrasferRC,regNos_TrasferRC);
}

public void select_regNos_TrasferRC(){
		regNos_TrasferRC.click();
}

@FindBy(how= How.ID, using = "regNos_BuySell")
	public WebElement regNos_BuySell;

public void verify_regNos_BuySell_Status(String data){
		//Verifies the Status of the regNos_BuySell
		Assert.assertEquals(regNos_BuySell,regNos_BuySell);
}

public void select_regNos_BuySell(){
		regNos_BuySell.click();
}

@FindBy(how= How.ID, using = "regNos_Buy")
	public WebElement regNos_Buy;

public void verify_regNos_Buy_Status(String data){
		//Verifies the Status of the regNos_Buy
		Assert.assertEquals(regNos_Buy,regNos_Buy);
}

public void select_regNos_Buy(){
		regNos_Buy.click();
}

@FindBy(how= How.ID, using = "regNos_Sell")
	public WebElement regNos_Sell;

public void verify_regNos_Sell_Status(String data){
		//Verifies the Status of the regNos_Sell
		Assert.assertEquals(regNos_Sell,regNos_Sell);
}

public void select_regNos_Sell(){
		regNos_Sell.click();
}

@FindBy(how= How.ID, using = "regNos_City")
	public WebElement regNos_City;

public void verify_regNos_City_Status(String data){
		//Verifies the Status of the regNos_City
		Assert.assertEquals(regNos_City,regNos_City);
}

public void select_regNos_City(){
		regNos_City.click();
}

@FindBy(how= How.ID, using = "regNos_Mumbai")
	public WebElement regNos_Mumbai;

public void verify_regNos_Mumbai_Status(String data){
		//Verifies the Status of the regNos_Mumbai
		Assert.assertEquals(regNos_Mumbai,regNos_Mumbai);
}

public void select_regNos_Mumbai(){
		regNos_Mumbai.click();
}

@FindBy(how= How.ID, using = "regNos_Delhi")
	public WebElement regNos_Delhi;

public void verify_regNos_Delhi_Status(String data){
		//Verifies the Status of the regNos_Delhi
		Assert.assertEquals(regNos_Delhi,regNos_Delhi);
}

public void select_regNos_Delhi(){
		regNos_Delhi.click();
}

@FindBy(how= How.ID, using = "regNos_Brands")
	public WebElement regNos_Brands;

public void verify_regNos_Brands_Status(String data){
		//Verifies the Status of the regNos_Brands
		Assert.assertEquals(regNos_Brands,regNos_Brands);
}

public void select_regNos_Brands(){
		regNos_Brands.click();
}

@FindBy(how= How.ID, using = "regNos_BMW")
	public WebElement regNos_BMW;

public void verify_regNos_BMW_Status(String data){
		//Verifies the Status of the regNos_BMW
		Assert.assertEquals(regNos_BMW,regNos_BMW);
}

public void select_regNos_BMW(){
		regNos_BMW.click();
}

@FindBy(how= How.ID, using = "regNos_Mercedes")
	public WebElement regNos_Mercedes;

public void verify_regNos_Mercedes_Status(String data){
		//Verifies the Status of the regNos_Mercedes
		Assert.assertEquals(regNos_Mercedes,regNos_Mercedes);
}

public void select_regNos_Mercedes(){
		regNos_Mercedes.click();
}

@FindBy(how= How.ID, using = "regNos_Audi")
	public WebElement regNos_Audi;

public void verify_regNos_Audi_Status(String data){
		//Verifies the Status of the regNos_Audi
		Assert.assertEquals(regNos_Audi,regNos_Audi);
}

public void select_regNos_Audi(){
		regNos_Audi.click();
}

@FindBy(how= How.ID, using = "regNos_Jaguar")
	public WebElement regNos_Jaguar;

public void verify_regNos_Jaguar_Status(String data){
		//Verifies the Status of the regNos_Jaguar
		Assert.assertEquals(regNos_Jaguar,regNos_Jaguar);
}

public void select_regNos_Jaguar(){
		regNos_Jaguar.click();
}

@FindBy(how= How.ID, using = "regNos_Honda")
	public WebElement regNos_Honda;

public void verify_regNos_Honda_Status(String data){
		//Verifies the Status of the regNos_Honda
		Assert.assertEquals(regNos_Honda,regNos_Honda);
}

public void select_regNos_Honda(){
		regNos_Honda.click();
}

@FindBy(how= How.ID, using = "regNos_RegNos")
	public WebElement regNos_RegNos;

public void verify_regNos_RegNos_Status(String data){
		//Verifies the Status of the regNos_RegNos
		Assert.assertEquals(regNos_RegNos,regNos_RegNos);
}

public void select_regNos_RegNos(){
		regNos_RegNos.click();
}

@FindBy(how= How.ID, using = "regNos_ValidList")
	public WebElement regNos_ValidList;

public void verify_regNos_ValidList_Status(String data){
		//Verifies the Status of the regNos_ValidList
		Assert.assertEquals(regNos_ValidList,regNos_ValidList);
}

public void select_regNos_ValidList(){
		regNos_ValidList.click();
}

@FindBy(how= How.ID, using = "regNos_InvalidList")
	public WebElement regNos_InvalidList;

public void verify_regNos_InvalidList_Status(String data){
		//Verifies the Status of the regNos_InvalidList
		Assert.assertEquals(regNos_InvalidList,regNos_InvalidList);
}

public void select_regNos_InvalidList(){
		regNos_InvalidList.click();
}

@FindBy(how= How.ID, using = "regNos_EBooking")
	public WebElement regNos_EBooking;

public void verify_regNos_EBooking_Status(String data){
		//Verifies the Status of the regNos_EBooking
		Assert.assertEquals(regNos_EBooking,regNos_EBooking);
}

public void select_regNos_EBooking(){
		regNos_EBooking.click();
}

@FindBy(how= How.ID, using = "regNos_InStore")
	public WebElement regNos_InStore;

public void verify_regNos_InStore_Status(String data){
		//Verifies the Status of the regNos_InStore
		Assert.assertEquals(regNos_InStore,regNos_InStore);
}

public void select_regNos_InStore(){
		regNos_InStore.click();
}

@FindBy(how= How.ID, using = "regNos_OrderTime")
	public WebElement regNos_OrderTime;

public void verify_regNos_OrderTime_Status(String data){
		//Verifies the Status of the regNos_OrderTime
		Assert.assertEquals(regNos_OrderTime,regNos_OrderTime);
}

public void select_regNos_OrderTime(){
		regNos_OrderTime.click();
}

@FindBy(how= How.ID, using = "regNos_DuringWkgHrs")
	public WebElement regNos_DuringWkgHrs;

public void verify_regNos_DuringWkgHrs_Status(String data){
		//Verifies the Status of the regNos_DuringWkgHrs
		Assert.assertEquals(regNos_DuringWkgHrs,regNos_DuringWkgHrs);
}

public void select_regNos_DuringWkgHrs(){
		regNos_DuringWkgHrs.click();
}

@FindBy(how= How.ID, using = "regNos_OutsideWkgHrs")
	public WebElement regNos_OutsideWkgHrs;

public void verify_regNos_OutsideWkgHrs_Status(String data){
		//Verifies the Status of the regNos_OutsideWkgHrs
		Assert.assertEquals(regNos_OutsideWkgHrs,regNos_OutsideWkgHrs);
}

public void select_regNos_OutsideWkgHrs(){
		regNos_OutsideWkgHrs.click();
}

@FindBy(how= How.ID, using = "regNos_TrasferRC")
	public WebElement regNos_TrasferRC;

public void verify_regNos_TrasferRC_Status(String data){
		//Verifies the Status of the regNos_TrasferRC
		Assert.assertEquals(regNos_TrasferRC,regNos_TrasferRC);
}

public void select_regNos_TrasferRC(){
		regNos_TrasferRC.click();
}

@FindBy(how= How.ID, using = "OrderTime_BuySell")
	public WebElement OrderTime_BuySell;

public void verify_OrderTime_BuySell_Status(String data){
		//Verifies the Status of the OrderTime_BuySell
		Assert.assertEquals(OrderTime_BuySell,OrderTime_BuySell);
}

public void select_OrderTime_BuySell(){
		OrderTime_BuySell.click();
}

@FindBy(how= How.ID, using = "OrderTime_Buy")
	public WebElement OrderTime_Buy;

public void verify_OrderTime_Buy_Status(String data){
		//Verifies the Status of the OrderTime_Buy
		Assert.assertEquals(OrderTime_Buy,OrderTime_Buy);
}

public void select_OrderTime_Buy(){
		OrderTime_Buy.click();
}

@FindBy(how= How.ID, using = "OrderTime_Sell")
	public WebElement OrderTime_Sell;

public void verify_OrderTime_Sell_Status(String data){
		//Verifies the Status of the OrderTime_Sell
		Assert.assertEquals(OrderTime_Sell,OrderTime_Sell);
}

public void select_OrderTime_Sell(){
		OrderTime_Sell.click();
}

@FindBy(how= How.ID, using = "OrderTime_City")
	public WebElement OrderTime_City;

public void verify_OrderTime_City_Status(String data){
		//Verifies the Status of the OrderTime_City
		Assert.assertEquals(OrderTime_City,OrderTime_City);
}

public void select_OrderTime_City(){
		OrderTime_City.click();
}

@FindBy(how= How.ID, using = "OrderTime_Mumbai")
	public WebElement OrderTime_Mumbai;

public void verify_OrderTime_Mumbai_Status(String data){
		//Verifies the Status of the OrderTime_Mumbai
		Assert.assertEquals(OrderTime_Mumbai,OrderTime_Mumbai);
}

public void select_OrderTime_Mumbai(){
		OrderTime_Mumbai.click();
}

@FindBy(how= How.ID, using = "OrderTime_Delhi")
	public WebElement OrderTime_Delhi;

public void verify_OrderTime_Delhi_Status(String data){
		//Verifies the Status of the OrderTime_Delhi
		Assert.assertEquals(OrderTime_Delhi,OrderTime_Delhi);
}

public void select_OrderTime_Delhi(){
		OrderTime_Delhi.click();
}

@FindBy(how= How.ID, using = "OrderTime_Brands")
	public WebElement OrderTime_Brands;

public void verify_OrderTime_Brands_Status(String data){
		//Verifies the Status of the OrderTime_Brands
		Assert.assertEquals(OrderTime_Brands,OrderTime_Brands);
}

public void select_OrderTime_Brands(){
		OrderTime_Brands.click();
}

@FindBy(how= How.ID, using = "OrderTime_BMW")
	public WebElement OrderTime_BMW;

public void verify_OrderTime_BMW_Status(String data){
		//Verifies the Status of the OrderTime_BMW
		Assert.assertEquals(OrderTime_BMW,OrderTime_BMW);
}

public void select_OrderTime_BMW(){
		OrderTime_BMW.click();
}

@FindBy(how= How.ID, using = "OrderTime_Mercedes")
	public WebElement OrderTime_Mercedes;

public void verify_OrderTime_Mercedes_Status(String data){
		//Verifies the Status of the OrderTime_Mercedes
		Assert.assertEquals(OrderTime_Mercedes,OrderTime_Mercedes);
}

public void select_OrderTime_Mercedes(){
		OrderTime_Mercedes.click();
}

@FindBy(how= How.ID, using = "OrderTime_Audi")
	public WebElement OrderTime_Audi;

public void verify_OrderTime_Audi_Status(String data){
		//Verifies the Status of the OrderTime_Audi
		Assert.assertEquals(OrderTime_Audi,OrderTime_Audi);
}

public void select_OrderTime_Audi(){
		OrderTime_Audi.click();
}

@FindBy(how= How.ID, using = "OrderTime_Jaguar")
	public WebElement OrderTime_Jaguar;

public void verify_OrderTime_Jaguar_Status(String data){
		//Verifies the Status of the OrderTime_Jaguar
		Assert.assertEquals(OrderTime_Jaguar,OrderTime_Jaguar);
}

public void select_OrderTime_Jaguar(){
		OrderTime_Jaguar.click();
}

@FindBy(how= How.ID, using = "OrderTime_Honda")
	public WebElement OrderTime_Honda;

public void verify_OrderTime_Honda_Status(String data){
		//Verifies the Status of the OrderTime_Honda
		Assert.assertEquals(OrderTime_Honda,OrderTime_Honda);
}

public void select_OrderTime_Honda(){
		OrderTime_Honda.click();
}

@FindBy(how= How.ID, using = "OrderTime_RegNos")
	public WebElement OrderTime_RegNos;

public void verify_OrderTime_RegNos_Status(String data){
		//Verifies the Status of the OrderTime_RegNos
		Assert.assertEquals(OrderTime_RegNos,OrderTime_RegNos);
}

public void select_OrderTime_RegNos(){
		OrderTime_RegNos.click();
}

@FindBy(how= How.ID, using = "OrderTime_ValidList")
	public WebElement OrderTime_ValidList;

public void verify_OrderTime_ValidList_Status(String data){
		//Verifies the Status of the OrderTime_ValidList
		Assert.assertEquals(OrderTime_ValidList,OrderTime_ValidList);
}

public void select_OrderTime_ValidList(){
		OrderTime_ValidList.click();
}

@FindBy(how= How.ID, using = "OrderTime_InvalidList")
	public WebElement OrderTime_InvalidList;

public void verify_OrderTime_InvalidList_Status(String data){
		//Verifies the Status of the OrderTime_InvalidList
		Assert.assertEquals(OrderTime_InvalidList,OrderTime_InvalidList);
}

public void select_OrderTime_InvalidList(){
		OrderTime_InvalidList.click();
}

@FindBy(how= How.ID, using = "OrderTime_OrderType")
	public WebElement OrderTime_OrderType;

public void verify_OrderTime_OrderType_Status(String data){
		//Verifies the Status of the OrderTime_OrderType
		Assert.assertEquals(OrderTime_OrderType,OrderTime_OrderType);
}

public void select_OrderTime_OrderType(){
		OrderTime_OrderType.click();
}

@FindBy(how= How.ID, using = "OrderTime_EBooking")
	public WebElement OrderTime_EBooking;

public void verify_OrderTime_EBooking_Status(String data){
		//Verifies the Status of the OrderTime_EBooking
		Assert.assertEquals(OrderTime_EBooking,OrderTime_EBooking);
}

public void select_OrderTime_EBooking(){
		OrderTime_EBooking.click();
}

@FindBy(how= How.ID, using = "OrderTime_InStore")
	public WebElement OrderTime_InStore;

public void verify_OrderTime_InStore_Status(String data){
		//Verifies the Status of the OrderTime_InStore
		Assert.assertEquals(OrderTime_InStore,OrderTime_InStore);
}

public void select_OrderTime_InStore(){
		OrderTime_InStore.click();
}

@FindBy(how= How.ID, using = "OrderTime_DuringWkgHrs")
	public WebElement OrderTime_DuringWkgHrs;

public void verify_OrderTime_DuringWkgHrs_Status(String data){
		//Verifies the Status of the OrderTime_DuringWkgHrs
		Assert.assertEquals(OrderTime_DuringWkgHrs,OrderTime_DuringWkgHrs);
}

public void select_OrderTime_DuringWkgHrs(){
		OrderTime_DuringWkgHrs.click();
}

@FindBy(how= How.ID, using = "OrderTime_OutsideWkgHrs")
	public WebElement OrderTime_OutsideWkgHrs;

public void verify_OrderTime_OutsideWkgHrs_Status(String data){
		//Verifies the Status of the OrderTime_OutsideWkgHrs
		Assert.assertEquals(OrderTime_OutsideWkgHrs,OrderTime_OutsideWkgHrs);
}

public void select_OrderTime_OutsideWkgHrs(){
		OrderTime_OutsideWkgHrs.click();
}

@FindBy(how= How.ID, using = "OrderTime_TrasferRC")
	public WebElement OrderTime_TrasferRC;

public void verify_OrderTime_TrasferRC_Status(String data){
		//Verifies the Status of the OrderTime_TrasferRC
		Assert.assertEquals(OrderTime_TrasferRC,OrderTime_TrasferRC);
}

public void select_OrderTime_TrasferRC(){
		OrderTime_TrasferRC.click();
}

@FindBy(how= How.ID, using = "TradeType_Buy")
	public WebElement TradeType_Buy;

public void verify_TradeType_Buy_Status(String data){
		//Verifies the Status of the TradeType_Buy
		Assert.assertEquals(TradeType_Buy,TradeType_Buy);
}

public void select_TradeType_Buy(){
		TradeType_Buy.click();
}

@FindBy(how= How.ID, using = "TradeType_Sell")
	public WebElement TradeType_Sell;

public void verify_TradeType_Sell_Status(String data){
		//Verifies the Status of the TradeType_Sell
		Assert.assertEquals(TradeType_Sell,TradeType_Sell);
}

public void select_TradeType_Sell(){
		TradeType_Sell.click();
}

@FindBy(how= How.ID, using = "TradeType_City")
	public WebElement TradeType_City;

public void verify_TradeType_City_Status(String data){
		//Verifies the Status of the TradeType_City
		Assert.assertEquals(TradeType_City,TradeType_City);
}

public void select_TradeType_City(){
		TradeType_City.click();
}

@FindBy(how= How.ID, using = "TradeType_Mumbai")
	public WebElement TradeType_Mumbai;

public void verify_TradeType_Mumbai_Status(String data){
		//Verifies the Status of the TradeType_Mumbai
		Assert.assertEquals(TradeType_Mumbai,TradeType_Mumbai);
}

public void select_TradeType_Mumbai(){
		TradeType_Mumbai.click();
}

@FindBy(how= How.ID, using = "TradeType_Delhi")
	public WebElement TradeType_Delhi;

public void verify_TradeType_Delhi_Status(String data){
		//Verifies the Status of the TradeType_Delhi
		Assert.assertEquals(TradeType_Delhi,TradeType_Delhi);
}

public void select_TradeType_Delhi(){
		TradeType_Delhi.click();
}

@FindBy(how= How.ID, using = "TradeType_Brands")
	public WebElement TradeType_Brands;

public void verify_TradeType_Brands_Status(String data){
		//Verifies the Status of the TradeType_Brands
		Assert.assertEquals(TradeType_Brands,TradeType_Brands);
}

public void select_TradeType_Brands(){
		TradeType_Brands.click();
}

@FindBy(how= How.ID, using = "TradeType_BMW")
	public WebElement TradeType_BMW;

public void verify_TradeType_BMW_Status(String data){
		//Verifies the Status of the TradeType_BMW
		Assert.assertEquals(TradeType_BMW,TradeType_BMW);
}

public void select_TradeType_BMW(){
		TradeType_BMW.click();
}

@FindBy(how= How.ID, using = "TradeType_Mercedes")
	public WebElement TradeType_Mercedes;

public void verify_TradeType_Mercedes_Status(String data){
		//Verifies the Status of the TradeType_Mercedes
		Assert.assertEquals(TradeType_Mercedes,TradeType_Mercedes);
}

public void select_TradeType_Mercedes(){
		TradeType_Mercedes.click();
}

@FindBy(how= How.ID, using = "TradeType_Audi")
	public WebElement TradeType_Audi;

public void verify_TradeType_Audi_Status(String data){
		//Verifies the Status of the TradeType_Audi
		Assert.assertEquals(TradeType_Audi,TradeType_Audi);
}

public void select_TradeType_Audi(){
		TradeType_Audi.click();
}

@FindBy(how= How.ID, using = "TradeType_Jaguar")
	public WebElement TradeType_Jaguar;

public void verify_TradeType_Jaguar_Status(String data){
		//Verifies the Status of the TradeType_Jaguar
		Assert.assertEquals(TradeType_Jaguar,TradeType_Jaguar);
}

public void select_TradeType_Jaguar(){
		TradeType_Jaguar.click();
}

@FindBy(how= How.ID, using = "TradeType_Honda")
	public WebElement TradeType_Honda;

public void verify_TradeType_Honda_Status(String data){
		//Verifies the Status of the TradeType_Honda
		Assert.assertEquals(TradeType_Honda,TradeType_Honda);
}

public void select_TradeType_Honda(){
		TradeType_Honda.click();
}

@FindBy(how= How.ID, using = "TradeType_RegNos")
	public WebElement TradeType_RegNos;

public void verify_TradeType_RegNos_Status(String data){
		//Verifies the Status of the TradeType_RegNos
		Assert.assertEquals(TradeType_RegNos,TradeType_RegNos);
}

public void select_TradeType_RegNos(){
		TradeType_RegNos.click();
}

@FindBy(how= How.ID, using = "TradeType_ValidList")
	public WebElement TradeType_ValidList;

public void verify_TradeType_ValidList_Status(String data){
		//Verifies the Status of the TradeType_ValidList
		Assert.assertEquals(TradeType_ValidList,TradeType_ValidList);
}

public void select_TradeType_ValidList(){
		TradeType_ValidList.click();
}

@FindBy(how= How.ID, using = "TradeType_InvalidList")
	public WebElement TradeType_InvalidList;

public void verify_TradeType_InvalidList_Status(String data){
		//Verifies the Status of the TradeType_InvalidList
		Assert.assertEquals(TradeType_InvalidList,TradeType_InvalidList);
}

public void select_TradeType_InvalidList(){
		TradeType_InvalidList.click();
}

@FindBy(how= How.ID, using = "TradeType_OrderType")
	public WebElement TradeType_OrderType;

public void verify_TradeType_OrderType_Status(String data){
		//Verifies the Status of the TradeType_OrderType
		Assert.assertEquals(TradeType_OrderType,TradeType_OrderType);
}

public void select_TradeType_OrderType(){
		TradeType_OrderType.click();
}

@FindBy(how= How.ID, using = "TradeType_EBooking")
	public WebElement TradeType_EBooking;

public void verify_TradeType_EBooking_Status(String data){
		//Verifies the Status of the TradeType_EBooking
		Assert.assertEquals(TradeType_EBooking,TradeType_EBooking);
}

public void select_TradeType_EBooking(){
		TradeType_EBooking.click();
}

@FindBy(how= How.ID, using = "TradeType_InStore")
	public WebElement TradeType_InStore;

public void verify_TradeType_InStore_Status(String data){
		//Verifies the Status of the TradeType_InStore
		Assert.assertEquals(TradeType_InStore,TradeType_InStore);
}

public void select_TradeType_InStore(){
		TradeType_InStore.click();
}

@FindBy(how= How.ID, using = "TradeType_OrderTime")
	public WebElement TradeType_OrderTime;

public void verify_TradeType_OrderTime_Status(String data){
		//Verifies the Status of the TradeType_OrderTime
		Assert.assertEquals(TradeType_OrderTime,TradeType_OrderTime);
}

public void select_TradeType_OrderTime(){
		TradeType_OrderTime.click();
}

@FindBy(how= How.ID, using = "TradeType_DuringWkgHrs")
	public WebElement TradeType_DuringWkgHrs;

public void verify_TradeType_DuringWkgHrs_Status(String data){
		//Verifies the Status of the TradeType_DuringWkgHrs
		Assert.assertEquals(TradeType_DuringWkgHrs,TradeType_DuringWkgHrs);
}

public void select_TradeType_DuringWkgHrs(){
		TradeType_DuringWkgHrs.click();
}

@FindBy(how= How.ID, using = "TradeType_OutsideWkgHrs")
	public WebElement TradeType_OutsideWkgHrs;

public void verify_TradeType_OutsideWkgHrs_Status(String data){
		//Verifies the Status of the TradeType_OutsideWkgHrs
		Assert.assertEquals(TradeType_OutsideWkgHrs,TradeType_OutsideWkgHrs);
}

public void select_TradeType_OutsideWkgHrs(){
		TradeType_OutsideWkgHrs.click();
}

@FindBy(how= How.ID, using = "TradeType_TrasferRC")
	public WebElement TradeType_TrasferRC;

public void verify_TradeType_TrasferRC_Status(String data){
		//Verifies the Status of the TradeType_TrasferRC
		Assert.assertEquals(TradeType_TrasferRC,TradeType_TrasferRC);
}

public void select_TradeType_TrasferRC(){
		TradeType_TrasferRC.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}