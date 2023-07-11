package Newa_LIMS_Object_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyPaymentPage 
{ 
	/*Declaration*/
   @FindBy(xpath="//div[@class='col-md-12' and contains(.,'New Payment ADDED')]")
   private WebElement Paymentverfiytext;
   
   @FindBy(xpath="//table[@class='table']//tr[*]//td[1]")
   private List<WebElement> Paymentreceiptno;
   
   @FindBy(xpath="//table[@class='table']/tbody/tr[*]/td[4]")
   private List<WebElement> Editpayment;
    
    /*Intialisation*/
   public VerifyPaymentPage (WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   
   
    /*Business Libraries*/
   public String paymentverify()
   {
	   return Paymentverfiytext.getText();
   }
   public List<WebElement> getPaymentreceiptno() {
		return Paymentreceiptno;
	}
   public List<WebElement> getEditpay() {
		return Editpayment;
	}
}
