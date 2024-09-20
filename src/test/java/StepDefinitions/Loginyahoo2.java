package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.LoginPage;

public class Loginyahoo2 {
    WebDriver driver = Hooks.driver;
    @Given("je me connecte à yahoo")
    public void je_me_connecte_à_yahoo() {
        driver.get("https://login.yahoo.com/?.intl=fr&.lang=fr-FR&src=ym&activity=mail-direct&pspid=159600001&done=https%3A%2F%2Ffr.mail.yahoo.com%2Fd&add=1");

    }
    @When("je rentre des identifiants valides <username> ET <Password>")
    public void je_rentre_des_identifiants_valides_username_et_password() {
        String username="mutuelleahlemauto@yahoo.com";
        String Password="Talantalan12345@@@@";
    LoginPage login = new LoginPage(driver);
        login.enterUsername(username);
        login.clicksuivant();
        login.enterPassword(Password);
        login.clicksuivant();
    }
    @Then("la boite yahoo souvre")
    public void la_boite_yahoo_souvre() {

    }


}
