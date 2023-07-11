package lifeinsurancesystem_payments;

import java.io.FileInputStream;
import java.time.Duration;
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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Newa_LIMS_Object_Repository.CreateNomineePage;
import Newa_LIMS_Object_Repository.HomePage;
import Newa_LIMS_Object_Repository.LoginPage;
import Newa_LIMS_Object_Repository.PaymentInformationPage;
import Newa_LIMS_Object_Repository.VerifyPaymentPage;
import Newa_generic_utility.Baseclass;
import Newa_generic_utility.ExcelUtlity;
import Newa_generic_utility.FileUtlity;
import Newa_generic_utility.WebActionUtility;
//@Listeners(Newa_generic_utility.ListnerImplimentation.class)
public class LogintoappaddpaymentlogoutTest extends Baseclass 
{
	
	@Test()
	public void addpayment() throws Throwable
	{
		String TEST_SCRIPT_EXCEL_FILE_PATH = fLib.getFilePathFromPropertiesFile("testScriptdatafilePath");
		
		/* Read Test Data from Excel File */
		String CLIENTID = elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", "tc_01", "Client_id");
		String MONTH = elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", "tc_01", "Month");
		String AMOUNT = elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", "tc_01", "Amount");
		String DUE = elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", "tc_01", "Due");
		String FINE = elib.getDataFromExcelBasedTestId(TEST_SCRIPT_EXCEL_FILE_PATH, "lims", "tc_01", "Fine");

		HomePage HP = new HomePage(driver);
		HP.Agent();
		HP.Policy();
		HP.nomineebtn();
		HP.Payment();
		PaymentInformationPage PIP = new PaymentInformationPage(driver);
		PIP.addpayment();
     
		/* Add payment Enter valid data into all the fields */
		PIP.paymentinfo(CLIENTID, MONTH, AMOUNT, DUE, FINE);
		PIP.Submitbtn();

		/* varify added Payment Confirmation Msg is displayed */
		VerifyPaymentPage VPP = new VerifyPaymentPage(driver);
		String Act_msg1 = VPP.paymentverify();

		String Exp_msg = "New Payment ADDED";
		
		Assert.assertTrue(Act_msg1.contains(Exp_msg),"Payment is not added successfully not Verified---->Fail");
		Reporter.log(Exp_msg+"  "+"Payment is added successfully Verified---->Pass",true);

		HP.Payment();

	}

}
