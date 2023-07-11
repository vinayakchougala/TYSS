package practice;

import static org.testng.Assert.fail;

import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practicetestng {

	@BeforeSuite
	public void tc1() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void tc2() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void tc3() {
		System.out.println("Before class");
	}

	@BeforeMethod

	public void tc4() {
		System.out.println("Before method");
	}

	@Test()
	public void atc5() {
		System.out.println("bangalore");
	}

	@Test()
	public void btc6() {
         
		System.out.println("Mysore");

	}

	@Test()
	public void ctc7() {
		System.out.println("chennai");
	}

	@AfterMethod
	public void tc8() {
		System.out.println("After method");
	}

	@org.testng.annotations.AfterClass
	public void tc9() {
		System.out.println("After class");
	}

	@AfterTest
	public void tc10() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void tc11() {
		System.out.println("After Suite");
	}

}
