package Newa_LIMS_Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
    /*Declaration*/
	@FindBy(xpath="//a[@href='client.php']")
	private WebElement Clientsbtn;
	
	@FindBy(xpath="//a[@href='nominee.php']")
	private WebElement Nomineebtn;
	
	@FindBy(xpath="//a[@href='agent.php']")
	private WebElement Agentsbtn;
	
	@FindBy(xpath="//a[@href='policy.php']")
	private WebElement Policybtn;
	
	@FindBy(xpath="//a[@href='payment.php']")
	private WebElement Paymentsbtn;	
	
	@FindBy(xpath="//a[@title='Logout']")
	private WebElement Logoutbtn;
	
	@FindBy(xpath="//h1[@class='page-head-line']")
	private WebElement allpagetitlemsg;
	
	/*Initialisation*/
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	/*Utilisation*/
	public WebElement getNomineebtn()
	{
		return Nomineebtn;
		
	}
	public WebElement getLogoutbtn() 
	{
		return Logoutbtn;
		
	}

	public WebElement getClientsbtn() 
	{
		return Clientsbtn;
	}

	public WebElement getAgentsbtn() 
	{
		return Agentsbtn;
	}

	public WebElement getPolicybtn()
	{
		return Policybtn;
	}

	public WebElement getPaymentsbtn() 
	{
		return Paymentsbtn;
	}

	/*Business Libraries*/
	public void nomineebtn()
	{
	    Nomineebtn.click();	   
    }
	public void Logout()
	{
		Logoutbtn.click();
	}
	
	public void Agent()
	{
		Agentsbtn.click();
	}
	public void Client()
	{
		Clientsbtn.click();
	}
	public void Policy()
	{
		Policybtn.click();
	}
	public void Payment()
	{
		Paymentsbtn.click();
	}
	public String Titlepagemsg()
	{
		return allpagetitlemsg.getText();
	}
}


