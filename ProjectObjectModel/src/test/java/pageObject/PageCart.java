package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageCart {

	public WebDriver driver;
    //constructeur

	public PageCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

    //identification des elements

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Proceed To Checkout']")
	WebElement bt_proceed_to_checkout;
	
	//creation des methodes
	
	public void cliquer_sur_le_bouton_proceed_to_checkout () {
		bt_proceed_to_checkout.click();
	}
}

	