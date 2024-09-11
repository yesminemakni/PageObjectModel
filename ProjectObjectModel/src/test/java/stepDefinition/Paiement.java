package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.*;
import pageObject.PageCart;
import pageObject.PageCheckOut;
import pageObject.PagePaiement;
import pageObject.PagePaiementDone;

public class Paiement {
	
	public static WebDriver driver = SetUp.driver;
	
	PageCart cart = new PageCart(driver);
	PageCheckOut checkout = new PageCheckOut(driver); 
	PagePaiement paiement = new PagePaiement(driver); 
	PagePaiementDone paiementdone = new PagePaiementDone(driver); 

	@Given("cliquer sur le bouton Procced to checkout")
	public void cliquer_sur_le_bouton_procced_to_checkout() {
		cart.cliquer_sur_le_bouton_proceed_to_checkout();
		
	    
	}

	@Given("cliquer sur le bouton place order")
	public void cliquer_sur_le_bouton_place_order() {
	   checkout.cliquer_sur_le_bouton_place_order();
	}

	@When("saisir le nom du carte {string}")
	public void saisir_le_nom_du_carte(String string) {
		paiement.saisir_txt_name_on_card(string);
		
		
	    
	}

	@When("saisir le numero du carte {string}")
	public void saisir_le_numero_du_carte(String string) {
		paiement.saisir_txt_card_number(string);

	    
	}

	@When("saisir le code CVC {string}")
	public void saisir_le_code_cvc(String string) {
		paiement.saisir_txt_code_cvc(string);
	}

	@When("saisir date Expiration {string} et {string}")
	public void saisir_date_expiration_et(String string, String string2) {
		paiement.saisir_txt_mois_expiration(string);
		paiement.saisir_txt_année_expiration(string2);
	}

	@When("appuyer sur le bouton pay and confirm order")
	public void appuyer_sur_le_bouton_pay_and_confirm_order() {
		paiement.cliquer_sur_le_bouton_pay_and_confirm_order();
	    
	}

	@Then("verifier confirmation de la demande {string}")
	public void verifier_confirmation_de_la_demande(String string) {
    Assert.assertEquals(string, paiementdone.txt_order_obtenu());
	}

	@Then("telecharger le fichier invoice")
	public void telecharger_le_fichier_invoice() {
	    paiementdone.cliquer_sur_le_bouton_download_invoice();
	}

}
