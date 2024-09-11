package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagePaiement {
	public WebDriver driver;

// constructeur
	public PagePaiement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

// identification des elements
	@FindBy(how = How.NAME, using = "name_on_card")
	WebElement txt_name_on_card;

	@FindBy(how = How.NAME, using = "card_number")
	WebElement txt_card_number;

	@FindBy(how = How.NAME, using = "cvc")
	WebElement txt_code_cvc;

	@FindBy(how = How.NAME, using = "expiry_month")
	WebElement txt_mois_expiration;

	@FindBy(how = How.NAME, using = "expiry_year")
	WebElement txt_année_expiration;

	@FindBy(how = How.ID, using = "submit")
	WebElement bt_pay_and_confirm_order;

//creation des methodes
	public void saisir_txt_name_on_card(String txt) {
		txt_name_on_card.sendKeys(txt);
	}

	public void saisir_txt_card_number(String txt) {
		txt_card_number.sendKeys(txt);
	}

	public void saisir_txt_code_cvc(String txt) {
		txt_code_cvc.sendKeys(txt);
	}

	public void saisir_txt_mois_expiration(String txt) {
		txt_mois_expiration.sendKeys(txt);
	}

	public void saisir_txt_année_expiration(String txt) {
		txt_année_expiration.sendKeys(txt);
	}

	public void cliquer_sur_le_bouton_pay_and_confirm_order() {
		bt_pay_and_confirm_order.click();
	}
}