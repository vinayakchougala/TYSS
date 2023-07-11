package Newa_LIMS_Object_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyNomineePage 
{
	/*Declaration*/
   @FindBy(xpath="//div[@class='col-md-12']")
   private WebElement Nomineeaddedtext;
   
   @FindBy(xpath="//table[@class='table']//tr[*]//td[1]")
   private  List<WebElement> nomineeid;
   
   /*Initialisation*/   
   public VerifyNomineePage (WebDriver driver)
   {
	   PageFactory.initElements(driver,this);	   
   }
   /*Utilisation*/

public WebElement getNomineeaddedtext() 
{
	return Nomineeaddedtext;
}

/*Business Libraries*/
	/**
	 * get the created Added Nominee and verify
	 */
	
public String verifynominee()
{
      return Nomineeaddedtext.getText();
}

/*	public List<WebElement> getNomineeid() {
		
		return nomineeid;
	}*/
/*public void Nomineeid(String Exp_Nomineeid)
{
	String Act_Nomineeid="";
	for (WebElement we : nomineeid) {
		Act_Nomineeid = we.getAttribute("innerHTML");
		if (Act_Nomineeid.contains(Exp_Nomineeid))

		{
			System.out.println(Exp_Nomineeid + "Nominee ID is Verified & Displayed in nominee table----->Pass");
		
		 break;
		}
		else
		{
			System.out.println(Exp_Nomineeid + "Nominee ID is not Verified & is not Displayed in nominee table----->Fail");
		}*/
		  public List<WebElement>Nomineeid()
		  {
				return nomineeid;
}
}

