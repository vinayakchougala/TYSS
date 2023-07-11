package Newa_LIMS_Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNomineePage 
{
	/*Declaration*/
    @FindBy(name="client_id")
    private WebElement ClientIDTxtFild;
    
    @FindBy(name="name")
    private WebElement ClientNameTxtFild;
    
    @FindBy(name="sex")
    private WebElement ClientSexTxtFld;
    
    @FindBy(name="birth_date")
    private WebElement ClientibIdatTxtFild;
    
    @FindBy(name="nid")
    private WebElement ClientniTxtFld;
    
    @FindBy(name="relationship")
    private WebElement ClientrelTxtFld;
    
    @FindBy(name="priority")
    private WebElement ClientprTxtFld;
    
    @FindBy(name="phone")
    private WebElement ClientphoneTxtFld;
    
    @FindBy(xpath="//input[@type='submit']")
    private WebElement SubmitBtn;
    
    @FindBy(xpath="//input[@name='nominee_id']")
    private WebElement nomineeidautomsg;
    
    
   /*Initialisation*/
    public  CreateNomineePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    /*Utilisation*/

	public WebElement getClientidTxtFild() {
		return ClientIDTxtFild;
	}

	public WebElement getClientNameTxtFild() {
		return ClientNameTxtFild;
	}

	public WebElement getClientSexTxtFld() {
		return ClientSexTxtFld;
	}

	public WebElement getClientibIdatTxtFild() {
		return ClientibIdatTxtFild;
	}

	public WebElement getClientniTxtFld() {
		return ClientniTxtFld;
	}

	public WebElement getClientrelTxtFld() {
		return ClientrelTxtFld;
	}

	public WebElement getClientprTxtFld() {
		return ClientprTxtFld;
	}

	public WebElement getClientphoneTxtFld() {
		return ClientphoneTxtFld;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
    /*Business Libraries*/
	
	public void Nominee(String client_id,String clientname,String gender, String birth_date, String nationalid, String relationship, String priority, String phone_Number )
	{
		ClientIDTxtFild.sendKeys(client_id);
		ClientNameTxtFild.sendKeys(clientname);
		ClientSexTxtFld.sendKeys(gender);
		ClientibIdatTxtFild.sendKeys(birth_date);
		ClientniTxtFld.sendKeys(nationalid);
		ClientrelTxtFld.sendKeys(relationship);
		ClientprTxtFld.sendKeys(priority);
		ClientphoneTxtFld.sendKeys(phone_Number);
		SubmitBtn.click();
		
	}
	
	public String NomineeAutoid()
	{
		return nomineeidautomsg.getAttribute("value");
	}

    
}
