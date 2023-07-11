package lifeinsurancesystem_payments;

import java.io.FileInputStream; 
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Newa_LIMS_Object_Repository.HomePage;
import Newa_LIMS_Object_Repository.LoginPage;
import Newa_LIMS_Object_Repository.PaymentInformationPage;
import Newa_LIMS_Object_Repository.VerifyPaymentPage;
import Newa_generic_utility.Baseclass;
import Newa_generic_utility.ExcelUtlity;
import Newa_generic_utility.FileUtlity;
import Newa_generic_utility.WebActionUtility;

public class AddpaymentandverifyTest extends Baseclass 
{
	////i am chutiya
	@Test(groups= {"SmokeTest"})
	public void addpayment() throws Throwable 
	{
		// welcome 

		String TEST_SCRIPT_EXCEL_FILE_PATH = fLib.getFilePathFromPropertiesFile("testScriptdatafilePath");

		/* Read Test Data from Excel File */
		String CLIENTID = elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", "tc_01", "Client_id");
		String MONTH = elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", "tc_01", "Month");
		String AMOUNT = elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", "tc_01", "Amount");
		String DUE = elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", "tc_01", "Due");
		String FINE = elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", "tc_01", "Fine");

		HomePage hp = new HomePage(driver);
		hp.Agent();
		hp.Policy();
		hp.nomineebtn();
		hp.Payment();

		/* navigate through Add Payment */
		PaymentInformationPage pip = new PaymentInformationPage(driver);
		pip.addpayment();

		/* Enter valid data into all the fields */
		pip.paymentinfo(CLIENTID, MONTH, AMOUNT, DUE, FINE);
		String Act_Receiptno = pip.getReceiptno();
		System.out.println(Act_Receiptno);
		pip.Submitbtn();

		/* Payment added Successfully varify */
		VerifyPaymentPage VPP = new VerifyPaymentPage(driver);
		String Act_msg = VPP.paymentverify();
		System.out.println(Act_msg);
		

		String Exp_msg = "New Payment ADDED";
		
	    Assert.assertTrue(Act_msg.contains(Exp_msg),"Payment added sucessfully Not Verified----->fail");
		Reporter.log(Exp_msg+"  "+"Payment added sucessfully Verified---->Pass",true);
		
		/* Navigate through Payment */
		hp.Payment();

		/* Verify payment receipt no */		
		   ArrayList<String>l1 = new ArrayList<>();
  	List<WebElement> all_id = VPP.getPaymentreceiptno();
 
		for (WebElement we : all_id) 
		{
			String all_Reciptno =  we.getAttribute("innerHTML");
			l1.add(all_Reciptno);
		}
			
			Assert.assertTrue(l1.contains(Act_Receiptno),Act_Receiptno+"  "+"payment Receipt number is not Veifyied &  is not Present---->Fail");
			Reporter.log(Act_Receiptno+"  "+"payment Receipt number Veifyied &  is Present---->Pass",true);
		// Test script executed Successfully.
	}
}
	


