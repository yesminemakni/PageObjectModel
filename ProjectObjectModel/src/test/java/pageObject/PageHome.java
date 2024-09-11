package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageHome {

	public WebDriver driver;
    //constructeur

	public PageHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

    //identification des elements

	@FindBy(how = How.XPATH, using = "//a[text()=' Signup / Login']")
	WebElement bt_signUp_login;

	@FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']//li//a//b")
	WebElement txt_profil;
	
	@FindBy(how = How.XPATH, using = "//a[@href='/products']")
	WebElement bt_Product;

    //creation des methodes
	public void demarrerURL(String txt) {
		driver.get(txt);
	}

	public void cliquer_sur_le_bouton_signup_login() {
		bt_signUp_login.click();
	}

	public String profil_obtenu() {
		String txt_profil_obtenu = txt_profil.getText();
		return txt_profil_obtenu;
	}
	
	public void cliquer_sur_le_bouton_product(){
		bt_Product.click();
	}

}