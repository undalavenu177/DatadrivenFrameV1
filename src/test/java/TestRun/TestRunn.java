package TestRun;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.CreateCust;
import Pages.Login;
import Utilities.ExcelUtils;

public class TestRunn extends BaseTest{
	@Test (priority=1,dataProvider = "sheet1Data")
	public void LgTest(String Username,String Pass) {
		Login lg= new Login(driver);
		lg.Lgtest(Username, Pass);
	}
	@DataProvider(name="sheet1Data")
	public Object[][] data() throws IOException {
		
	    String Path = System.getProperty("user.dir")
	            + "/src/test/resources/Testdata/data.xlsx";
		return ExcelUtils.Utils(Path, "Sheet1");
				
	}
	@Test (priority=2)
	public void CreateCustomer() {
		CreateCust cust= new CreateCust(driver);
		cust.CreateNewCust("VenuUndala", "17/06/1997", "Hyderabad,SRNAGAR", "Hyderabad", "Telangan", "518569", "9581215418", "venu@mimics.com");
	}


}
