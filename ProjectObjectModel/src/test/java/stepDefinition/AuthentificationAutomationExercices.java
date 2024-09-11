package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import hooks.SetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.PageHome;
import pageObject.PageSignUp;

public class AuthentificationAutomationExercices {

	public static WebDriver driver = SetUp.driver;

	PageHome home = new PageHome(driver);
	PageSignUp SignUp = new PageSignUp(driver);

	@Given("Saisir l URL suivant {string}")

	public void saisir_l_url_suivant(String string) {
		home.demarrerURL(string);

	}

	@When("choisir signup login")

	public void choisir_signup_login() {
		home.cliquer_sur_le_bouton_signup_login();

	}

	@When("saisir adresse mail {string} et le mot de passe {string}")

	public void saisir_adresse_mail_et_le_mot_de_passe(String string, String string2) {
		SignUp.ecrire_dans_champ_mail(string);
		SignUp.ecrire_dans_champ_password(string2);

	}

	@When("cliquer sur le bouton login")

	public void cliquer_sur_le_bouton_login() {
		SignUp.cliquer_sur_le_bouton_login();

	}

	@Then("verifier le nom du profil affiché {string}")

	public void verifier_le_nom_du_profil_affiché(String string) {
		Assert.assertEquals(string, home.profil_obtenu());

	}

}