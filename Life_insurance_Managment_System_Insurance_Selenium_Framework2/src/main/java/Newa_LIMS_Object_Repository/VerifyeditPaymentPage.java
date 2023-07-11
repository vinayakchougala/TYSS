package Newa_LIMS_Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyeditPaymentPage {
	/* declaration */
	@FindBy(xpath = "//div[@class='col-md-12']")
	private WebElement editpaymsg;

	/* Initialisation */
	public VerifyeditPaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/* Business Libraries */
	public String editpaymt() {
		return editpaymsg.getText();
	}

}
