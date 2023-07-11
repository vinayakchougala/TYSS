package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import Newa_LIMS_Object_Repository.CreateNomineePage;
import Newa_LIMS_Object_Repository.HomePage;
import Newa_LIMS_Object_Repository.LoginPage;
import Newa_LIMS_Object_Repository.NomineeInformationPage;
import Newa_LIMS_Object_Repository.VerifyNomineePage;
import Newa_generic_utility.Baseclass;
import Newa_generic_utility.ExcelUtlity;
import Newa_generic_utility.FileUtlity;
import Newa_generic_utility.WebActionUtility;

public class Logintoappverifyallpage extends Baseclass {
	@Test
	public void verifyallpage() throws Throwable {
	
		String data1 = "HOME PAGE";
		String data2 = "CLIENTS INFORMATION";
		String data3 = "AGENTS INFORMATION";
		String data4 = "POLICY INFORMATIONS";
		String data5 = "NOMINEES INFORMATIONS";
		String data6 = "PAYMENT INFORMATIONS";

		HomePage hp1 = new HomePage(driver);
		String value1 = hp1.Titlepagemsg();

		hp1.Client();
		String value2 = hp1.Titlepagemsg();

		hp1.Agent();
		String value3 = hp1.Titlepagemsg();

		hp1.Policy();
		String value4 = hp1.Titlepagemsg();

		hp1.nomineebtn();
		String value5 = hp1.Titlepagemsg();

		hp1.Payment();
		String value6 = hp1.Titlepagemsg();

		if (value1.equals(data1))
		{
			System.out.println("home page is displayed ---> pass");
		} 
		else 
		{
			System.out.println("home page is not displayed---> fail");
		}
		if (value2.equals(data2)) {
			System.out.println("Clients page is displayed---> pass");
		} else {
			System.out.println("Clients page is not displayed---> fail");
		}
		if (value3.equals(data3)) {
			System.out.println("Agent page is displayed---> pass");
		} else {
			System.out.println("Agent page is not displayed--->fail");
		}
		if (value4.equals(data4)) {
			System.out.println("Policy page is displayed---> pass");
		} else {
			System.out.println("Policy page is not displayed---> fail");
		}
		if (value5.equals(data5)) {
			System.out.println("Nominee page is displayed---> pass");
		} else {
			System.out.println("Nominee page is not displayed--->fail");
		}
		if (value6.equals(data6)) {
			System.out.println("Payment Page is displayed---> pass");
		} else {
			System.out.println("Payment Page is not displayed--->fail");
		}

	}
}
