package lifeinsurancesystem_payments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Newa_LIMS_Object_Repository.EditpaymentPage;
import Newa_LIMS_Object_Repository.HomePage;
import Newa_LIMS_Object_Repository.LoginPage;
import Newa_LIMS_Object_Repository.PaymentInformationPage;
import Newa_LIMS_Object_Repository.VerifyPaymentPage;
import Newa_LIMS_Object_Repository.VerifyeditPaymentPage;
import Newa_generic_utility.Baseclass;
import Newa_generic_utility.ExcelUtlity;
import Newa_generic_utility.FileUtlity;
import Newa_generic_utility.WebActionUtility;

public class EditpaymentTest extends Baseclass {
	@Test(groups= {"RegreTest"})
	public void Editpayment() throws Throwable {

		String TEST_SCRIPT_EXCEL_FILE_PATH = fLib.getFilePathFromPropertiesFile("testScriptdatafilePath");

		/* Read Test Data from Excel File */
		String AMOUNT = elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", "tc_04", "amount");

		HomePage hp = new HomePage(driver);
		hp.Payment();

		/* Navigate through editPayment */
		PaymentInformationPage PIP = new PaymentInformationPage(driver);
		PIP.editpayment();

		/* Enter edit amount */
		EditpaymentPage EPP = new EditpaymentPage(driver);
		EPP.Amonttext();
		EPP.Amonttext1(AMOUNT);
		EPP.Aupdatebutton();

		/* verify Payment is Edit or not */
		VerifyeditPaymentPage VEPP = new VerifyeditPaymentPage(driver);
		String Act_msg = VEPP.editpaymt();

		String Exp_msg = "New record updated successfully";
		
		Assert.assertTrue(Act_msg.contains(Exp_msg),"Payment is not updated Successfully Not Verified----->Fail");
		Reporter.log(Act_msg+"  "+"Payment is updated Successfully Verified----->Pass",true);
		
		/* Navigate through payment */
		hp.Payment();

		/* Verify edited Payment is displayed in payment table */
		VerifyPaymentPage VPP = new VerifyPaymentPage(driver);
		  ArrayList<String> l1 = new ArrayList<String>();
		
		List<WebElement> all_amount = VPP.getEditpay();	
			
			  for (WebElement we : all_amount)
			  {
				  String All_amount = we.getAttribute("innerHTML");
				 l1.add(All_amount);		 
			  }
			  
			  Assert.assertTrue(l1.contains(AMOUNT),"Edited Payment is Verified and is displayed----->Fail");
			  Reporter.log(AMOUNT+"  "+"Edited Payment is Verified and is displayed----->Pass",true);
	}
}
	
			 

					

	