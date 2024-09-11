package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagePaiementDone {

public WebDriver driver;

// constructeur
public PagePaiementDone (WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
}

// identification des elements
@FindBy(how = How.XPATH, using = "//h2[@qata-qa='order-placed']//b")
WebElement txt_order_placed;

@FindBy(how = How.XPATH, using = "//a[@class='btn btn-default check_out']")
WebElement bt_download_invoice;

// creation des methodes

public String txt_order_obtenu() {
String txt_order_obtenu = txt_order_placed.getText();
return txt_order_obtenu;
}

public void cliquer_sur_le_bouton_download_invoice() {
bt_download_invoice.click();
}

}