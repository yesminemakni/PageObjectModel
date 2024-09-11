package stepDefinition;

import org.openqa.selenium.WebDriver;

import hooks.SetUp;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObject.PageHome;
import pageObject.PageProduct;
import pageObject.PageSignUp;


public class AddProductInCart {
	
	public static WebDriver driver = SetUp.driver;

	PageHome home = new PageHome(driver);
	PageProduct Product = new PageProduct(driver);
	

	@Given("cliquer sur le bouton Products")
	public void cliquer_sur_le_bouton_products() {
		home.cliquer_sur_le_bouton_product();
	    
	}

	@When("survoler sur le premier produit et cliquer sur add to product")
	public void survoler_sur_le_premier_produit_et_cliquer_sur_add_to_product() {
		
	    Product.cliquer_sur_bt_add_to_cart();
	}

	@When("cliquer sur continue shopping")
	public void cliquer_sur_continue_shopping() {
		
		Product.cliquer_sur_bt_continuer();
	   
	}

	@When("survoler sur le deuxieme produit et cliquer sur add to product")
	public void survoler_sur_le_deuxieme_produit_et_cliquer_sur_add_to_product() {
		
		Product.cliquer_sur_bt_add_to_cart1();
	    
	}

	@When("cliquer sur view cart button")
	public void cliquer_sur_view_cart_button() {
	    
		Product.cliquer_sur_bt_view_cart();
	}

	@Then("verifier les deux produits ajoutées to cart")
	public void verifier_les_deux_produits_ajoutées_to_cart() {
	    
	}

	@Then("verifier leurs prix, quantités et prix totals")
	public void verifier_leurs_prix_quantités_et_prix_totals() {
	   
		
	}

}
