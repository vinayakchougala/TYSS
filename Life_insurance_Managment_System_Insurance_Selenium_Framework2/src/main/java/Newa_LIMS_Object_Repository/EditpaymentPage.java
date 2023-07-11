package Newa_LIMS_Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditpaymentPage 
{
	/* Declaration */
	@FindBy(name ="amount")
	private WebElement amountTxtFld;
	
	@FindBy(xpath ="//input[@value='UPDATE']")
	private WebElement updatebtn;

/*initialsation*/
public EditpaymentPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);

}
/*Business Libraries*/
public void Amonttext()
{
	amountTxtFld.clear();
}
public void Amonttext1(String amount)
{
	amountTxtFld.sendKeys(amount);
}
public void Aupdatebutton()
{
	updatebtn.click();
}
}


