package Newa_LIMS_Object_Repository;

import java.security.PrivateKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
     /*Declaration*/
	@FindBy(name="username")
	private WebElement usernameEditTxt;
	
	@FindBy(name="password")
	private WebElement passwordnameEditTxt;
	
	@FindBy(xpath="//button[.='login']")
	private WebElement LoginBtnClk;
	
	
   /*initialisation*/
	public LoginPage(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	}
	
	/*Utilisation*/
	public WebElement getusernameEditTxt()
	{
		return usernameEditTxt;
	}

	public WebElement getPasswordnameEditTxt()
	{
		return passwordnameEditTxt;
	}

	public WebElement getLoginBtnClk() {
		return LoginBtnClk;
	}
	
	/*Business Libraries*/
	public void loginToApp(String username,String password)
	{
		usernameEditTxt.sendKeys(username);
		passwordnameEditTxt.sendKeys(password);
		LoginBtnClk.click();
	}
	
	}