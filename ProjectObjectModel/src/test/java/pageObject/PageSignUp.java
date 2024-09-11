package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageSignUp {

	public WebDriver driver;

	// constructeur

	public PageSignUp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// identification des elements

	@FindBy(how = How.XPATH, using = "//input[@data-qa='login-email']")
	WebElement txt_email;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	WebElement txt_mdp;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Login']")
	WebElement bt_login;

	// creation des methodes

	public void ecrire_dans_champ_mail(String txt) {
		txt_email.sendKeys(txt);

	}

	public void ecrire_dans_champ_password(String txt) {
		txt_mdp.sendKeys(txt);

	}

	public void cliquer_sur_le_bouton_login() {
		bt_login.click();

	}

}