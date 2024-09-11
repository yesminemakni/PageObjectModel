package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageCheckOut {

	public WebDriver driver;
    //constructeur

	public PageCheckOut(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

    //identification des elements

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Place Order']")
	WebElement bt_place_order;
	
	//creation des methodes
	
	public void cliquer_sur_le_bouton_place_order (){
	bt_place_order.click();
	}
}

	