package Newa_LIMS_Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformationPage 
{     
	/*Declaration*/
     @FindBy(name="client_id")
     private WebElement ClientIDTextfield;
     
     @FindBy(name="month")
     private WebElement MonthTextfield;
     
     @FindBy(name="amount")
     private WebElement AmountTextfield;
     
     @FindBy(name="due")
     private WebElement DueTextfield;
     
     @FindBy(name="fine")
     private WebElement FineTextfield;
     
     @FindBy(xpath="//input[@type='submit']")
     private WebElement SubmitButton;
     
     @FindBy(xpath="//input[@name='recipt_no']")
     private WebElement Receiptno;
     
     @FindBy(xpath="//a[@href='addPayment.php']")
     private WebElement Addpayment;
     
     @FindBy(xpath="//a[@href='editPayment.php?recipt_no=1688447338_102727996']")
     private WebElement Editpayment;
     
     
     /*Initialisation*/
     public PaymentInformationPage (WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
     
     /*Utilisation*/

	public WebElement getClientIDTextfield() {
		return ClientIDTextfield;
	}

	public WebElement getMonthTextfield() {
		return MonthTextfield;
	}

	public WebElement getAmountTextfield() {
		return AmountTextfield;
	}

	public WebElement getDueTextfield() {
		return DueTextfield;
	}

	public WebElement getFineTextfield() {
		return FineTextfield;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public WebElement getreciptno() {
		return Receiptno;
	}
     
    public WebElement getAddpayment() {
		return Addpayment;
	}

	/*Business Libraries*/
	public void paymentinfo(String clientid, String month, String amount, String due, String fine)
	{
		ClientIDTextfield.sendKeys(clientid);
		MonthTextfield.sendKeys(month);
		AmountTextfield.sendKeys(amount);
		DueTextfield.sendKeys(due);
		FineTextfield.sendKeys(fine);
		
	}
	public String getReceiptno()
	{
		String receipt = Receiptno.getAttribute("value");
		return receipt;
	}
	
	public void Submitbtn()
	{
		SubmitButton.click();
	}
	public void addpayment()
	{
		Addpayment.click();
	}
	public void editpayment()
	{
		Editpayment.click();
	}
     
     
     
}
