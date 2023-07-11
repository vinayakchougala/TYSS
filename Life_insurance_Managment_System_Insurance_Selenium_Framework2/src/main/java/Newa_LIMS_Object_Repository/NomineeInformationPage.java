package Newa_LIMS_Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NomineeInformationPage {
	/* Declaration */
	@FindBy(xpath = "//a[@href='addNominee.php']")
	private WebElement AddNomineebtn;

	/* Initialisation */
	public NomineeInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/* Utilisation */

	public WebElement getAddNomineebtn() {
		return AddNomineebtn;
	}

	/* Business Libraries */
	public void addnomineebtn() {
		AddNomineebtn.click();

	}
}
