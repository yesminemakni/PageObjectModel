package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageProduct {

	public WebDriver driver;
    //constructeur

	public PageProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

    //identification des elements

	@FindBy(how = How.XPATH , using = "//a[@data-product-id='1']")
	WebElement bt_add_to_cart;

	@FindBy(how = How.XPATH , using = "//button[@class='btn btn-success close-modal btn-block']")
	WebElement bt_continuer;
	
	
	@FindBy(how = How.XPATH , using = "//a[@data-product-id='6']")
	WebElement bt_add_to_cart1;
	
	
	@FindBy(how = How.XPATH , using = "//u[normalize-space()='View Cart']")
	WebElement bt_view_cart;
	
	//creation des methodes
	
	public void cliquer_sur_bt_add_to_cart(){
		bt_add_to_cart.click();
	}
	
	public void cliquer_sur_bt_continuer(){
		bt_continuer.click();
	}
	
	public void cliquer_sur_bt_add_to_cart1(){
		bt_add_to_cart1.click();
	}
	
	public void cliquer_sur_bt_view_cart(){
		bt_view_cart.click();
	}

}
